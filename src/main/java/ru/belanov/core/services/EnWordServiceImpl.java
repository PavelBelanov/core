package ru.belanov.core.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.belanov.core.model.EnWord;
import ru.belanov.core.repositories.EnWordRepository;


@Service
@RequiredArgsConstructor
public class EnWordServiceImpl implements EnWordService{
    private final EnWordRepository enWordRepository;
    @Override
    public EnWord getEnWord(Long id) {
        return enWordRepository.getById(id);
    }
}
