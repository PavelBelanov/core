package ru.belanov.core.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.belanov.core.model.EnWord;


@Repository
public interface EnWordRepository extends CrudRepository<EnWord,Long> {
    EnWord getById(Long id);
}
