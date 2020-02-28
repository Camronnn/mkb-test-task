package com.mcb.creditfactory.service.airplane;

import com.mcb.creditfactory.dto.AirplaneDto;
import com.mcb.creditfactory.model.Airplane;

import java.util.Optional;

public interface AirplaneService {
    boolean approve(AirplaneDto airplaneDto);
    Airplane save(Airplane airplane);
    Optional<Airplane> load(Long id);
    Airplane fromDto(AirplaneDto airplaneDto);
    AirplaneDto toDTO(Airplane airplane);
    Long getId(Airplane airplane);
}