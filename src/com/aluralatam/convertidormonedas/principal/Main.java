package com.aluralatam.convertidormonedas.principal;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.aluralatam.convertidormonedas.modelos.MonedasAPI;
import com.aluralatam.convertidormonedas.modelos.MonedasUsar;
import com.aluralatam.convertidormonedas.modelos.ValoresIniciales;
import com.aluralatam.convertidormonedas.operacion.Consulta;
import com.aluralatam.convertidormonedas.operacion.Conversiones;
import com.aluralatam.convertidormonedas.textos.TextosMostrar;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        // Dependencias
        Consulta consulta = new Consulta();
        TextosMostrar texto = new TextosMostrar();
        Conversiones conversiones = new Conversiones();
        MonedasUsar monedas = new MonedasUsar();
        Gson gson = new Gson();
        Scanner inputTeclado = new Scanner(System.in);

        // Valores iniciales
        int opcionMenu = 0;
        float valorIngresar = 0;
        System.out.println("Iniciando...");
        String json = consulta.ConsultaMoneda("USD");
        MonedasAPI monedasAPI = gson.fromJson(json, MonedasAPI.class);
        // Buque que no acababa
        while (opcionMenu != 7) {
            try {

                texto.mostrarMenu();
                opcionMenu = inputTeclado.nextInt();

                switch (opcionMenu) {
                    case 1:
                        texto.input();
                        valorIngresar = inputTeclado.nextFloat();
                        ValoresIniciales usdToArs = new ValoresIniciales((float) valorIngresar, "USD", "ARS");
                        texto.devolverConversion(
                                conversiones.crearResultadoNatural(usdToArs, monedas.crearMonedas(monedasAPI)));
                        break;
                    case 2:
                        texto.input();
                        valorIngresar = inputTeclado.nextFloat();
                        ValoresIniciales arsToUsd = new ValoresIniciales((float) valorIngresar, "ARS", "USD");
                        texto.mostrarMenu();
                        texto.devolverConversion(
                                conversiones.crearResultadoInverso(arsToUsd, monedas.crearMonedas(monedasAPI)));
                        break;
                    case 3:
                        texto.input();
                        valorIngresar = inputTeclado.nextFloat();
                        ValoresIniciales usdToBrl = new ValoresIniciales((float) valorIngresar, "USD", "BRL");
                        texto.devolverConversion(
                                conversiones.crearResultadoNatural(usdToBrl, monedas.crearMonedas(monedasAPI)));
                        break;
                    case 4:
                        texto.input();
                        valorIngresar = inputTeclado.nextFloat();
                        ValoresIniciales brlToUsd = new ValoresIniciales((float) valorIngresar, "BRL", "USD");
                        texto.devolverConversion(
                                conversiones.crearResultadoInverso(brlToUsd, monedas.crearMonedas(monedasAPI)));
                        break;
                    case 5:
                        texto.input();
                        valorIngresar = inputTeclado.nextFloat();
                        ValoresIniciales usdToCop = new ValoresIniciales((float) valorIngresar, "USD", "COP");
                        texto.devolverConversion(
                                conversiones.crearResultadoNatural(usdToCop, monedas.crearMonedas(monedasAPI)));
                        break;
                    case 6:
                        texto.input();
                        valorIngresar = inputTeclado.nextFloat();
                        ValoresIniciales copToUsd = new ValoresIniciales((float) valorIngresar, "COP", "USD");
                        texto.devolverConversion(
                                conversiones.crearResultadoInverso(copToUsd, monedas.crearMonedas(monedasAPI)));
                        break;
                    default:
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error en entrada de teclado, ingresar solo valores enteros");
                break;
            }
        }
        System.out.println("Gracias por utilizar mi conversor de monedas");
    }
}
