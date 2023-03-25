package com.example.store.controller;

import com.example.store.domain.Kategories;
import com.example.store.repository.KategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/kategories")
public class KategoriesController {

    @Autowired
    private KategoriesRepository kategoriesRepository;

    @PostMapping
    public ResponseEntity<Kategories> createKategories(@RequestBody Kategories kategories){
        Kategories save = kategoriesRepository.save(kategories);
        return ResponseEntity.ok(save);
    }

    @GetMapping("")
    public ResponseEntity<List<Kategories>> getAllKategories(){
        List<Kategories> all = kategoriesRepository.findAll();
        return ResponseEntity.ok(all);
    }
}
