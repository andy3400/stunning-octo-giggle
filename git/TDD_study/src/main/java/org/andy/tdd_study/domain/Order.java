package org.andy.tdd_study.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Entity(name="order")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Order {

    @Id @GeneratedValue
    @Column(name="pri_order_id")
    private Long order_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private Member member;

    @Column(nullable = false)
    private LocalDateTime date;

    @Builder
    public Order(Long order_id, Member member, LocalDateTime date) {
        this.order_id = order_id;
        this.member = member;
        this.date = date;
    }

}
