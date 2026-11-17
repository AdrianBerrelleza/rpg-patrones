package fabrica;

import estrategia.AtaqueHechizo;
import modelo.Personaje;
import modelo.PersonajeBase;

public class CreadorBrujo extends CreadorEnemigo {
    @Override
    public Personaje crearEnemigo() {
        PersonajeBase e = new PersonajeBase("Brujo oscuro", 80, 18, 8, 10);
        e.setEstrategia(new AtaqueHechizo());
        return e;
    }
}
