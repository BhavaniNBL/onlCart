package com.onlinestore.Departmental.dto;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductDTO {
    private Long productId;
    private String productName;
    private double price;
    private String brandName;
    private int availability;
    private Long departmentId;
    private Long subcategoryId;
}
