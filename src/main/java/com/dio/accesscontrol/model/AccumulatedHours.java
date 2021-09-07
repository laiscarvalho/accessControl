package com.dio.accesscontrol.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class AccumulatedHours {
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class AccumulatedHoursId implements Serializable {
        private long movimentationId;
        private long userId;
        private long accumulatedHoursId;
    }
    @Id
    @EmbeddedId
    private AccumulatedHoursId id;
    private LocalDateTime workingDate;
    private BigDecimal quantityWorkingDays;
    private BigDecimal hoursBalance;


}
