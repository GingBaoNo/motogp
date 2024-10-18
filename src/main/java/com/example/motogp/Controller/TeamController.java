package com.example.motogp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.motogp.Team.Team;
import com.example.motogp.Service.TeamService;

import jakarta.annotation.PostConstruct;

@Controller
@RequestMapping("/")
public class TeamController implements ErrorController {

    @Autowired
    private TeamService teamService;

    @PostConstruct
    public void init() {
        // Hiển thị dữ liệu ra terminal
        teamService.getAllTeams().forEach(team -> {
            System.out.println("Team ID: " + team.getId() + ", Country: " + team.getCountry() + ", link_img: " + team.getTeam_img());
        });
    }

    @GetMapping("/teams")
    public String showTeams(Model model) {
        try {
            List<Team> teams = teamService.getAllTeams(); // Lấy danh sách đội từ service
            System.out.println("Teams: " + teams);
            model.addAttribute("teams", teams); // Thêm danh sách đội vào mô hình
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "teams"; // Trả về tên file HTML
    }
}