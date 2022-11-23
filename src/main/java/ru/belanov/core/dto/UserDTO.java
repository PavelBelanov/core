package ru.belanov.core.dto;

import lombok.*;
import ru.belanov.core.model.Role;

import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UserDTO {
    private long id;
    private String email;
    private Set<RoleDTO> roles;
}
