package com.example.motogp.Standing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StandingService {

    @Autowired
    private StandingRepository standingRepository; // Đổi tên biến cho rõ ràng

    public List<Standing> getAllPoints() {
        return standingRepository.findAll(); // Trả về danh sách điểm
    }
}