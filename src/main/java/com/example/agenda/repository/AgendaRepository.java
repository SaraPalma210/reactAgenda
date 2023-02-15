package com.example.agenda.repository;

import com.example.agenda.model.AgendaModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AgendaRepository extends MongoRepository<AgendaModel, String> {
}
