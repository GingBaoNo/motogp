package com.example.motogp.Calendar;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

import org.hibernate.internal.util.collections.LinkedIdentityHashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.motogp.Service.DateUtil;

import jakarta.annotation.PostConstruct;

@Controller
@RequestMapping("/")
public class CalendarController implements ErrorController {

    @Autowired
    private CalendarService calendarService;

    @Autowired
    private DateUtil dateUtil; // Thêm dòng này

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
        List<Calendar> calendars = calendarService.getAllCalendars();

        // Sắp xếp danh sách theo ID
        calendars.sort((c1, c2) -> c1.getId().compareTo(c2.getId()));

        // Tạo danh sách các tháng theo thứ tự
        List<String> months = List.of("JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", 
        "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER");
        
        // Sử dụng Map để nhóm lịch theo tháng
        Map<Integer, List<Calendar>> calendarsByMonth = new HashMap<>();

        // Nhóm lịch theo chỉ số tháng
        for (Calendar calendar : calendars) {
            int monthIndex = calendar.getStartDate().getMonthValue(); // Lấy chỉ số tháng (1-12)
            calendarsByMonth.computeIfAbsent(monthIndex, k -> new ArrayList<>()).add(calendar);
        }

        // Tạo một Map để hiển thị theo tháng
        Map<String, List<Calendar>> sortedCalendarsByMonth = new LinkedIdentityHashMap<>();
        for (int i = 1; i <= 12; i++) {
            if (calendarsByMonth.containsKey(i)) {
                sortedCalendarsByMonth.put(months.get(i - 1), calendarsByMonth.get(i)); // Thêm tháng vào Map
            }
        }

        model.addAttribute("dateUtil", dateUtil);
        model.addAttribute("calendarsByMonth", sortedCalendarsByMonth);
    } catch (Exception e) {
        e.printStackTrace();
    }
    return "calendar"; // Trả về tên file HTML
}

}