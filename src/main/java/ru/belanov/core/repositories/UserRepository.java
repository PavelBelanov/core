package ru.belanov.core.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.belanov.core.model.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    User getById(Long id);
}
