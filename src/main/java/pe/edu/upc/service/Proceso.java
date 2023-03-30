package pe.edu.upc.service;

import pe.edu.upc.model.Cadena;

import java.util.ArrayList;

public class Proceso {
    private Cadena cadena;
    public Proceso(){
        cadena = new Cadena();

    }

    public void listCadena(){
        ArrayList<String> names = cadena.getList();
        for (int i =0; i <names.size();i++){
            String name = names.get(i);
            System.out.println(name);
        }
    }

    public void listCadenaForeach(){
        ArrayList<String> names = cadena.getList();
        for (String name : names) {
            System.out.println(name);
        }
    }

    public void listCadenaForeachFunctional(){
        ArrayList<String> names = cadena.getList();
        names.forEach(name);}
    }

    public void listCadenaForeachLambda(){
        ArrayList<String> names = cadena.getList();
        names.forEach((name)->{ System.out.println(name);});
    }

    public void listCadenaForeachLambda2(){
        cadena.getList().forEach((name)-> { System.out.println(name);});
        //M = f(x).g(y).h(z);
    }

    public void listCadenaForeachMethodReference(){
        cadena.getList().forEach(System.out.println);

    }

    public void streamCadena(){
        cadena
                .getStream()
                .collect(Collector.toList())
                .forEach(System.out::println);

    }

}





