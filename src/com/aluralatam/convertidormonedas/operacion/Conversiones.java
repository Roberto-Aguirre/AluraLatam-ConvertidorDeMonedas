package com.aluralatam.convertidormonedas.operacion;

import java.util.HashMap;

import com.aluralatam.convertidormonedas.modelos.ValoresFinal;
import com.aluralatam.convertidormonedas.modelos.ValoresIniciales;

public class Conversiones {

   public ValoresFinal crearResultadoNatural(ValoresIniciales e,HashMap<String,Float> b){

    float resultado = e.valor * b.get(e.monedaFinal);

    ValoresFinal objResultado = new ValoresFinal(e.valor,e.monedaInicial,e.monedaFinal,resultado);


    return objResultado;
   }

   public ValoresFinal crearResultadoInverso(ValoresIniciales e,HashMap<String,Float> b){

    float conversion = e.valor / b.get(e.monedaInicial);


    ValoresFinal objResultado = new ValoresFinal(e.valor,e.monedaInicial,e.monedaFinal,conversion);


    return objResultado;
   }
}
