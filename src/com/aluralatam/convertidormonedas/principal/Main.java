package com.aluralatam.convertidormonedas.principal;

import com.aluralatam.convertidormonedas.modelos.Monedas;
import com.aluralatam.convertidormonedas.operacion.Consulta;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import netscape.javascript.JSException;

public class Main {
    public static void main(String[] args) {

        Consulta consulta = new Consulta();

        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = consulta.ConsultaMoneda("MXN");
            Monedas monedas = gson.fromJson(json, Monedas.class);
            System.out.println(monedas.conversion_rates.getARS());
            // System.out.println(json);
            // Monedas monedas = gson.fromJson(json, Monedas.class);
            // System.out.println(monedas);
            // Valores valores = gson.fromJson(json, Valores.class);

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
