package com.elias.investcommon.domain;

public enum OrderStatus {
    CREATED,
    VALIDATED,
    RISK_PENDING,
    RISK_APPROVED,
    RISK_REJECTED,
    SETTLED,
    FAILED
}