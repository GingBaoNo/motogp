package com.example.motogp.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultService {

    @Autowired
    private ResultRepository resultRepository;

    // Lấy tất cả kết quả
    public List<Result> getAllResults() {
        return resultRepository.findAll();
    }

    // Lấy kết quả theo ID
    public Result getResultById(Integer id) {
        return resultRepository.findById(id).orElse(null);
    }
}