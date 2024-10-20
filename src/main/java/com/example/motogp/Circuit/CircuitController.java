package com.example.motogp.Circuit;

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
public class CircuitController implements ErrorController {

    @Autowired
    private CircuitService circuitService;

    @PostConstruct
    public void init() {
        // Hiển thị dữ liệu circuit ra terminal
        circuitService.getAllCircuits().forEach(circuit -> {
            System.out.println("Circuit ID: " + circuit.getId() + ", Name: " + circuit.getName() + ", Location: " + circuit.getLocation());
        });
    }

    @GetMapping("/circuits")
    public String showCircuits(Model model) {
        try {
            List<Circuit> circuits = circuitService.getAllCircuits(); // Lấy danh sách circuit từ service
            System.out.println("Circuits: " + circuits);
            model.addAttribute("circuits", circuits); // Thêm danh sách circuit vào mô hình
        } catch (Exception e) {
            e.printStackTrace(); // Ghi lại ngoại lệ nếu có
        }
        return "circuits"; // Trả về tên file HTML
    }
}