package com.dio.accesscontrol.model;

import lombok.*;

import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Local {
    private long id;
    @ManyToOne
    private AccessLevel accessLevel;
    private String description;
}
