package com.elias.investcommon.event;

import java.time.Instant;
import java.util.UUID;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public abstract class BaseEvent {

    private UUID eventId;
    private UUID correlationId;
    private UUID causationId;
    private Instant occurredOn;

    protected BaseEvent(UUID correlationId, UUID causationId) {
        this.eventId = UUID.randomUUID();
        this.occurredOn = Instant.now();
        this.correlationId = correlationId != null ? correlationId : UUID.randomUUID();
        this.causationId = causationId;
    }
}