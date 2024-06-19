package com.aluralatam.convertidormonedas.modelos;

public class conversion_rates {
   
    public String conversion_rates;

    public conversion_rates(String conversion) {
        this.conversion_rates = conversion.toString();
    }

    class Moneda{
    
        public String nombre;
        public double valor;
        
        public Moneda(double valor, String nombre) {
            this.valor = valor;
            this.nombre = nombre;
        }
    }

}
