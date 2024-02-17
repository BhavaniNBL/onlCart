package com.onlinestore.Departmental.dto;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
public class UserDTO {
    private Long userId;
    private String firstName;
    private String lastName;
    private String mailingAddress;
    private String emailAddress;
    private String userName;
    private String password;
    private List<AddressDTO> addresses;
    private List<CardEntityDTO> cards;
}
