package com.aluralatam.convertidormonedas.principal;

import com.aluralatam.convertidormonedas.modelos.MonedasAPI;
import com.aluralatam.convertidormonedas.modelos.MonedasUsar;
import com.aluralatam.convertidormonedas.operacion.Consulta;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        
        Consulta consulta = new Consulta();        

        try {
    
            String json = consulta.ConsultaMoneda("MXN");
            System.out.println(consulta.conversionAObjetos(json));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
