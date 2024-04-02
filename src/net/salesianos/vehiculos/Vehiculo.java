package net.salesianos.vehiculos;

public class Vehiculo {
    protected String marca;
    protected float peso;
    protected float potencia;
    protected int numeroPuertas;
    protected float velocidad;

    public Vehiculo() {
    }

    public Vehiculo(String marca, float peso, float potencia, int numeroPuertas, float velocidad) {
        this.marca = marca;
        this.peso = peso;
        this.potencia = potencia;
        this.numeroPuertas = numeroPuertas;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPotencia() {
        return this.potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public int getNumeroPuertas() {
        return this.numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public float getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public void acelerando() {
        velocidad = velocidad + 10;
        System.out.println("Esta acelerando");
    }

    public void detenerse() {
        velocidad = 0;
        System.out.println("El vehiculo se ha detenido");
    }

    @Override
    public String toString() {
        String data = "* Vehiculo:" + "\n" +
                "* Marca:" + this.marca + "\n" +
                "* Peso:" + this.peso + "Kg" + "\n" +
                "* Potencia:" + this.potencia + "KW" + "\n" +
                "* Velocidad actual:" + this.velocidad + "Km/h";
        return data;
    }
}
