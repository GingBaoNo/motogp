package com.example.motogp.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

import com.example.motogp.Circuit.Circuit;

@Entity
@Table(name = "events")
public class Calendar {
    
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "event_name", nullable = false)
    private String eventName;

    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate;

    @Column(name = "end_date", nullable = false)
    private LocalDateTime endDate;

    @ManyToOne
    @JoinColumn(name = "circuit_id", nullable = false)
    private Circuit circuit;

    @Column(name = "sponsor")
    private String sponsor;

    @Column(name = "img_link")
    private String img_link;

    // No-argument constructor
    public Calendar() {
    }

    // Parameterized constructor
    public Calendar(Integer id, String eventName, LocalDateTime startDate, LocalDateTime endDate, Circuit circuit,
            String sponsor, String img_link) {
        this.id = id;
        this.eventName = eventName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.circuit = circuit;
        this.sponsor = sponsor;
        this.img_link = img_link;
    }

    @Override
    public String toString() {
        return "Calendar [id=" + id + ", eventName=" + eventName + ", startDate=" + startDate + ", endDate=" + endDate
                + ", circuit=" + circuit + ", sponsor=" + sponsor + ", img_link=" + img_link + "]";
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public Circuit getCircuit() {
        return circuit;
    }

    public void setCircuit(Circuit circuit) {
        this.circuit = circuit;
    }

    public String getImg_link() {
        return img_link;
    }

    public void setImg_link(String img_link) {
        this.img_link = img_link;
    }
}