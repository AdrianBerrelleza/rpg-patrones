package estrategia;

import modelo.Personaje;
import modelo.ResultadoAtaque;

// Daño mágico: ignora la defensa del objetivo.
public class AtaqueHechizo implements EstrategiaAtaque {
    @Override
    public ResultadoAtaque atacar(Personaje atacante, Personaje objetivo) {
        return new ResultadoAtaque(atacante.getAtaque(), false, "hechizo");
    }
}
