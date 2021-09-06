package com.dio.accesscontrol.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Callendar {
    private long id;
    private DataType daaType;
    private String description;
    private LocalDateTime commemorativeDate;

}
