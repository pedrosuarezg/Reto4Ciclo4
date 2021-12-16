package com.example.reto3ciclo4.repositorio;

import com.example.reto3ciclo4.interfaces.InterfaceFragance;
import com.example.reto3ciclo4.modelo.Fragance;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 *
 * @author PSG94
 */
@Repository

public class FraganceRepositorio {

    @Autowired
    private InterfaceFragance repository;

    public List<Fragance> getAll() {
        return repository.findAll();
    }

    public Optional<Fragance> getFragance(String reference) {
        return repository.findById(reference);
    }
    public Fragance create(Fragance fragance) {
        return repository.save(fragance);
    }

    public void update(Fragance fragance) {
        repository.save(fragance);
    }

    public void delete(Fragance fragance) {
        repository.delete(fragance);
    }
}

