package fabrica;

import estrategia.AtaqueEspada;
import modelo.Personaje;
import modelo.PersonajeBase;

public class CreadorGoblin extends CreadorEnemigo {
    @Override
    public Personaje crearEnemigo() {
        PersonajeBase e = new PersonajeBase("Goblin salvaje", 60, 13, 5, 12);
        e.setEstrategia(new AtaqueEspada());
        return e;
    }
}
