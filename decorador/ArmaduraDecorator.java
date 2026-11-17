package decorador;

import modelo.Personaje;

// Decorador que modifica ATRIBUTOS: +8 defensa.
public class ArmaduraDecorator extends PersonajeDecorator {
    public ArmaduraDecorator(Personaje personaje) { super(personaje); }

    @Override public int getDefensa() { return personaje.getDefensa() + 8; }
    @Override public String getDescripcion() { return personaje.getDescripcion() + " + Armadura"; }
}
