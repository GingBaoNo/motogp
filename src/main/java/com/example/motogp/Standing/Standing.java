package com.example.motogp.Standing;

import com.example.motogp.Rider.Rider;
import com.example.motogp.Team.Team;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "standing")
public class Standing {
    
    @Id
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "rider_id", nullable = false)
    private Rider rider;

    @Column(name = "points")
    private Integer point;
    

    // Constructor không tham số
    public Standing() {
    }

    public Standing(Integer id, Rider rider, Integer point) {
        this.id = id;
        this.rider = rider;
        this.point = point;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Standing [id=" + id + ", rider=" + rider + ", point=" + point + "]";
    }
    
    public Team getTeam() {
        return rider.getTeam(); // Truy cập team thông qua đối tượng Rider
    }
    
}
