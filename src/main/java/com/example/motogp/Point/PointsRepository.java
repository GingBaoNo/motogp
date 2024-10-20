package com.example.motogp.Point;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointsRepository extends JpaRepository<Points, Integer> {
    // Bạn có thể thêm các phương thức truy vấn tùy chỉnh ở đây nếu cần

    // Ví dụ: Tìm điểm của một rider theo rider_id
    List<Points> findByRiderId(Integer riderId);

    // Ví dụ: Tìm điểm theo grand prix
    List<Points> findByGrandPrix(String grandPrix);
}
