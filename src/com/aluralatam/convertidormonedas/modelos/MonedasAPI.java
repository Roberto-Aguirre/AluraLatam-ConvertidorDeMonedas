package com.aluralatam.convertidormonedas.modelos;

public class MonedasAPI {
    String result;
    String documentation;
    String base_code;

    public ConversionRatesAPI conversion_rates;

    public String getResult() {
        return result;
    }

    public String getDocumentation() {
        return documentation;
    }

    public String getBase_code() {
        return base_code;
    }

    public ConversionRatesAPI getConversion_rates() {
        return conversion_rates;
    }

}