package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner objleer = new Scanner(System.in);
    ClsServicio objservicio = new ClsServicio();

        int menu;
        String num_cmiseta;
        String nombre, posicion,edad,equipo;
        do {
            System.out.println("SELECCION COLOMBIA");
            System.out.println("Opciones:: 1 Agregar - 2 Buscar - 3 Editar - 4 Mostrar 5 Salir");
            menu = objleer.nextInt();

            switch (menu){
                case 1:
                    System.out.println("Porfavor digite el numero de la camiseta");
                    num_cmiseta = objleer.next();
                    System.out.println("Porfavor digite el nombre del jugador");
                    nombre = objleer.next();
                    System.out.println("Porfavor digite laa posicion");
                    posicion = objleer.next();
                    System.out.println("Porfavor digite la edad");
                    edad = objleer.next();
                    System.out.println("Porfavor digite el equipo");
                    equipo = objleer.next();
                    Clsjugador objjugador = new Clsjugador(num_cmiseta,nombre,posicion,edad,equipo);
                    objservicio.agregar(objjugador);
                    break;

                case 4:
                    objservicio.mostrar_todo();
                    break;

                case 2:
                    System.out.println("Porfavor ingrese el numero de la camiseta del jugador a buscar");
                    num_cmiseta = objleer.next();
                    objservicio.buscar(num_cmiseta);
                    break;
                case 3:

                    break;

        }

            }while (menu != 5);
    }
}
