package com.example.motogp.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.motogp.Calendar.Calendar;
import com.example.motogp.Calendar.CalendarService;

import jakarta.annotation.PostConstruct;
import java.util.List;

@Controller
@RequestMapping("/results")
public class ResultController implements ErrorController {

    @Autowired
    private ResultService resultService;

        @Autowired
    private CalendarService calendarService;

    @PostConstruct
    public void init() {
        // Hiển thị dữ liệu ra terminal
        resultService.getAllResults().forEach(result -> {
            System.out.println("Result ID: " + result.getId() + 
                               ", Rider: " + result.getRider().getName() + 
                               ", Event: " + result.getCalendar().getEventName() + 
                               ", Time Gap: " + result.getTimeGap());
        });
    }

    @GetMapping
    public String showResults(Model model) {
        try {
            List<Result> results = resultService.getAllResults(); // Lấy danh sách kết quả từ service
            System.out.println("Results: " + results);
            model.addAttribute("results", results); // Thêm danh sách kết quả vào mô hình
            
            // Lấy danh sách các sự kiện từ CalendarService
            List<Calendar> calendars = calendarService.getAllCalendars(); // Giả sử có phương thức này trong CalendarService
            model.addAttribute("calendars", calendars); // Thêm danh sách sự kiện vào mô hình
        } catch (Exception e) {
            e.printStackTrace(); // In ra lỗi nếu có
        }
        return "results"; // Trả về tên file HTML
    }

}