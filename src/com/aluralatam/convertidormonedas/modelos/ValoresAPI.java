package com.aluralatam.convertidormonedas.modelos;

import com.aluralatam.convertidormonedas.modelos.Valores.Conversiones;

public record ValoresAPI(Conversiones conversion_rates, String result,
String documentation,
String terms_of_use,
int time_last_update_unix,
String time_last_update_utc,
int time_next_update_unix,
String time_next_update_utc,
String base_code) { 
}
