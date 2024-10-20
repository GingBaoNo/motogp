package com.example.motogp.Point;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PointsService {

    @Autowired
    private PointsRepository pointsRepository; // Giả sử bạn có repository cho điểm

    public List<Points> getAllPoints() {
        return pointsRepository.findAll(); // Trả về danh sách điểm
    }
}
