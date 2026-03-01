package com.quickcart.model;

import com.quickcart.domain.AccountStatus;
import com.quickcart.domain.UserRole;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String sellerName;

    private String mobile;

    @Column(unique = true, nullable = false)
    private String email;
    private String password;

    @Embedded
    private BussinessDetails bussinessDetails = new BussinessDetails();

    @Embedded
    private BankDetails bankDetails = new BankDetails();

    @OneToOne(cascade = CascadeType.ALL)
    private Address pickAddress = new Address();

    private String GSTIN;

    private UserRole role=UserRole.ROLE_SELLER;

    private boolean isEmailVerified=false;

    private AccountStatus accountStatus =AccountStatus.PENDING_VERIFICATION;;



}
