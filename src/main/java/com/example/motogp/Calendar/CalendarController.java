package com.example.motogp.Calendar;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.annotation.PostConstruct;

@Controller
@RequestMapping("/")
public class CalendarController implements ErrorController {

    @Autowired
    private CalendarService calendarService;

    @PostConstruct
    public void init() {
        // Hiển thị dữ liệu lịch ra terminal
        calendarService.getAllCalendars().forEach(calendar -> {
            System.out.println("Calendar ID: " + calendar.getId() + ", Name: " + calendar.getEventName() + ", Start Date: " + calendar.getStartDate() +", image link: " + calendar.getImg_link());
        });
    }

    @GetMapping("/calendar")
    public String showCalendars(Model model) {
        try {
            List<Calendar> calendars = calendarService.getAllCalendars(); // Lấy danh sách lịch từ service
            System.out.println("Number of calendars: " + calendars.size()); // Kiểm tra số lượng lịch
            System.out.println("Retrieved calendars: " + calendars); // In ra danh sách lịch
    
            Map<String, List<Calendar>> calendarsByMonth = new HashMap<>();
    
            for (Calendar calendar : calendars) {
                String month = calendar.getStartDate().getMonth().name(); // Lấy tên tháng
                calendarsByMonth.computeIfAbsent(month, k -> new ArrayList<>()).add(calendar);
            }
    
            System.out.println("Calendars by month: " + calendarsByMonth); // In ra lịch theo tháng
            model.addAttribute("calendarsByMonth", calendarsByMonth); // Thêm danh sách lịch theo tháng vào mô hình
        } catch (Exception e) {
            e.printStackTrace(); // Ghi lại ngoại lệ nếu có
        }
        return "calendar"; // Trả về tên file HTML
    }
}