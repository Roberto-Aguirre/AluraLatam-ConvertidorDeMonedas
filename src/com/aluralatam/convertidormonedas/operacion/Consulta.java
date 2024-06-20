package com.aluralatam.convertidormonedas.operacion;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;

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
}
