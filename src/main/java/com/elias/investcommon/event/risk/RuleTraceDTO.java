package com.elias.investcommon.event.risk;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RuleTraceDTO {
    private String ruleKey;
    private String outcome;
    private String message;
}