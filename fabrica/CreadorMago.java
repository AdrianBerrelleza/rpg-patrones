package fabrica;

import estrategia.AtaqueHechizo;
import modelo.Personaje;
import modelo.PersonajeBase;

public class CreadorMago extends CreadorPersonaje {
    @Override
    public Personaje crearPersonaje(String nombre) {
        validarNombre(nombre);
        PersonajeBase p = new PersonajeBase(nombre, 100, 20, 10, 15);
        p.setEstrategia(new AtaqueHechizo());
        return p;
    }
}
