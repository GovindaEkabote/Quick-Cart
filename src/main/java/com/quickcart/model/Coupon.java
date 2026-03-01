package com.quickcart.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String code;
    private double discountPrecentage;
    private LocalDate validityStartDate;
    private  LocalDate validityEndDate;
    private  double mininumOrderValue;
    private  boolean isActive = true;

    @ManyToMany(mappedBy = "useCoupone")
    private Set<User> usedByUser = new HashSet<>();

}
