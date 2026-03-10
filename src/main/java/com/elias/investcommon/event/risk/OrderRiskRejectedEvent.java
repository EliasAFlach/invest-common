package com.elias.investcommon.event.risk;

import com.elias.investcommon.domain.RiskDecisionType;
import com.elias.investcommon.event.BaseEvent;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class OrderRiskRejectedEvent extends BaseEvent {

    private UUID orderId;
    private UUID investorId;

    private RiskDecisionType decision;
    private List<String> reasons;
    private List<RuleTraceDTO> ruleTrace;
}