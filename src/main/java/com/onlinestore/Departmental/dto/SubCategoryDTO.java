package com.onlinestore.Departmental.dto;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SubCategoryDTO {
    private Long subcategoryId;
    private String subcategoryName;
    private Long departmentId;
}
