package com.julianrios.RecipeApplication.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String profileName;

    @OneToMany(mappedBy = "profile_id", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Recipe> recipeBook = new ArrayList<>();

    public Profile() {
    }

    public Profile(Integer id, String profileName) {
        this.id = id;
        this.profileName = profileName;
    }
}
