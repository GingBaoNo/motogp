package com.example.motogp.Result;

import com.example.motogp.Rider.Rider;
import com.example.motogp.Calendar.Calendar;

import jakarta.persistence.*;

@Entity
@Table(name = "result")
public class Result {
    @Id
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "rider_id", nullable = false)
    private Rider rider;

    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
    private Calendar calendar;

    @Column(name = "time_gap", nullable = false)
    private String timeGap; // Sử dụng String

    public Result() {
    }

    public Result(Integer id, Rider rider, Calendar calendar, String timeGap) {
        this.id = id;
        this.rider = rider;
        this.calendar = calendar;
        this.timeGap = timeGap;
    }

    // Getter và Setter...

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

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public String getTimeGap() {
        return timeGap;
    }

    public void setTimeGap(String timeGap) {
        this.timeGap = timeGap;
    }

    @Override
    public String toString() {
        return "Result [id=" + id + ", rider=" + rider.getName() + ", calendar=" + calendar.getEventName() + ", timeGap=" + timeGap + "]";
    }
}