package pe.edu.upc;

import pe.edu.upc.service.Proceso;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Proceso proceso = new Proceso();
        //proceso.listCadena();
        //proceso.listCadenaForeach();
        //proceso.listCadenaForeachLambda();
        //proceso.listCadenaForeachLambda2();
       // proceso.listCadenaForeachMethodReference();
        proceso.streamCadena();


    }
}