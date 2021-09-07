package com.dio.accesscontrol.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Company {
    @Id
    private long id;
    private String description;
    private String cnpj;
    private String address;
    private String city;
    private String district;
    private String state;
    private String phone;


}
