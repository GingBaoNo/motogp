package com.example.motogp.Team;

import com.example.motogp.Rider.Rider;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "teams")
public class Team {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "team_name")
    private String teamName;

    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "country")
    private String country;

    @Column(name = "manager")
    private String manager;

    @Column(name = "team_img")
    private String team_img;

    @OneToMany(mappedBy = "team") // Đặt quan hệ OneToMany với Rider
    private List<Rider> riders;

    public Team() {
    }

    

    public Team(Integer id, String teamName, String manufacturer, String country, String manager, String team_img,
            List<Rider> riders) {
        this.id = id;
        this.teamName = teamName;
        this.manufacturer = manufacturer;
        this.country = country;
        this.manager = manager;
        this.team_img = team_img;
        this.riders = riders;
    }



    public List<Rider> getRiders() {
        return riders;
    }

    public void setRiders(List<Rider> riders) {
        this.riders = riders;
    }



    public Integer getId() {
        return id;
    }



    public void setId(Integer id) {
        this.id = id;
    }



    public String getTeamName() {
        return teamName;
    }



    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }



    public String getManufacturer() {
        return manufacturer;
    }



    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }



    public String getCountry() {
        return country;
    }



    public void setCountry(String country) {
        this.country = country;
    }



    public String getManager() {
        return manager;
    }



    public void setManager(String manager) {
        this.manager = manager;
    }



    public String getTeam_img() {
        return team_img;
    }



    public void setTeam_img(String team_img) {
        this.team_img = team_img;
    }
}