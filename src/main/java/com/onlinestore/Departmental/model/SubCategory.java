package com.onlinestore.Departmental.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Subcategory")
public class SubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subcategoryId")
    private Long subcategoryId;

    @Column(name = "subcategoryName", length = 50, nullable = false)
    private String subcategoryName;

    @Column(name = "departmentId")
    private Long departmentId;

    // Constructors, getters, setters, and other methods
}

