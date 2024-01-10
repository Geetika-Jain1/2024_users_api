package com.example._users_api.controllers;

import org.springframework.web.bind.annotation.*;


@RestController
public class NamesController {

    @GetMapping("/names")
    public String getName(){    //hämta ett namn eller en användare
        return "Your name is Geetika....";
    }

    @PostMapping("/names")
    public String postName(@RequestBody String name){     //Skapa ett namn eller en användare
        return "Posting your name: " + name;
    }

    @PutMapping("/names")
    public String putName(){   // Uppdatera befintligt namn/ användare
        return "Updating your name!";
    }

    @DeleteMapping("/names")
    public String deleteName(){    // Ta bort en  befintligt namn/ användare
        return  "Deleting your name!";
    }
}
