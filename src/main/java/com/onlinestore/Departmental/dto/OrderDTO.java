package com.onlinestore.Departmental.dto;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
public class OrderDTO {
    private Long orderId;
    private Long userId;
    private Timestamp orderDate;
    private String shippingAddress;
}
