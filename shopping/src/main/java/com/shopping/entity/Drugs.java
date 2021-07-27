package com.shopping.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Drugs {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String image;
}
