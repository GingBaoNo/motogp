package com.example.motogp.Standing;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.annotation.PostConstruct;

@Controller
@RequestMapping("/")
public class StandingController implements ErrorController {

    @Autowired
    private StandingService standingService;

    @PostConstruct
    public void init() {
        // Hiển thị dữ liệu ra terminal
        standingService.getAllPoints().forEach(standing -> {
            System.out.println("ID: " + standing.getId() + ", Rider ID: " + standing.getRider().getId() + 
                               ", Points: " + standing.getPoint());
        });
    }

@GetMapping("/standing")
public String showPoints(Model model) {
    try {
        List<Standing> standingList = standingService.getAllPoints(); // Lấy danh sách điểm từ service
        
        // Sắp xếp danh sách theo điểm từ cao xuống thấp
        Collections.sort(standingList, (s1, s2) -> s2.getPoint().compareTo(s1.getPoint()));

        // Tạo danh sách xếp hạng
        List<StandingDTO> rankedList = IntStream.range(0, standingList.size())
            .mapToObj(i -> {
                Standing standing = standingList.get(i);
                return new StandingDTO(standing, i + 1); // Tạo DTO với thứ tự
            })
            .collect(Collectors.toList());

        System.out.println("Standings: " + rankedList);
        model.addAttribute("points", rankedList); // Thêm danh sách DTO vào mô hình
    } catch (Exception e) {
        e.printStackTrace();
    }
    return "standing"; // Trả về tên file HTML
}
}