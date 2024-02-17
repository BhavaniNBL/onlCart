package com.onlinestore.Departmental.dto;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
public class RatingDTO {
    private Long ratingId;
    private Long productId;
    private Long userId;
    private int stars;
    private String comment;
    private Timestamp ratingDate;
}
