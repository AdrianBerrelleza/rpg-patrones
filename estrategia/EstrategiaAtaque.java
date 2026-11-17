package estrategia;

import modelo.Personaje;
import modelo.ResultadoAtaque;

public interface EstrategiaAtaque {
    ResultadoAtaque atacar(Personaje atacante, Personaje objetivo);
}
