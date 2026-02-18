package com.elias.investcommon.domain;

public enum OrderStatus {
    CREATED,
    VALIDATED,
    PENDING_RISK_CHECK,
    APPROVED,
    REJECTED,
    SETTLED,
    FAILED,
    PROCESSING,
    CANCELLED
}