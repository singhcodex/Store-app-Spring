package com.example.store.controller;

import com.example.store.domain.Kategories;
import com.example.store.domain.Produkt;
import com.example.store.repository.KategoriesRepository;
import com.example.store.repository.ProduktRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/produkts")
public class ProduktController {

    @Autowired
    private ProduktRepository produktRepository;

    @Autowired
    private KategoriesRepository kategoriesRepository;

    @PostMapping
    public ResponseEntity<Produkt> createProdukt(@RequestBody Produkt produkt) {
        Produkt save = produktRepository.save(produkt);
        return ResponseEntity.ok(save);
    }

    @GetMapping("")
    public ResponseEntity<List<Produkt>> getAllProdukt(){
        List<Produkt> all = produktRepository.findAll();
        return ResponseEntity.ok(all);
    }


    @PutMapping("/produkt/{produktId}/kategory/{kategoryId}")
    public ResponseEntity<Produkt> addKategory(@PathVariable Long produktId,
                                               @PathVariable Long kategoryId)
    {
        Produkt produkt = produktRepository.findById(produktId).orElseThrow(RuntimeException::new);
        Kategories kategories = kategoriesRepository.findById(kategoryId).orElseThrow(RuntimeException::new);

        produkt.setKategory(kategories);
        Produkt save = produktRepository.save(produkt);
        return ResponseEntity.ok(save);
    }

//    @DeleteMapping
//    public ResponseEntity<Produkt> deleteById(Produkt produkt){
//        produktRepository.deleteById(produkt.getId());
//    }
}
