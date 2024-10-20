package com.example.motogp.Rider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RiderService {

    @Autowired
    private RiderRepository riderRepository;

    // Lấy tất cả tay đua
    public List<Rider> getAllRiders() {
        return riderRepository.findAll();
    }

    // Lấy tay đua theo ID
    public Optional<Rider> getRiderById(Integer id) {
        return riderRepository.findById(id);
    }

    // Thêm tay đua mới
    public Rider addRider(Rider rider) {
        return riderRepository.save(rider);
    }

    // Cập nhật tay đua
    public Rider updateRider(Rider rider) {
        return riderRepository.save(rider);
    }

    // Xóa tay đua theo ID
    public void deleteRider(Integer id) {
        riderRepository.deleteById(id);
    }

    // Tìm kiếm tay đua theo tên
    public List<Rider> getRidersByName(String name) {
        return riderRepository.findByName(name);
    }

    // Tìm kiếm tay đua theo quốc gia
    public List<Rider> getRidersByCountry(String country) {
        return riderRepository.findByCountry(country);
    }

    // Tìm kiếm tay đua theo team ID
    public List<Rider> getRidersByTeamId(Integer teamId) {
        return riderRepository.findByTeamId(teamId);
    }

    // Tìm kiếm tay đua theo số xe
    public List<Rider> getRidersByNumber(Integer riderNumber) {
        return riderRepository.findByRiderNumber(riderNumber);
    }
}