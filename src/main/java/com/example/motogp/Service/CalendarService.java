package com.example.motogp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.motogp.Calendar.Calendar;
import com.example.motogp.Calendar.CalendarRepository;

import java.util.List;

@Service
public class CalendarService {

    @Autowired
    private CalendarRepository calendarRepository;

    public List<Calendar> getAllCalendars() {
        List<Calendar> calendars = calendarRepository.findAll();
        System.out.println("Retrieved calendars: " + calendars); // In ra danh sách lịch
        return calendars;
    }

    public Calendar getCalendarById(Integer id) {
        return calendarRepository.findById(id).orElse(null);
    }

    public Calendar createCalendar(Calendar calendar) {
        return calendarRepository.save(calendar);
    }

    public void deleteCalendar(Integer id) {
        calendarRepository.deleteById(id);
    }
}