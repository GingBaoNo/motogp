package com.example.motogp.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CalendarService {

    @Autowired
    private CalendarRepository calendarRepository; // Giả sử bạn có một repository để tương tác với cơ sở dữ liệu

    public List<Calendar> getAllCalendars() {
        List<Calendar> calendars = calendarRepository.findAll();
        System.out.println("Retrieved calendars: " + calendars); // In ra danh sách lịch
        return calendars;
    }
}