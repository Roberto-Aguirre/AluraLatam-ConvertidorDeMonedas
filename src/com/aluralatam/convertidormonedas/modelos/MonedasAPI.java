package com.aluralatam.convertidormonedas.modelos;

public class MonedasAPI {
    String base_code;

    public ConversionRatesAPI conversion_rates;
    
    public String getBase_code() {
        return base_code;
    }

    public ConversionRatesAPI getConversion_rates() {
        return conversion_rates;
    }

}