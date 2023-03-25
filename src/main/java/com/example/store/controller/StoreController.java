package com.example.store.controller;

import com.example.store.domain.Store;
import com.example.store.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/stores")
public class StoreController {

    @Autowired
    private StoreRepository storeRepository;

    @PostMapping
    public ResponseEntity<Store> createStore(@RequestBody Store store){
        Store save = storeRepository.save(store);
        return ResponseEntity.ok(save);
    }

    @GetMapping("")
    public ResponseEntity<List<Store>> getAllStore(){
        List<Store> all = storeRepository.findAll();
        return ResponseEntity.ok(all);
    }
}
