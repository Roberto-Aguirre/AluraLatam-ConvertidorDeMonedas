package com.aluralatam.convertidormonedas.modelos;

public class Valores {

    String result;
    String documentation;
    String terms_of_use;
    int time_last_update_unix;
    String time_last_update_utc;
    int time_next_update_unix;
    String time_next_update_utc;
    String base_code;

    Conversiones conversion_rates;
    
    /**
     * Conversiones
     */
    public class Conversiones {
        public int MXN;
        public int ARS;
        public int BOB;
        public int BRL;
        public int CLP;
        public int COP;
        public int USD;
    
        public Conversiones(int mXN, int aRS, int bOB, int bRL, int cLP, int cOP, int uSD) {
            MXN = mXN;
            ARS = aRS;
            BOB = bOB;
            BRL = bRL;
            CLP = cLP;
            COP = cOP;
            USD = uSD;
        }
        
    }

    public Valores(String result, String documentation, String terms_of_use, int time_last_update_unix,
            String time_last_update_utc, int time_next_update_unix, String time_next_update_utc, String base_code,
            Conversiones conversion_rates) {
        this.result = result;
        this.documentation = documentation;
        this.terms_of_use = terms_of_use;
        this.time_last_update_unix = time_last_update_unix;
        this.time_last_update_utc = time_last_update_utc;
        this.time_next_update_unix = time_next_update_unix;
        this.time_next_update_utc = time_next_update_utc;
        this.base_code = base_code;
    }

    public String getResult() {
        return result;
    }

    
    
}