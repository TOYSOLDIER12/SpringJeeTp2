package com.example.view.dao.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id ;
    private String designation;
    private float prix;

}
