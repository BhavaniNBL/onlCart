package com.onlinestore.Departmental.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO {
    private Long id;
    private String zipcode;
    private String city;
    private String state;
    private String country;
    private String aptNo;
    private Long userId;
}
