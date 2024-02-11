package com.onlinestore.Departmental.model;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "Card")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cardId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private UserEntity user;

    @Column(nullable = false)
    private String cardNumber, cardHolderName, expirationDate, cvv;


    // Other card attributes and getters/setters
}

