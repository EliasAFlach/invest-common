package com.elias.investcommon.event.order;

import java.math.BigDecimal;
import java.util.UUID;

import com.elias.investcommon.event.BaseEvent;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class OrderCreatedEvent extends BaseEvent {

    private UUID orderId;
    private UUID investorId;
    private UUID productId;
    private Integer quantity;
    private BigDecimal unitPrice;
    private BigDecimal totalAmount;

    public OrderCreatedEvent(UUID correlationId, UUID causationId, UUID orderId,
                             UUID investorId, UUID productId, Integer quantity,
                             BigDecimal unitPrice, BigDecimal totalAmount) {
        super(correlationId, causationId);
        this.orderId = orderId;
        this.investorId = investorId;
        this.productId = productId;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalAmount = totalAmount;
    }
}