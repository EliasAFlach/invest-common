package com.elias.investcommon.event.investor;

import com.elias.investcommon.event.BaseEvent;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class InvestorCreatedEvent extends BaseEvent {

    private UUID investorId;
    private String name;
    private String cpf;
    private String email;
    private LocalDate birthDate;
    private String kycStatus;
    private String suitabilityProfile;
}