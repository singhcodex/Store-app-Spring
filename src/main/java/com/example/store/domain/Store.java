package com.example.store.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

@Entity
@Table
@Data
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;
}
