package com.dio.accesscontrol.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Movimentation {

    //chave composta
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class MovimentationId implements Serializable{
        private long idMovimento;
        private  long idUsuario;

    }
    @Id
    @EmbeddedId
    private MovimentationId id;
    private LocalDateTime entryDate;
    private LocalDateTime departureDate;
    private BigDecimal period;
    private Occurrence occurrence;
    private Callendar callendar;





}
