package com.onlinestore.Departmental.model;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "User")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false)
    private String firstName, lastName, mailingAddress, emailAddress, userName, password;

    // One User can have Many Addresses
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Address> addresses;

    @OneToMany(cascade = CascadeType.ALL)
    private List<CardEntity> cards;
}
