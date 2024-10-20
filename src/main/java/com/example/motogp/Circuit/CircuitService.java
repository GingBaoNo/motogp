package com.example.motogp.Circuit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CircuitService {

    private final CircuitRepository circuitRepository;

    @Autowired
    public CircuitService(CircuitRepository circuitRepository) {
        this.circuitRepository = circuitRepository;
    }

    public List<Circuit> getAllCircuits() {
        return circuitRepository.findAll();
    }

    public Optional<Circuit> getCircuitById(Integer id) {
        return circuitRepository.findById(id);
    }
}