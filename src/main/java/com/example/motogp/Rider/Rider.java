package com.example.motogp.Rider;


import com.example.motogp.Team.Team;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "riders")
public class Rider {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;
    
    @Column(name = "country")
    private String country;

    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false)
    private Team team;

    @Column(name = "rider_number", nullable = false)
    private Integer riderNumber;

    @Column(name = "img_link")
    private String imgUrl;

    @Column(name = "country_image")
    private String country_img;

    
    public Rider() {
    }
    

    public Rider(Integer id, String name, String country, Team team, Integer riderNumber, String imgUrl,
            String country_img) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.team = team;
        this.riderNumber = riderNumber;
        this.imgUrl = imgUrl;
        this.country_img = country_img;
    }



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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Integer getRiderNumber() {
        return riderNumber;
    }

    public void setRiderNumber(Integer riderNumber) {
        this.riderNumber = riderNumber;
    }


    @Override
    public String toString() {
        return "Rider [id=" + id + ", name=" + name + ", country=" + country + ", team=" + team + ", riderNumber="
                + riderNumber + ", imgUrl=" + imgUrl + ", country_img=" + country_img + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rider rider = (Rider) o;
        return id.equals(rider.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getCountry_img() {
        return country_img;
    }

    public void setCountry_img(String country_img) {
        this.country_img = country_img;
    }
}
