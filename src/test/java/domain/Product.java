package domain;

import lombok.*;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private BigDecimal id;
    private String name;
    private Double price;

}
