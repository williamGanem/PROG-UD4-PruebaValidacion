package net.salesianos.vehiculos;

public class Ciclomotor extends Vehiculo {
    private boolean habilitado;

    public Ciclomotor(boolean habilitado, String marca, float peso, float potencia, int numeroPuertas,
            float velocidad) {
        super(marca, peso, potencia, numeroPuertas, velocidad);
        this.habilitado = habilitado;

    }

    @Override
    public void acelerando() {
        this.velocidad = velocidad + 7;
        System.out.println("prrrrr");

    }

    @Override
    public String toString() {
        String data = "* Tipo de vehículo: Ciclomotor." +
                "* Marca:" + this.marca + "\n" +
                "* Peso:" + this.peso + "Kg" + "\n" +
                "* Potencia:" + this.potencia + "KW" + "\n" +
                "* Puede ir por autopista:" + this.habilitado + "\n" +
                "* Velocidad actual:" + this.velocidad + "Km/h";
        return data;
    }
}
