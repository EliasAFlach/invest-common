package com.elias.investcommon.event.product;

import com.elias.investcommon.event.BaseEvent;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ProductCreatedEvent extends BaseEvent {

    private UUID productId;
    private String name;
    private String productType;
    private String riskLevel;
    private String status;
    private BigDecimal interestRate;
    private BigDecimal minimumInvestment;
    private int gracePeriodDays;
    private int liquidityDays;
    private int version;
}