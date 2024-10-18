package com.example.motogp.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.motogp.Rider.Rider;
import com.example.motogp.Rider.RiderRepository;
import com.example.motogp.Team.Team;
import com.example.motogp.Team.TeamRepository;

import java.util.List;

@Service
public class MotoGPService {

    @Autowired
    private RiderRepository riderRepository;

    @Autowired
    private TeamRepository teamRepository;

    public List<Rider> getAllRiders() {
        return riderRepository.findAll();
    }

    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }
}