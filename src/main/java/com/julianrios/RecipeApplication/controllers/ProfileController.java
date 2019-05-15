package com.julianrios.RecipeApplication.controllers;

import com.julianrios.RecipeApplication.entities.Profile;
import com.julianrios.RecipeApplication.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profiles")
public class ProfileController {

    @Autowired
    ProfileService service;

    @PostMapping()
    public ResponseEntity<Profile> createProfile(@RequestBody Profile profile) {
        return new ResponseEntity(service.createProfile(profile), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Profile> getProfile(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(service.getProfile(id));
    }

    @GetMapping("/allProfiles")
    public ResponseEntity<List> getAllProfiles() {
        return ResponseEntity.ok(service.getAllProfiles());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteProfile(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(service.deleteProfile(id));
    }

    @DeleteMapping("/allProfiles")
    public ResponseEntity<Boolean> deleteAllProfiles() {
        return ResponseEntity.ok(service.deleteAllProfiles());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Profile> updateProfile(@PathVariable("id") Integer id, @RequestBody Profile profile) {
        return new ResponseEntity(service.updateProfile(id, profile), HttpStatus.OK);
    }
}
