package com.example.motogp.Calendar;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarRepository extends JpaRepository<Calendar, Integer> {
    // Có thể thêm các phương thức tìm kiếm tùy chỉnh ở đây
}