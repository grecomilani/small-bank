package com.sample.smallbank.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "customers")
@Getter
@Setter
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long customerId;

    @Column(length = 50,nullable = false,unique = true)
    private String email;

    @Column(nullable = false)
    private String pwd;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "customer_roles",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<RoleEntity> roles;
}