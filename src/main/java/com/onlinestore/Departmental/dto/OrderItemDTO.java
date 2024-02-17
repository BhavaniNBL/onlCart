package com.onlinestore.Departmental.dto;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderItemDTO {
    private Long orderItemId;
    private Long orderId;
    private Long productId;
    private int quantity;
}
