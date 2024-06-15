package com.aluralatam.convertidormonedas.operacion;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.aluralatam.convertidormonedas.modelos.Moneda;
import com.aluralatam.convertidormonedas.modelos.MonedaApi;

public class Consulta {

    private String apiKey = "";
    private String url = "http://" + apiKey + "" ;

    public Moneda CrearMonedas(String Nombre){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();

        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        
        

        MonedaApi moneda = new MonedaApi();
        return
        


    }
}
