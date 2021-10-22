package com.eleks.academy.pharmagator.entities;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PriceId implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pharmacyId;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long medicineId;
}
