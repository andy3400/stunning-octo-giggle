package org.andy.tdd_study.domain.Delivery;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Status {
    ORDER("ORDER"),
    CANCEL("CANCEL");

    private final String delivery_status;
}
