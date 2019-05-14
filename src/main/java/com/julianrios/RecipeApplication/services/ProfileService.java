package com.julianrios.RecipeApplication.services;

import com.julianrios.RecipeApplication.entities.Profile;
import com.julianrios.RecipeApplication.repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository repo;

    public void createProfile(Profile profile) {
        repo.save(profile);
    }

    public Optional<Profile> getProfile(Long id) {
        return repo.findById(id);
    }
}
