package org.sostapis.springdataexamplesh2.funko.dtos;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public record FunkoCreateRequest(

        @NotNull(message = "El nombre no puede ser nulo")
        @Size(max = 100, message = "El nombre no puede superar los 100 caracteres")
        String nombre,

        @NotNull(message = "El precio es obligatorio")
        @DecimalMin(value = "0.0", message = "El precio no puede ser negativo!")
        BigDecimal precio,

        @NotNull(message = "La cantidad es obligatoria")
        @PositiveOrZero(message = "La cantidad no puede ser negativa")
        Integer cantidad,

        @NotBlank(message = "La categoría no puede estar vacía")
        @Pattern(regexp = "DISNEY|MARVEL|ANIME|OTROS",
                message = "Debe ser DISNEY, MARVEL, ANIME u OTROS")
        String categoria


) {}
