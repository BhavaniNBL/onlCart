package com.onlinestore.Departmental.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Rating")
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ratingId")
    private Long ratingId;

    @Column(name = "productId")
    private Long productId;

    @Column(name = "userId")
    private Long userId;

    @Column(name = "stars", nullable = false)
    private int stars;

    @Column(name = "comment", columnDefinition = "TEXT")
    private String comment;

    @Column(name = "ratingDate", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp ratingDate;

    // Constructors, getters, setters, and other methods
}
