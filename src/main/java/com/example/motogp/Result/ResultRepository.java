package com.example.motogp.Result;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository extends JpaRepository<Result, Integer> {
    // Có thể thêm các phương thức tùy chỉnh nếu cần
}