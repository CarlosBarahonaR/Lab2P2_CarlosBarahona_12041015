/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_carlosbarahona_12041015;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab2P2_CarlosBarahona_12041015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animales pinguino = new Animales("Spheniscidae", "Pingüino", "Areas heladas", "Peces", "Pequeños con un pico anaranjado y con color negro en su cuerpo y blanco en su estomago", "Hemisferio Sur", 50);
        Animales leon = new Animales("Panthera leo", "León", "Sabanas", "Carne", "Tienen una melena que cubre su cabeza y son grandes con dientes filudos", "África ", 150);
        Animales elefante = new Animales("Elephantidae", "Elefante", "Selva tropical", "Hierba", "Son gigantes con cuernos cerca de sus bocas con un trompa gigante y orejas gigantes", "África ", 250);
        Scanner r = new Scanner(System.in);
        ArrayList<Animales> animales = new ArrayList();
        animales.add(pinguino);
        animales.add(leon);
        animales.add(elefante);
        int opcion = 0;
        while (opcion != 6) {
            System.out.println("Bienvenido a Animal Planet Database\n"
                    + "¿Qué desea hacer?\n"
                    + "1) Agregar animal\n"
                    + "2) Modificar animal\n"
                    + "3) Imprimir animal\n"
                    + "4) Alimentar animal\n"
                    + "5) Eliminar animal\n"
                    + "6) Salir");
            opcion = r.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese el nombre cientifico del animal");
                    String nombreCientifico = r.nextLine();
                    for (int x = 0; x < animales.size(); x++) {
                        String nombre = "";
                        if (animales.get(x) instanceof Animales) {
                            nombre = ((Animales) animales.get(x)).getNombreCientifico();
                        }
                        while (nombreCientifico.equals(nombre)) {
                            System.out.println("Ingrese el nombre cientifico del animal");
                            nombreCientifico = r.nextLine();
                        }
                    }

                    r.nextLine();
                    System.out.println("Ingrese el nombre comun del animal");
                    String nombreComun = r.nextLine();
                    r.nextLine();
                    System.out.println("Ingrese el habitat del animal");
                    String habitat = r.nextLine();
                    r.nextLine();
                    System.out.println("Ingrese la alimentación del animal");
                    String alimentacion = r.nextLine();
                    r.nextLine();
                    System.out.println("Ingrese la descripcion del animal");
                    r.nextLine();
                    String descripcion = r.nextLine();
                    System.out.println("Ingrese distribucion geografica del animal");
                    String puesto = r.nextLine();
                    r.nextLine();
                    System.out.println("Ingrese la vida del animal");
                    int vida = r.nextInt();

                    for (int y = 0; y < animales.size(); y++) {
                        int vida2 = 0;
                        if (animales.get(y) instanceof Animales) {
                            vida2 = ((Animales) animales.get(y)).getVida();
                        }
                        while (vida2 == vida) {
                            System.out.println("Ingrese la vida del animal");
                            vida = r.nextInt();
                        }
                    }

                    animales.add(new Animales(nombreCientifico, nombreComun, habitat, alimentacion, descripcion, puesto, vida));
                    break;
                }

                case 2: {
                    int opcion2 = 0;
                    while (opcion2 != 3) {
                        System.out.println("¿Qué desea hacer?\n"
                                + "1) Modificar atributo en especifico de animal\n"
                                + "2) Modificar animal entero\n"
                                + "3) Salir");
                        opcion2 = r.nextInt();
                        switch (opcion2) {
                            case 1: {

                                System.out.println("Ingrese el nombre cientifico del animal para buscarlo");
                                String nombreCientifico = r.nextLine();
                                r.nextLine();

                                int item2 = 0;

                                for (int z = 0; z < animales.size(); z++) {
                                    String nc = "";
                                    if (animales.get(z) instanceof Animales) {
                                        nc = ((Animales) animales.get(z)).getNombreCientifico();
                                    }
                                    if (nombreCientifico.equals(nc)) {
                                        item2 = z;
                                        z = animales.size();
                                    } else {
                                        item2 = 100000;
                                    }
                                }
                                if (item2 <= animales.size()) {
                                    if (animales.get(item2) instanceof Animales) {
                                        System.out.println("¿Que desea modificar?\n"
                                                + "1) Nombre cientifico \n"
                                                + "2) Nombre comun \n"
                                                + "3) Habitat \n"
                                                + "4) Alimentacion \n"
                                                + "5) Descripcion de rasgos \n"
                                                + "6) Distribucion geografica \n"
                                                + "7) Vida\n"
                                                + "8) Salir");

                                        int opcion3 = r.nextInt();

                                        while (opcion3 != 8) {
                                            switch (opcion3) {
                                                case 1: {

                                                    System.out.println("Ingrese el nombre cientifico del animal");
                                                    String nombreCientifico3 = r.nextLine();

                                                    for (int x = 0; x < animales.size(); x++) {
                                                        String nombre = "";
                                                        if (animales.get(x) instanceof Animales) {
                                                            nombre = ((Animales) animales.get(x)).getNombreCientifico();
                                                        }
                                                        while (nombreCientifico3.equals(nombre)) {
                                                            System.out.println("Ingrese el nombre cientifico del animal");
                                                            nombreCientifico3 = r.nextLine();
                                                        }
                                                    }

                                                    ((Animales) animales.get(item2)).setNombreCientifico(nombreCientifico3);

                                                }

                                                case 2: {

                                                    ((Animales) animales.get(item2)).setNombreComun(r.nextLine());
                                                    r.nextLine();
                                                }
                                                case 3: {

                                                    ((Animales) animales.get(item2)).setHabitat(r.nextLine());
                                                    r.nextLine();

                                                }
                                                case 4: {

                                                    ((Animales) animales.get(item2)).setAlimentacion(r.nextLine());
                                                    r.nextLine();
                                                }
                                                case 5: {

                                                    ((Animales) animales.get(item2)).setDescripcionRasgos(r.nextLine());
                                                    r.nextLine();

                                                }
                                                case 6: {

                                                    ((Animales) animales.get(item2)).setDescripcionRasgos(r.nextLine());
                                                    r.nextLine();
                                                }
                                                case 7: {

                                                    System.out.println("Ingrese la vida del animal");
                                                    int vida = r.nextInt();

                                                    for (int y = 0; y < animales.size(); y++) {
                                                        int vida2 = 0;
                                                        if (animales.get(y) instanceof Animales) {
                                                            vida2 = ((Animales) animales.get(y)).getVida();
                                                        }
                                                        while (vida2 == vida) {
                                                            System.out.println("Ingrese la vida del animal");
                                                            vida = r.nextInt();
                                                        }
                                                    }
                                                    ((Animales) animales.get(item2)).setVida(r.nextInt());
                                                }

                                            }
                                        }
                                    }

                                } else {
                                    System.out.println("No se encontro el animal que se buscaba");
                                }

                            }

                            case 2: {

                                System.out.println("Ingrese la posicon de la lista del animal que desea modificar");
                                int posicion = r.nextInt();
                                r.nextLine();

                                System.out.println("Ingrese el nombre cientifico del animal");
                                String nombreCientifico3 = r.nextLine();

                                for (int f = 0; f < animales.size(); f++) {
                                    String nombre = "";
                                    if (animales.get(f) instanceof Animales) {
                                        nombre = ((Animales) animales.get(f)).getNombreCientifico();
                                    }
                                    while (nombreCientifico3.equals(nombre)) {
                                        System.out.println("Ingrese el nombre cientifico del animal");
                                        nombreCientifico3 = r.nextLine();
                                    }
                                }
                                r.nextLine();
                                System.out.println("Ingrese el nombre comun del animal");
                                String nombreComun3 = r.nextLine();
                                r.nextLine();
                                System.out.println("Ingrese el habitat del animal");
                                String habitat3 = r.nextLine();
                                r.nextLine();
                                System.out.println("Ingrese la alimentación del animal");
                                String alimentacion3 = r.nextLine();
                                r.nextLine();
                                System.out.println("Ingrese la descripcion del animal");
                                r.nextLine();
                                String descripcion3 = r.nextLine();
                                System.out.println("Ingrese distribucion geografica del animal");
                                String puesto3 = r.nextLine();
                                r.nextLine();
                                System.out.println("Ingrese la vida del animal");
                                int vida = r.nextInt();

                                for (int j = 0; j < animales.size(); j++) {
                                    int vida2 = 0;
                                    if (animales.get(j) instanceof Animales) {
                                        vida2 = ((Animales) animales.get(j)).getVida();
                                    }
                                    while (vida2 == vida) {
                                        System.out.println("Ingrese la vida del animal");
                                        vida = r.nextInt();
                                    }
                                }

                                Animales animal = new Animales(nombreCientifico3, nombreComun3, habitat3, alimentacion3, descripcion3, puesto3, vida);

                                try {

                                    animales.set(posicion, animal);
                                } catch (Exception e) {
                                    System.out.println("La posición establecida para modificar no existe.");
                                }

                            }
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("¿Como desea imprimir?\n"
                            + "1) Imprimir por posicion de la lista \n"
                            + "2) Imprimir lista completa \n"
                            + "3) Imprimir por nombre científico \n"
                            + "4) Salir");

                    int opcion3 = r.nextInt();

                    while (opcion3 != 4) {
                        switch (opcion3) {
                            case 1: {
                                System.out.println("Ingrese la posicon de la lista del animal que desea imprimir");
                                int posicion = r.nextInt();

                                try {

                                    System.out.println(animales.get(posicion));
                                } catch (Exception e) {
                                    System.out.println("La posición establecida para imprimir no existe.");
                                }
                                break;
                            }
                            case 2: {
                                for (int u = 0; u < animales.size(); u++) {
                                    if (animales.get(u) instanceof Animales) {
                                        System.out.println(animales.get(u));

                                    }
                                }
                                break;
                            }
                            case 3: {
                                System.out.println("Ingrese el nombre cientifico del animal para buscarlo");
                                String nombreCientifico = r.nextLine();
                                r.nextLine();

                                int item2 = 0;

                                for (int z = 0; z < animales.size(); z++) {
                                    String nc = "";
                                    if (animales.get(z) instanceof Animales) {
                                        nc = ((Animales) animales.get(z)).getNombreCientifico();
                                    }
                                    if (nombreCientifico.equals(nc)) {
                                        item2 = z;
                                        z = animales.size();
                                    } else {
                                        item2 = 100000;
                                    }
                                }
                                if (item2 <= animales.size()) {
                                    if (animales.get(item2) instanceof Animales) {
                                        System.out.println(animales.get(item2));
                                    }
                                }
                                break;
                            }
                        }

                        break;
                    }
                }

                case 4: {
                    System.out.println("Ingrese la posicon del animal que se alimentara");
                    int posicion = r.nextInt();
                    System.out.println("Ingrese la posicon del animal que sera devorado");
                    int posicion2 = r.nextInt();

                    try {

                        int vida = animales.get(posicion).getVida();
                        int vida2 = animales.get(posicion2).getVida();
                        animales.get(posicion).setVida(vida + vida2);
                        animales.remove(posicion2);
                    } catch (Exception e) {
                        System.out.println("Una de las posiciones establecidas no existe.");
                    }

                    break;
                }

            }
        }
    }
}
