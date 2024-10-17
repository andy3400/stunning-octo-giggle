package org.andy.tdd_study.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;

@Entity
@Getter
public class Member {

    @Id @GeneratedValue
    @Column(name="pri_memeber_id")
    private Long member_id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;


    @Builder
    public static Member create(String name, String address) {
        return Member.builder()
                .name(name)
                .address(address)
                .build();
    }

}
