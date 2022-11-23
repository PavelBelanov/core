package ru.belanov.core.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.belanov.core.model.Card;
@Repository
public interface CardRepository extends CrudRepository<Card,Long> {

    Card getById(Long id);
}
