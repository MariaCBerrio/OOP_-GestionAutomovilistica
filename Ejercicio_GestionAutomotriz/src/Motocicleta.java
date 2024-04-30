public class Motocicleta extends VehiculoBase {

    public Motocicleta(String marca, String placa, String modelo, float velocidadActual, String estadoMovimiento) {
        super(marca, placa, modelo, velocidadActual, estadoMovimiento);
    }

    private static final int velocidadMax = 150;

    @Override
    public String acelerar(float velocidad) {
        if (estadoMovimiento.equals("Encendido")) {
            if ((velocidadActual + velocidad) <= velocidadMax) {
                System.out.println("La motocicleta de placa " + placa + " va a: " + velocidadActual + " km/h.");
                velocidadActual += velocidad;
                System.out.println("Acelerando...");
                return "Ahora, la motocicleta de placa " + placa + " va a: " + velocidadActual + " km/h.";
            } else {
                return "Recuerde que la velocidad máxima para las motocicletas es " + velocidadMax + " km/h.";
            }
        } else {
            return "No es posible acelerar mientras el vehículo esté apagado.";
        }
    }

}
