package com.aluralatam.convertidormonedas.modelos;
import java.util.HashMap;
public class MonedasUsar {

    private MonedasAPI monedasAPI = new MonedasAPI();
    public HashMap<String,Float> mapa = new HashMap<String,Float>();

    public class Moneda {
        private String divisa;
        private float valor;

        public Moneda(String divisa, float valor) {
            this.divisa = divisa;
            this.valor = valor;
        }

        public String getDivisa() {
            return divisa;
        }

        public float getValor() {
            return valor;
        }

    }
    
    public HashMap<String,Float> crearMonedas(MonedasAPI monedasAPI){
        mapa.put("MXN", monedasAPI.conversion_rates.getMXN());
        mapa.put("ARS", monedasAPI.conversion_rates.getARS());
        mapa.put("BOB", monedasAPI.conversion_rates.getBOB());
        mapa.put("BRL", monedasAPI.conversion_rates.getBRL());
        mapa.put("CPL", monedasAPI.conversion_rates.getCLP());
        mapa.put("COP", monedasAPI.conversion_rates.getCOP());
        mapa.put("USD", monedasAPI.conversion_rates.getUSD());
        
        System.out.println("Listo");
        return mapa;
    }
    
}
