package com.example.agenda.controller;

import com.example.agenda.model.AgendaModel;
import com.example.agenda.service.AgendaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:8080")
public class AgendaController {
    @Autowired
    private AgendaService service;

    @PostMapping("/agenda")
    public ResponseEntity<AgendaDTO> saveAgenda(@Validated @RequestBody AgendaModel agenda) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.saveAgenda(agenda));
    }

    @PutMapping("/agenda/{id}")
    public ResponseEntity<?> updateAgenda(@RequestBody AgendaModel agenda, @PathVariable String id) {
        agenda.setId(id);
        return ResponseEntity.ok(service.saveAgenda(agenda));
    }

    @DeleteMapping("/agenda/{id}")
    public ResponseEntity<?> deleteAgenda(@PathVariable String id) {
        service.deleteAgendaById(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/agenda")
    public ResponseEntity<?> deleteAllAgenda() {
        service.deleteAllAgenda();
        return ResponseEntity.noContent().build();
    }
}
