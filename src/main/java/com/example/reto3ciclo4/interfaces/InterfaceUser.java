package com.example.reto3ciclo4.interfaces;


import com.example.reto3ciclo4.modelo.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author PSG94
 */
public interface InterfaceUser  extends MongoRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
}

