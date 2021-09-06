package com.dio.accesscontrol.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Occurrence {
    private long id;
    private String description;
    private String name;

}
