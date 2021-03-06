package ru.geekbrains.watch.market.repositories;

import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.watch.market.model.User;

import java.util.Optional;

@Repository
@Profile("dao")
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
