package estrategia;

import modelo.Personaje;
import modelo.ResultadoAtaque;

// Daño físico: el ataque se reduce con la defensa del objetivo (mínimo 1).
public class AtaqueEspada implements EstrategiaAtaque {
    @Override
    public ResultadoAtaque atacar(Personaje atacante, Personaje objetivo) {
        int dano = Math.max(1, atacante.getAtaque() - objetivo.getDefensa());
        return new ResultadoAtaque(dano, false, "espada");
    }
}
