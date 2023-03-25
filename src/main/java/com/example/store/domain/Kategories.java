package com.example.store.domain;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table
@Data
public class Kategories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", unique = true)
    @Nonnull
    private String name;

    @OneToMany(mappedBy = "kategory")
    private List<Produkt> produkts;


}
