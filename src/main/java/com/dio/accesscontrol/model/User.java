package com.dio.accesscontrol.model;

import lombok.*;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class User {
    private long id;
    @ManyToOne
    private UserCategory userCategory;
    private String nome;
    @ManyToOne
    private Company company;
    @ManyToOne
    private AccessLevel accessLevel;
    @ManyToOne
    private WorkingDay workingDay;
    private BigDecimal delayTolerance; // toleracia de atraso
    private LocalDateTime entryTime; //horario de entrada
    private LocalDateTime departureTime; //horario de saida


}
