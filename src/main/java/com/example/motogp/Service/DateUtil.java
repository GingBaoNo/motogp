package com.example.motogp.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Service;

@Service
public class DateUtil {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");

    // Phương thức formatDateRange
    public String formatDateRange(LocalDateTime startDate, LocalDateTime endDate) {
        if (startDate == null || endDate == null) {
            return "Invalid date range"; // Xử lý trường hợp null
        }
        return formatter.format(startDate) + " - " + formatter.format(endDate);
    }
}