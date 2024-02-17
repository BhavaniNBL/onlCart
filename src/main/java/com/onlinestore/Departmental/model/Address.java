package com.onlinestore.Departmental.model;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "addresses")
@Access(AccessType.FIELD)
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "zipcode")
    private String zipcode;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    @Column(name = "apt_no")
    private String aptNo;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    public Address(String zipcode, String city, String state, String country, String aptNo) {
        this.zipcode = zipcode;
        this.city = city;
        this.state = state;
        this.country = country;
        this.aptNo = aptNo;
    }

    // Other constructors, getters, setters, and methods can be added as needed
}

