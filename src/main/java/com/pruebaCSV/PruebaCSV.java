package com.pruebaCSV;
/*
Ejemplo muy sencillo de acceso a un fichero .CSV con datos de pokemons
No utiliza ningún gestor de dependencias
 */

public class PruebaCSV {
    /**
     * @author jorgecisneros
     */

    public static void main(String[] args) {
        LectorCSV miLector = new LectorCSV();

        miLector.leeCSV("src/main/resources/datos/pokemon.csv");
    }
}