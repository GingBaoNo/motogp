package com.example.motogp.Controller; // Chú ý chữ thường

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.motogp.Service.MotoGPService;


@RestController
public class MotoGPController {
    // @Autowired
    // private MotoGPService motoGPService;

    // @GetMapping("/teams")
    // public List<com.example.motogp.Team.Team> getTeams() {
    //     return motoGPService.getAllTeams();
    // }

    // @GetMapping("/riders") // Giữ nguyên vì không trùng
    // public List<com.example.motogp.Rider.Rider> getRiders() {
    //     return motoGPService.getAllRiders();
    // }
}