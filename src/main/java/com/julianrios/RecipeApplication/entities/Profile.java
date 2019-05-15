package com.julianrios.RecipeApplication.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
@Data
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String userName;

    public Profile() {
    }

    public Profile(Integer id, String userName) {
        this.id = id;
        this.userName = userName;
    }
}
