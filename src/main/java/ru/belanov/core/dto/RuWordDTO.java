package ru.belanov.core.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RuWordDTO {
    private Long id;
    private String meaning;
}
