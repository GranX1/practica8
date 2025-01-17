package practica8;

public class Microprocesador extends ComponenteElectronico {
    private final int cacheRAM;
    private final long velocidadHz;

    public Microprocesador(int cacheRAM, long velocidadHz) {
        this.cacheRAM = cacheRAM;
        this.velocidadHz = velocidadHz;
    }

    public int getCacheRAM() {
        return cacheRAM;
    }

    public long getVelocidadHz() {
        return velocidadHz;
    }

    @Override
    public String toString() {
        return "Microprocesador{" +
                "cacheRAM=" + cacheRAM +
                ", velocidadHz=" + velocidadHz +
                ", esParteDe=" + (getEsParteDe() != null ? getEsParteDe().getNombre() : "ninguno") +
                '}';
    }
}

