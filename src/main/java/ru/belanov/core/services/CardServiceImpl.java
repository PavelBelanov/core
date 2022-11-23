package ru.belanov.core.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.belanov.core.model.Card;
import ru.belanov.core.repositories.CardRepository;
@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;
    @Override
    public Card getCard(Long id) {
        return cardRepository.getById(id);
    }
}
