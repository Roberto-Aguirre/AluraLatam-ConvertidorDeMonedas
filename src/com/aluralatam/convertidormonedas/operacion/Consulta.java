package com.aluralatam.convertidormonedas.operacion;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.HashMap;

import com.aluralatam.convertidormonedas.modelos.MonedasAPI;
import com.aluralatam.convertidormonedas.modelos.MonedasUsar;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Consulta {

    private String apiKey = "172323dd37f35ae3cec3fbe1";

    public String ConsultaMoneda(String Nombre) throws IOException, InterruptedException {
        String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + Nombre;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();

        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        Gson gson = new Gson();

        String data = response.body();
        return data;

    }

    public HashMap<String, Float> conversionAObjetos(String data) throws IOException, InterruptedException {
        MonedasUsar a = new MonedasUsar();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        try {
            MonedasAPI monedas = gson.fromJson(data, MonedasAPI.class);
            HashMap mapeoDivisas = a.crearMonedas(monedas);
            return mapeoDivisas;
        } catch (ExceptionInInitializerError e) {
            return null;
        }

    }
}
