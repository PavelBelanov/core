package ru.belanov.core.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ru.belanov.core.dto.UserDTO;
import ru.belanov.core.mappers.UserMapper;

import ru.belanov.core.model.User;
import ru.belanov.core.services.UserService;


@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;

    @GetMapping("/users/{id}")
    public UserDTO sayHello(@PathVariable Long id) {
        User user = userService.getUser(id);
        return userMapper.toDTO(user);
    }


}
