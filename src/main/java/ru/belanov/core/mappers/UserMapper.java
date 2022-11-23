package ru.belanov.core.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.belanov.core.dto.UserDTO;
import ru.belanov.core.model.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO toDTO(User user);
}
