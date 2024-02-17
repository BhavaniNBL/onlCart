package com.onlinestore.Departmental.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardEntityDTO {
    private Long cardId;
    private Long userId;
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private String cvv;
}
