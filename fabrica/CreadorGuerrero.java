package fabrica;

import estrategia.AtaqueEspada;
import modelo.Personaje;
import modelo.PersonajeBase;

public class CreadorGuerrero extends CreadorPersonaje {
    @Override
    public Personaje crearPersonaje(String nombre) {
        validarNombre(nombre);
        PersonajeBase p = new PersonajeBase(nombre, 120, 25, 15, 10);
        p.setEstrategia(new AtaqueEspada());
        return p;
    }
}
