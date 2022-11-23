package ru.belanov.core.dto;

import lombok.*;
import ru.belanov.core.model.EnWord;
import ru.belanov.core.model.RuWord;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CardDTO {
    private Long id;
    private Long rating;
    private EnWordDTO enWordDTO;
    private RuWordDTO ruWordDTO;
}
