package ru.belanov.core.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.belanov.core.dto.EnWordDTO;
import ru.belanov.core.mappers.EnWordMapper;
import ru.belanov.core.model.EnWord;
import ru.belanov.core.services.EnWordService;

@RestController
@RequiredArgsConstructor
public class EnWordController {

    private final EnWordService enWordService;

    private final EnWordMapper enWordMapper;

    @GetMapping("/en-words/{id}")
    public EnWordDTO getEnWordById(@PathVariable Long id) {
        EnWord enWord = enWordService.getEnWord(id);
        return enWordMapper.toDTO(enWord);

    }
}
