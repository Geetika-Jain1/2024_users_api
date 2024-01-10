package com.example._users_api.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class ConflictsController {

    @GetMapping("/conflicts")
    public String getConflicts(){
        return "Getting conflicts";
    }
    @PostMapping("/conflicts")
    public String postConflicts(){
        return "Posting conflicts";
    }
    @DeleteMapping("/conflicts")
    public String deletingonflicts(){
        return "Deleting conflicts";
    }
    @PutMapping("/conflicts")
    public String putConflicts(){
        return "Putting conflicts";
    }
}
