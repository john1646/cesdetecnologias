package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClsServicio {
    List<Clsjugador> bdjugador = new ArrayList<>();
    public void mostrar_todo (){
        bdjugador.add(new Clsjugador("10","John","delantero","34","colombia"));

        bdjugador.forEach(j->{
            System.out.println(j.toString());

        });
    }

    public void agregar(Clsjugador objj){
        bdjugador.add(objj);
    }

    public void buscar(String num_camiseta){
//        Optional<Clsjugador> jencontrado =bdjugador.stream().filter(x->x.getNum_cmiseta()==(num_camiseta)).findAny();
//        System.out.println(jencontrado);
//
//        if (jencontrado.isEmpty()) System.out.println("Jugador no se encuentra convocado");
        bdjugador.forEach(Clsjugador->{
            if (Clsjugador.getEdad()==("34")) System.out.println("se encontro");
        });
    }

}
