package org.sostapis.springdataexamplesh2.funko.dtos;

import java.math.BigDecimal;
import java.util.Map;

public record EstadisticasResponse(
        int total,
        Map<String, Long> porCategoria,
        BigDecimal valorInventario,
        long sinStock,
        String masCaro
) {}