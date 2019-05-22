package com.julianrios.RecipeApplication.services;

import com.julianrios.RecipeApplication.entities.Profile;
import com.julianrios.RecipeApplication.repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfileService {

    private ProfileRepository repo;

    @Autowired
    public ProfileService(ProfileRepository repo) {
        this.repo = repo;
    }

    public Profile createProfile(Profile profile) {
        return repo.save(profile);
    }

    public Profile updateProfile(Integer id, Profile updatedProfile) {
        Profile profile = repo.findById(id).get();
        profile.setUserName(updatedProfile.getUserName());

        return repo.save(profile);
    }

    public Profile getProfile(Integer id) {
        return repo.findById(id).get();
    }

    public List getAllProfiles() {
        return new ArrayList(repo.findAll());
    }

    public Boolean deleteProfile(Integer id) {
        repo.deleteById(id);
        return true;
    }

    public Boolean deleteAllProfiles() {
        repo.deleteAll();
        return true;
    }
}
