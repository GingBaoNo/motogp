package com.example.motogp.Rider;
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
public class RiderController implements ErrorController{

    @Autowired
    private RiderService riderService;

    @PostConstruct
    public void init() {
        // Hiển thị dữ liệu ra terminal
        riderService.getAllRiders().forEach(rider -> {
            System.out.println("Rider ID: " + rider.getId() + ", Name: " + rider.getName() + ", Country: " + rider.getCountry() +", flag: " + rider.getCountry_img());
        });
    }

    @GetMapping("/riders")
    public String showRiders(Model model) {
        try{
            List<Rider> riders = riderService.getAllRiders(); // Lấy danh sách tay đua từ service
            System.out.println("Riders: " + riders);
            model.addAttribute("riders", riders); // Thêm danh sách tay đua vào mô hình
             // Trả về tên file HTML
        }catch(Exception e){
            e.printStackTrace();
        }
        return "riders";
    }
    
}