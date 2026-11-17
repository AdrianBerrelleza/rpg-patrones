package decorador;

import modelo.Personaje;

// Decorador que modifica ATRIBUTOS: +10 ataque.
public class EspadaDecorator extends PersonajeDecorator {
    public EspadaDecorator(Personaje personaje) { super(personaje); }

    @Override public int getAtaque() { return personaje.getAtaque() + 10; }
    @Override public String getDescripcion() { return personaje.getDescripcion() + " + Espada"; }
}
