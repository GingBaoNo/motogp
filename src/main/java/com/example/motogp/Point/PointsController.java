package com.example.motogp.Point;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.annotation.PostConstruct;

@Controller
@RequestMapping("/")
public class PointsController implements ErrorController {

    @Autowired
    private PointsService pointsService;

    @PostConstruct
    public void init() {
        // Hiển thị dữ liệu ra terminal
        pointsService.getAllPoints().forEach(point -> {
            System.out.println("Event ID: " + point.getId() + ", Rider ID: " + point.getRider().getId() + 
                               ", Points: " + point.getSum() + ", Sprint: " + point.getSprint() + 
                               ", Grand Prix: " + point.getGrandPrix());
        });
    }

    @GetMapping("/standing")
    public String showPoints(Model model) {
        try {
            List<Points> pointsList = pointsService.getAllPoints(); // Lấy danh sách điểm từ service
            System.out.println("Points: " + pointsList);
            model.addAttribute("points", pointsList); // Thêm danh sách điểm vào mô hình
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "standing"; // Trả về tên file HTML
    }
}
