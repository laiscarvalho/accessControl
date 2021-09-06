package com.dio.accesscontrol.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Company {
    private long id;
    private String description;
    private String cnpj;
    private String address;
    private String city;
    private String district;
    private String state;
    private String phone;


}
