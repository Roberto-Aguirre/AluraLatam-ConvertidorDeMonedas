package com.aluralatam.convertidormonedas.principal;

import com.aluralatam.convertidormonedas.modelos.MonedasAPI;
import com.aluralatam.convertidormonedas.modelos.MonedasUsar;
import com.aluralatam.convertidormonedas.modelos.ValoresIniciales;
import com.aluralatam.convertidormonedas.operacion.Consulta;
import com.aluralatam.convertidormonedas.operacion.Conversiones;
import com.aluralatam.convertidormonedas.textos.TextosMostrar;
import com.google.gson.Gson;


public class Main {
    public static void main(String[] args) {
        
        Consulta consulta = new Consulta();   
        TextosMostrar texto = new TextosMostrar();
        Conversiones conversiones = new Conversiones();
        MonedasUsar monedas = new MonedasUsar();
        Gson gson = new Gson();

        try {
            String json = consulta.ConsultaMoneda("USD");

            MonedasAPI monedasAPI = gson.fromJson(json, MonedasAPI.class);
            System.out.println(monedasAPI.conversion_rates.getCOP());

            ValoresIniciales valoresIniciales = new ValoresIniciales((float)5, "USD", "COP");
            ValoresIniciales valoresIniciales1 = new ValoresIniciales((float)3225.3599, "ARS", "USD");
            System.out.println(texto.devolverConversion(conversiones.crearResultadoNatural(valoresIniciales,monedas.crearMonedas(monedasAPI))));
            System.out.println(texto.devolverConversion(conversiones.crearResultadoInverso(valoresIniciales1,monedas.crearMonedas(monedasAPI))));
            

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
