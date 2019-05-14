package com.julianrios.RecipeApplication.controllers;

import com.julianrios.RecipeApplication.entities.Profile;
import com.julianrios.RecipeApplication.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/profiles")
public class ProfileController {

    @Autowired
    ProfileService service;

    @PostMapping()
    public ResponseEntity createProfile(@RequestBody Profile profile) {
        service.createProfile(profile);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional> getProfile(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.getProfile(id));
    }

    @GetMapping("/allProfiles")
    public ResponseEntity getAllProfiles() {
        return new ResponseEntity(service.getAllProfiles(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteProfile(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.deleteProfile(id));
    }
}
