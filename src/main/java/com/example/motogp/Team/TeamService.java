package com.example.motogp.Team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    // Lấy tất cả đội
    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    // Lấy đội theo tên
    public Optional<Team> getTeamByName(String teamName) {
        return teamRepository.findByTeamName(teamName);
    }
}