package com.example.agenda.controller;

import com.example.agenda.model.AgendaModel;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class AgendaDTOConverter {
    private static final ModelMapper modelMapper = new ModelMapper();
    private static final ModelMapper modelmapper = new ModelMapper();

    public static List<AgendaDTO> convertListToDto(List<AgendaModel> all) {
        List<AgendaDTO> contactos = new ArrayList<>();
        for (AgendaModel agenda : all) {
            contactos.add(modelmapper.map(agenda, AgendaDTO.class));
        }
        return contactos;
    }

    public static AgendaDTO convertToDto(AgendaModel save) {
        return modelmapper.map(save, AgendaDTO.class);

    }

    public static AgendaDTO convertToDto(Optional<AgendaModel> byId) {
        return modelmapper.map(byId, AgendaDTO.class);
    }
}
