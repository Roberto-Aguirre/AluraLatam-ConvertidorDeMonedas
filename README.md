# AluraLatam-ConvertidorDeMonedas

Una pequeña introducción a los componentes y al uso del proyecto desarrollado.

## Proposito

Se buscaba mediante este Challenge el desarrollar las habilidades necesarias de manera practica para crear un conversor de monedas que utilice los datos obtenidos por una API Rest que se consulte, devuelvea los datos y generar un menu en el cual se puedan utilizar los datos obtenidos.

## Referencia de la API (https://www.exchangerate-api.com) utilizada.

#### Traer referencias a una moneda a consultar

```http
  GET https://v6.exchangerate-api.com/v6/api_key/latest/moneda
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `api_key` | `string` | **Requerido**. api_key propia  |
| `moneda` | `string` | **Requerido**. moneda Ej. MXN, ARS, BRL, etc... |

Puedes tramitarla en la siguiente pagina: 
#### https://app.exchangerate-api.com/sign-up 
Creando una cuenta con tu correo y contraseña se enviara directamente a tu correo.


## Caracteristicas

- Consulta Http a sitioWeb.
- Posibilidad de hacer una conversion de tipo de cambio
- Moneda principal con USD
- Monedas soportadas (ARS,BRL,COP,USD)

- Conversion USD a ARS; Y viceversa.
- Conversion USD a BRL; Y viceversa.
- Conversion USD a COP; Y viceversa.

## Copiar repositorio
Si se quiere probar el programa realizado es necesario tener git instalado en nuestra computadora y ejecutar el siguiente comando en el cmd o linea de comandos.

```cmd
  git clone https://github.com/Roberto-Aguirre/AluraLatam-ConvertidorDeMonedas
```
    
Una vez terminado, estara listo para usarse.
## Uso 

- **Es necesario instalar las dependencias primarias como Java (JDK 22 y JRE 1.8)**
- Se sugiere el uso de Visual Studio Code con la extension de **Language Support for Java(TM) by Red Hat** proporcionada por Red Hat.

**Se abrira el proyecto y ejecutaremos el archivo Main, en el paquete de principal.**

Una vez abierto se mostrara el siguiente texto.
```Java
Iniciando...


==========================================
Bienvenido al conversos de moneda de RIAS.
1) Dolares =>> Pesos Argentinos
2) Pesos Argentinos =>> Dolares
3) Dolares =>> Real Brasileño
4) Real Brasileño =>> Dolares
5) Dolares =>> Peso Colombiano
6) Peso Colombiano =>> Dolar
7) Salir
Selecciona una opcion valida del menu:
==========================================
```
 Aquí seremos libres de proporcionar en la linea de comandos la opcion que queramos consultar y ejecutar.

* Ejemplo. Ejecutaremos el valor **1** para una prueba.

Se mostrarar el siguiente texto y tendremos que rellenar nuestro numero
```Java
Ingresa el valor que deseas convertir: 
>
```
* Ingresaremos **5**. *Siendo el resultado al día de 22/06/2024*
```Java
El valor 5.0 [USD] corresponde al valor final de >>>> 4530.0 [ARS]
```
Regresando el siguiente resultado en consola.

Para este momento se mostrara el Menu nuevamente para entrar a otras opciones.

* Por ultimo daremos la opcion **7** a nuestro menu para salir.

Dando la siguiente salida de consola.

```Java
Gracias por utilizar mi conversor de monedas
```

## Limitaciones

* Solo es capaz de procesar 6 tipos de operaciones

* Al teclear en el programa algun valor incorrecto o inesperado el programa terminara.


## Autor

- [@Roberto-Aguirre](https://www.github.com/Roberto-Aguirre)

>>>>>>> Gracias por leer el readme y espero contribuir a más proyector propios o en compañia.
