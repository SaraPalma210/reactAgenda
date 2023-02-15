package com.example.agenda.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document("agenda")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AgendaModel {
    @Id
    private String id;
    private String nombre;
    private String apellido;
    private String ciudad;
    private String direccion;
    private String telefono;
    private int postalcode;
    private LocalDate cumple;
}
