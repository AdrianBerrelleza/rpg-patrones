import decorador.ArmaduraDecorator;
import decorador.EspadaDecorator;
import decorador.VenenoDecorator;
import fabrica.*;
import modelo.Personaje;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre del personaje:");
        String nombre = sc.nextLine();
        System.out.println("Clase (1=Guerrero, 2=Mago):");
        int clase = Integer.parseInt(sc.nextLine().trim());
        System.out.println("Equipamiento separado por comas (1=Espada, 2=Armadura, 3=Veneno; vacío=ninguno):");
        String equipo = sc.nextLine();
        System.out.println("Enemigo (1=Goblin, 2=Brujo):");
        int tipoEnemigo = Integer.parseInt(sc.nextLine().trim());
        System.out.println();

        // Factory Method
        CreadorPersonaje creador = (clase == 1) ? new CreadorGuerrero() : new CreadorMago();
        Personaje heroe = creador.crearPersonaje(nombre);

        // Decorator (se aplican en el orden en que se escribieron)
        for (String opcion : equipo.split(",")) {
            switch (opcion.trim()) {
                case "1": heroe = new EspadaDecorator(heroe); break;
                case "2": heroe = new ArmaduraDecorator(heroe); break;
                case "3": heroe = new VenenoDecorator(heroe); break;
                default: break;
            }
        }

        System.out.println("Héroe: " + heroe.getDescripcion());
        System.out.println("ATK: " + heroe.getAtaque()
            + " | DEF: " + heroe.getDefensa()
            + " | VEL: " + heroe.getVelocidad()
            + " | HP: " + heroe.getHp());

        // Factory Method
        CreadorEnemigo creadorEnemigo = (tipoEnemigo == 1) ? new CreadorGoblin() : new CreadorBrujo();
        Personaje enemigo = creadorEnemigo.crearEnemigo();
        System.out.println("Enemigo: " + enemigo.getNombre() + " | HP: " + enemigo.getHp());

        // Strategy + combate
        new MotorCombate().iniciarCombate(heroe, enemigo);
    }
}
