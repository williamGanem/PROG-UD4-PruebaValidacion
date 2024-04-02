import net.salesianos.Calculos.Calculo;
import net.salesianos.vehiculos.Camion;
import net.salesianos.vehiculos.Ciclomotor;
import net.salesianos.vehiculos.Vehiculo;

public class App {
    public static void main(String[] args) throws Exception {
        Ciclomotor ciclomotor = new Ciclomotor(false, "carro", 50, 39, 4, 0);
        ciclomotor.acelerando();
        System.out.println(ciclomotor.toString());
        Camion camion = new Camion("toyota", 200, 500, 5, 0, 300);
        camion.acelerando();
        System.out.println(camion.toString());
        Vehiculo vehiculo = new Vehiculo("tesla", 100, 1000, 5, 0);
        vehiculo.acelerando();
        System.out.println(vehiculo.toString());
        Calculo.factorialDeN(3);
    }
}
