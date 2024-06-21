package com.aluralatam.convertidormonedas.textos;

import com.aluralatam.convertidormonedas.modelos.ValoresFinal;


public class TextosMostrar {

    String principal = """
            =======================================
            1) Dolares =>> Pesos Argentinos
            2) Pesos Argentinos =>> Dolares
            3) Dolares =>> Real Brasileño
            4) Real Brasileño =>> Dolares
            5) Dolares =>> Peso Colombiano
            6) Peso Colombiano =>> Dolar
            7) Salir
            Selecciona una opcion valida del menu:
            =======================================
            """;
    String inputValorConvertir = "Ingresa el valor que deseas convertir: ";

    public String devolverConversion(ValoresFinal e){
  
        String tempText = "El valor "+ e.valor+ " ["+ e.monedaInicial +"]" + " corresponde al valor final de >>>> " + e.resultado +" ["+ e.monedaFinal +"]";

        return tempText;
    }
    

}
