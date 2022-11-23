package ru.belanov.core.mappers;

import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import ru.belanov.core.dto.EnWordDTO;
import ru.belanov.core.model.EnWord;

@Mapper(componentModel = "spring")
public interface EnWordMapper {

    EnWordDTO toDTO(EnWord enWord);
}
