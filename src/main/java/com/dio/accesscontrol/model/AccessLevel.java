package com.dio.accesscontrol.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class AccessLevel {
    private long id;
    private String description;
}
