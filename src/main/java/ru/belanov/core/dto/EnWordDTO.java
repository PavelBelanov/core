package ru.belanov.core.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EnWordDTO {
    private Long id;
    private String meaning;
}
