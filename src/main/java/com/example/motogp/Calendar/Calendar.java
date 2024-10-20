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

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((eventName == null) ? 0 : eventName.hashCode());
        result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
        result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
        result = prime * result + ((circuit == null) ? 0 : circuit.hashCode());
        result = prime * result + ((sponsor == null) ? 0 : sponsor.hashCode());
        result = prime * result + ((img_link == null) ? 0 : img_link.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Calendar other = (Calendar) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (eventName == null) {
            if (other.eventName != null)
                return false;
        } else if (!eventName.equals(other.eventName))
            return false;
        if (startDate == null) {
            if (other.startDate != null)
                return false;
        } else if (!startDate.equals(other.startDate))
            return false;
        if (endDate == null) {
            if (other.endDate != null)
                return false;
        } else if (!endDate.equals(other.endDate))
            return false;
        if (circuit == null) {
            if (other.circuit != null)
                return false;
        } else if (!circuit.equals(other.circuit))
            return false;
        if (sponsor == null) {
            if (other.sponsor != null)
                return false;
        } else if (!sponsor.equals(other.sponsor))
            return false;
        if (img_link == null) {
            if (other.img_link != null)
                return false;
        } else if (!img_link.equals(other.img_link))
            return false;
        return true;
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