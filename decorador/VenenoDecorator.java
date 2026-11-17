package decorador;

import modelo.Personaje;
import modelo.ResultadoAtaque;

// Decorador que modifica el DAÑO (atacar): +5 de daño por veneno en cada ataque.
public class VenenoDecorator extends PersonajeDecorator {
    public VenenoDecorator(Personaje personaje) { super(personaje); }

    @Override
    public ResultadoAtaque atacarComo(Personaje yo, Personaje objetivo) {
        ResultadoAtaque r = super.atacarComo(yo, objetivo);
        return new ResultadoAtaque(r.getDano() + 5, r.isCritico(), r.getEfecto() + " + veneno");
    }

    @Override public String getDescripcion() { return personaje.getDescripcion() + " + Veneno"; }
}
