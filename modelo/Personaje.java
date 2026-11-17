package modelo;

import estrategia.EstrategiaAtaque;

public interface Personaje {
    String getNombre();
    int getAtaque();
    int getDefensa();
    int getVelocidad();
    int getHp();
    void setHp(int hp);
    EstrategiaAtaque getEstrategia();
    void setEstrategia(EstrategiaAtaque estrategia);
    ResultadoAtaque atacar(Personaje objetivo);

    // Igual que atacar(), pero recibe al personaje "completo" (ya decorado) para que
    // la estrategia use los atributos con todos los decoradores aplicados.
    ResultadoAtaque atacarComo(Personaje yo, Personaje objetivo);

    String getDescripcion();
}
