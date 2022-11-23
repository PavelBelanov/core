package ru.belanov.core.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.belanov.core.dto.CardDTO;
import ru.belanov.core.mappers.CardMapper;
import ru.belanov.core.model.Card;
import ru.belanov.core.services.CardService;

@RestController
@RequiredArgsConstructor
public class CardController {
    private final CardService cardService;
    private final CardMapper cardMapper;

    @GetMapping("/cards/{id}")
    public CardDTO getCardById(@PathVariable Long id) {
        Card card = cardService.getCard(id);
        return cardMapper.toDTO(card);
    }
}
