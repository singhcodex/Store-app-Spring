package com.example.store.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Produkt {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer price;

    private ProduktSize size;


    @ManyToOne(targetEntity = Kategories.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "kategory_id")
    @JsonIgnore
    private Kategories kategory;



}
