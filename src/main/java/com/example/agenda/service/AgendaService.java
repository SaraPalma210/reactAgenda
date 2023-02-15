package com.example.agenda.service;

import com.example.agenda.controller.AgendaDTO;
import com.example.agenda.controller.AgendaDTOConverter;
import com.example.agenda.model.AgendaModel;
import com.example.agenda.repository.AgendaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AgendaService {
    @Autowired
    private AgendaRepository repository;

    public List<AgendaDTO> getAllContactos(){
        return AgendaDTOConverter.convertListToDto(repository.findAll());
    }

    public AgendaDTO saveAgenda(AgendaModel agenda) {
        return AgendaDTOConverter.convertToDto(repository.save(agenda));
    }

    public void deleteAgendaById(String id) {
        repository.deleteById(id);
    }

    public void deleteAllAgenda() {
        repository.deleteAll();
    }

    public AgendaDTO getAgendaById(String id) {
        return AgendaDTOConverter.convertToDto(repository.findById(id));
    }

}
