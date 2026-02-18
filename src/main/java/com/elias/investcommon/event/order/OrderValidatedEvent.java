package com.elias.investcommon.event.order;

import com.elias.investcommon.event.BaseEvent;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class OrderValidatedEvent extends BaseEvent {

    private UUID orderId;
    private UUID investorId;
}
