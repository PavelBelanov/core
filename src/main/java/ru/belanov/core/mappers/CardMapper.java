package ru.belanov.core.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.belanov.core.dto.CardDTO;
import ru.belanov.core.model.Card;

@Mapper(componentModel = "spring")
public interface CardMapper {
//    @Mapping(source = "enWord",target = "enWordDTO")
    CardDTO toDTO(Card card);
}
