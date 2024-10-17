package org.andy.tdd_study.domain.Delivery;

import jakarta.persistence.*;
import lombok.Getter;

import org.andy.tdd_study.domain.Order;


@Entity(name="delivery")
@Getter
public class Delivery {

    @Id @GeneratedValue
    @Column(name="pri_delivery_id")
    private Long delivery_id;

    @OneToOne
    @JoinColumn(nullable=false)
    private Order order;

    private Status delivery_status;

    // create method
    public Delivery createDelivery(Long delivery_id, Order order, Status delivery_status) {
        this.delivery_id = delivery_id;
        this.order = order;
        this.delivery_status = delivery_status;
    }
}
