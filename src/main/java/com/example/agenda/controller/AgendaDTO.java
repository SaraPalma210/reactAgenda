package com.example.agenda.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AgendaDTO {
    @Id
    String id;
    String nombre;
    String apellido;
    String ciudad;
    String direccion;
    String telefono;
    int postalcode;
    LocalDate cumple;
}
