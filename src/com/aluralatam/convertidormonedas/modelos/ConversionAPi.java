package com.aluralatam.convertidormonedas.modelos;

public record ConversionAPi(String conversion_rates ) {
@Override
public final String toString() {
    return this.conversion_rates;
}
}
