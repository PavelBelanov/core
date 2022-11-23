package ru.belanov.core.mappers;

import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import ru.belanov.core.dto.RuWordDTO;
import ru.belanov.core.model.RuWord;

@Mapper(componentModel = "spring")

public interface RuWordMapper {
    RuWordDTO toDTO(RuWord ruWord);
}
