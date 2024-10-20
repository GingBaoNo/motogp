package com.example.motogp.Point;

import com.example.motogp.Rider.Rider;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "points")
public class Points {
    
    @Id
    @Column(name = "event_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "rider_id", nullable = false)
    private Rider rider;

    @Column(name = "sum")
    private Integer sum;

    @Column(name = "sprint")
    private Integer sprint;

    @Column(name = "grand_prix")
    private String grandPrix;

    @Column(name = "time_gap")
    private String timeGap;  // Có thể là kiểu dữ liệu khác tùy vào cách bạn lưu trữ thời gian

    // Constructor không tham số
    public Points() {
    }

    // Constructor có tham số
    public Points(Integer id, Rider rider, Integer sum, Integer sprint, String grandPrix, String timeGap) {
        this.id = id;
        this.rider = rider;
        this.sum = sum;
        this.sprint = sprint;
        this.grandPrix = grandPrix;
        this.timeGap = timeGap;
    }

    // Getter và Setter
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

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Integer getSprint() {
        return sprint;
    }

    public void setSprint(Integer sprint) {
        this.sprint = sprint;
    }

    public String getGrandPrix() {
        return grandPrix;
    }

    public void setGrandPrix(String grandPrix) {
        this.grandPrix = grandPrix;
    }

    public String getTimeGap() {
        return timeGap;
    }

    public void setTimeGap(String timeGap) {
        this.timeGap = timeGap;
    }

    @Override
    public String toString() {
        return "Points [id=" + id + ", rider=" + rider + ", sum=" + sum + ", sprint=" + sprint + ", grandPrix=" + grandPrix + ", timeGap=" + timeGap + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Points points = (Points) o;
        return id.equals(points.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
