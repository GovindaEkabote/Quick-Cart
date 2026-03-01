package com.quickcart.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.quickcart.domain.UserRole;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private  String password;
    private String email;
    private String fullName;
    private String mobile;
    private UserRole role=UserRole.ROLE_CUSTOMER;

    @OneToMany
    private Set<Address> addresses=new HashSet<>();

    @ManyToMany
    @JsonIgnore
    private Set<Coupon> useCoupone=new HashSet<>();





}
