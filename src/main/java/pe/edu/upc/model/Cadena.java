package pe.edu.upc.model;

import java.util.ArrayList;
import java.util.stream.Stream;


public class Cadena {
    public ArrayList<String> getList() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rosa");
        lista.add("Rosc");
        lista.add("Rosd");
        lista.add("Rosf");
        lista.add("Rost");
        return lista;

    }
    public Stream<String> getStream(){
        return  getList().stream();
    }
}
