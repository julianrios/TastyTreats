package com.julianrios.RecipeApplication.repositories;

import com.julianrios.RecipeApplication.entities.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository <Profile, Integer> {
}
