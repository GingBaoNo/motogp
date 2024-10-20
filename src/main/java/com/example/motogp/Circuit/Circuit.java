package com.example.motogp.Circuit;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "circuits")
public class Circuit {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name = "image_link")
    private String imageLink;  // Changed for naming convention

    public Circuit() {
        // No-argument constructor
    }

    public Circuit(Integer id, String name, String location, String imageLink) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.imageLink = imageLink;
    }

    @Override
    public String toString() {
        return "Circuit [id=" + id + ", name=" + name + ", location=" + location + ", imageLink=" + imageLink + "]";
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getImageLink() {  // Changed for naming convention
        return imageLink;
    }

    public void setImageLink(String imageLink) {  // Changed for naming convention
        this.imageLink = imageLink;
    }
}