package org.sostapis.springdataexamplesh2.coche.model;

public record Coche(Long id,
                    String marca,
                    String matricula,
                    String nacionalidad,
                    Integer puertas,
                    java.math.BigDecimal precio,
                    Double consumo) {}
