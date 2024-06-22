package com.aluralatam.convertidormonedas.textos;

import com.aluralatam.convertidormonedas.modelos.ValoresFinal;


public class TextosMostrar {

    private String principal = """
            \n
            ==========================================
            Bienvenido al conversos de moneda de RIAS.
            1) Dolares =>> Pesos Argentinos
            2) Pesos Argentinos =>> Dolares
            3) Dolares =>> Real Brasileño
            4) Real Brasileño =>> Dolares
            5) Dolares =>> Peso Colombiano
            6) Peso Colombiano =>> Dolar
            7) Salir
            Selecciona una opcion valida del menu:
            ==========================================
            """;
            
    private String inputValorConvertir = "Ingresa el valor que deseas convertir: ";
    private String lineConsole = ">";
    private String ErrorOpcionValida = "Ingresa una opcion valida del menu";

    public void devolverConversion(ValoresFinal e){
  
        String tempText = "El valor "+ e.valor+ " ["+ e.monedaInicial +"]" + " corresponde al valor final de >>>> " + e.resultado +" ["+ e.monedaFinal +"]";
        System.out.println(tempText);

    }

    public void mostrarMenu(){
        System.out.println(principal);
        System.out.print(lineConsole);
    }

    public void input(){
        System.out.println(inputValorConvertir);
        System.out.print(lineConsole);
    }
    public void errValida(){
        System.out.println(ErrorOpcionValida);
    }
}
