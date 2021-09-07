package com.dio.accesscontrol.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Local {
    @Id
    private long id;
    @ManyToOne
    private AccessLevel accessLevel;
    private String description;
}
