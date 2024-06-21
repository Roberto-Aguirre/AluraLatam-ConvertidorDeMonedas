package com.aluralatam.convertidormonedas.modelos;

public class ValoresFinal {

    public float valor;
    public String monedaInicial;
    public String monedaFinal;
    public float resultado;

    public ValoresFinal(float valor, String monedaInicial, String monedaFinal, float resultado) {
        this.valor = valor;
        this.monedaInicial = monedaInicial;
        this.monedaFinal = monedaFinal;
        this.resultado = resultado;
    }
}
