package com.onlinestore.Departmental.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "departmentId")
    private Long departmentId;

    @Column(name = "departmentName", length = 50, nullable = false)
    private String departmentName;

    // Constructors, getters, setters, and other methods
}
