package com.example.myShop.domain.dto.goods;

import lombok.*;
import lombok.extern.jackson.Jacksonized;

import java.math.BigDecimal;

/**
 * @author nafis
 * @since 22.12.2021
 */

@Value
@Setter
@Getter
@Jacksonized
@AllArgsConstructor
public class GoodsInfoDto {
    int id;
    String name;
    BigDecimal price;
    long availability;
    String imageUrl;

    String producerName;
    int categoryID;
}
