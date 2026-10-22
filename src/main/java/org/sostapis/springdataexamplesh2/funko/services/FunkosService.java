package org.sostapis.springdataexamplesh2.funko.services;

import org.sostapis.springdataexamplesh2.funko.dtos.EstadisticasResponse;
import org.sostapis.springdataexamplesh2.funko.dtos.FunkoCreateRequest;
import org.sostapis.springdataexamplesh2.funko.dtos.FunkoResponse;
import org.sostapis.springdataexamplesh2.funko.dtos.FunkoUpdateRequest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface FunkosService {
    List<FunkoResponse> buscar(Optional<String> categoria, Optional<String> nombre,
                               Optional<BigDecimal> precioMax);
    FunkoResponse findById(Long id);
    FunkoResponse save(FunkoCreateRequest funko);
    FunkoResponse replace(Long id, FunkoCreateRequest funko);
    FunkoResponse update(Long id, FunkoUpdateRequest funko);
    void deleteById(Long id);
    EstadisticasResponse estadisticas();
}
