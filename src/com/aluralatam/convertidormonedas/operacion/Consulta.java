package com.aluralatam.convertidormonedas.operacion;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Arrays;
import java.util.List;

public class Consulta {

    private String apiKey = "172323dd37f35ae3cec3fbe1";
    private String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/MXN" ;

    public List<String> valoresPermitidos = Arrays.asList("MXN","ARS","BOB","BRL","CPL","COP","USD");
    
    public String ConsultaMoneda(String Nombre) throws IOException, InterruptedException{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();

        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        
        String data = response.body();
        String divisa;
        int valor;
        
        return data;
        


    }
}
