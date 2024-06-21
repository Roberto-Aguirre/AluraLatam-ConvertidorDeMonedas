package com.aluralatam.convertidormonedas.principal;

import com.aluralatam.convertidormonedas.modelos.MonedasAPI;
import com.aluralatam.convertidormonedas.modelos.MonedasUsar;
import com.aluralatam.convertidormonedas.operacion.Consulta;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        MonedasUsar a = new MonedasUsar();
        Consulta consulta = new Consulta();        

        try {

            
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = consulta.ConsultaMoneda("MXN");
            MonedasAPI monedas = gson.fromJson(json, MonedasAPI.class);
            System.out.println(a.crearMonedas(monedas));
        
            
            // System.out.println(json);
            // Monedas monedas = gson.fromJson(json, Monedas.class);
            // System.out.println(monedas);
            // Valores valores = gson.fromJson(json, Valores.class);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
