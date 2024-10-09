package practica8;

import java.util.ArrayList;

public class AppDemoHerencia {
    public static void main(String[] args) {
        // Lista de Smartphones
        ArrayList<Smartphone> listaDeSmartphones = new ArrayList<>();
        listaDeSmartphones.add(new Smartphone("Apple", "S1234", "iPhone", "iPhone 13", 999.99f,
                new Microprocesador(6, 3100000000L), 8192, new Sensor("Huella dactilar", "toque", 1),
                new Pantalla(1170, 2532)));
        listaDeSmartphones.add(new Smartphone("Samsung", "S5678", "Galaxy", "Galaxy S21", 899.99f,
                new Microprocesador(8, 2900000000L), 8192, new Sensor("Huella dactilar", "toque", 1),
                new Pantalla(1080, 2400)));

        // Lista de TVs
        ArrayList<Television> listaDeTVs = new ArrayList<>();
        listaDeTVs.add(new Television("Sony", "T1234", "Bravia", "Bravia X90J", 1199.99f,
                new Pantalla(3840, 2160)));
        listaDeTVs.add(new Television("LG", "T5678", "OLED", "OLED C1", 1399.99f,
                new Pantalla(3840, 2160)));

        // Mostrar atributos de los Smartphones
        System.out.println("Lista de Smartphones:");
        for (Smartphone smartphone : listaDeSmartphones) {
            System.out.println(smartphone);
        }

        // Mostrar atributos de las Televisiones
        System.out.println("\nLista de Televisiones:");
        for (Television television : listaDeTVs) {
            System.out.println(television);
        }
    }
}
