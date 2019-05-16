package com.julianrios.RecipeApplication.services;

import com.julianrios.RecipeApplication.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository repo;




}
