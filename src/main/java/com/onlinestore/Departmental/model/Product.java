package com.onlinestore.Departmental.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productId")
    private Long productId;

    @Column(name = "productName", length = 100, nullable = false)
    private String productName;

    @Column(name = "price", precision = 10, nullable = false)
    private double price;

    @Column(name = "brandName", length = 50)
    private String brandName;

    @Column(name = "availability", nullable = false)
    private int availability;

    @Column(name = "departmentId")
    private Long departmentId;

    @Column(name = "subcategoryId")
    private Long subcategoryId;

    // Constructors, getters, setters, and other methods
}
