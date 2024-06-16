package com.aluralatam.convertidormonedas.principal;

import com.aluralatam.convertidormonedas.modelos.Moneda;
import com.aluralatam.convertidormonedas.modelos.MonedaApi;
import com.aluralatam.convertidormonedas.operacion.Consulta;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
    
        Consulta consulta = new Consulta();


        try {
            String resultado = consulta.ConsultaMoneda("MXN");
            // System.out.println(resultado);    
            Gson gson = new GsonBuilder().setPrettyPrinting().create(); 
            MonedaApi mxn = gson.fromJson(resultado,MonedaApi.class); //! CORREGIR
            // MonedaApi mxn = gson.fromJson((gson)=>{}, MonedaApi.class);
        } catch (Exception e) {
            // TODO: handle exception
        }
        




    }
}
