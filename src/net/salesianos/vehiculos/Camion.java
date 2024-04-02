package net.salesianos.vehiculos;

public class Camion extends Vehiculo {

    private float capacidadDeCarga;

    public Camion(String marca, float peso, float potencia, int numeroPuertas, float velocidad,
            float capacidadDeCarga) {
        super(marca, peso, potencia, numeroPuertas, velocidad);
        this.capacidadDeCarga = capacidadDeCarga;
    }

    @Override
    public void acelerando() {
        this.velocidad = velocidad + 5;
        System.out.println("trutrutru");

    }

    @Override
    public String toString() {
        String data = "* Tipo de vehículo: Ciclomotor." +
                "* Marca:" + this.marca + "\n" +
                "* Peso:" + this.peso + "Kg" + "\n" +
                "* Potencia:" + this.potencia + "KW" + "\n" +
                "* Capacidad de carga:" + this.capacidadDeCarga + "Kg" + "\n" +
                "* Velocidad actual:" + this.velocidad + "Km/h";
        return data;
    }

}
