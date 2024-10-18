package com.example.motogp.Rider;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RiderRepository extends JpaRepository<Rider, Integer> {
    // Tìm kiếm rider theo tên
    List<Rider> findByName(String name);
    
    // Tìm kiếm rider theo quốc gia
    List<Rider> findByCountry(String country);
    
    // Tìm kiếm rider theo team
    List<Rider> findByTeamId(Integer teamId);
    
    // Tìm kiếm rider theo số xe
    List<Rider> findByRiderNumber(Integer riderNumber);
}