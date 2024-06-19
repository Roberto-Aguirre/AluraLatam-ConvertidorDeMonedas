package com.aluralatam.convertidormonedas.principal;

import com.aluralatam.convertidormonedas.operacion.Consulta;
import com.google.gson.Gson;


public class Main {
    public static void main(String[] args) {
    
        Consulta consulta = new Consulta();

        
        
        try {
            Gson gson = new Gson(); 
            String json = consulta.ConsultaMoneda("MXN");

            // Valores valores = gson.fromJson(json, Valores.class);

            

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
