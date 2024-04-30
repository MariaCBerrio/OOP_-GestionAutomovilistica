public class VehiculoBase implements Vehiculo {

    protected String marca;
    protected String placa;
    protected String modelo;
    protected float velocidadActual;
    protected String estadoMovimiento;

    public VehiculoBase(String marca, String placa, String modelo, float velocidadActual, String estadoMovimiento) {
        this.marca = marca;
        this.placa = placa;
        this.modelo = modelo;
        this.velocidadActual = velocidadActual;
        this.estadoMovimiento = estadoMovimiento;
    }


    public void onOff() {
        if (estadoMovimiento.equals("Apagado")) {
            estadoMovimiento = "Encendido";
            System.out.println("El vehículo de placa " + placa + " ha sido encendido");
        } else if (velocidadActual > 0 && estadoMovimiento.equals("Encendido")){
            System.out.println("Frenando vehículo...");
            estadoMovimiento = "Apagado";
            velocidadActual = 0;
            System.out.println("El vehículo de placa " + placa + " ha sido apagado");
        } else {
            estadoMovimiento = "Apagado";
            System.out.println("El vehículo de placa " + placa + " ha sido apagado");
        }
    }
    @Override
    public String toString() {
        return "{ " +
                "Marca = " + marca +
                ", Placa = " + placa +
                ", Modelo = " + modelo +
                ", Velocidad actual = " + velocidadActual +
                ", Estado de movimiento = " + estadoMovimiento +
                '}';
    }

    @Override
    public String acelerar(float velocidad) {
        if (velocidadActual >= 0 && estadoMovimiento.equals("Encendido") ) {
            System.out.println("El vehiculo de placa " + placa + " va a: " + velocidadActual + " km/h.");
            velocidadActual += velocidad;
            System.out.println("Acelerando...");
            return "Ahora, el vehiculo de placa " + placa + " va a: " + velocidadActual + " km/h.";
        } else if (estadoMovimiento.equals("Apagado")) {
            return "El vehiculo de placa " + placa + " está apagado. No es posible acelerar en este momento.";
        }
        return "";
    }

    @Override
    public void frenar() {
        if (velocidadActual > 0) {
            System.out.println("El vehiculo de placa " + placa + " va a: " + velocidadActual + " km/h");
            velocidadActual = 0;
            System.out.println("Frenando...");
            System.out.println("El vehículo de placa " + placa + " ha frenado.");
        } else if (velocidadActual == 0) {
            System.out.println("El vehículo está detenido.");
        }
    }

    @Override
    public String obtenerEstado() {
        return "El estado actual del vehículo de placa " + placa + " es: " + estadoMovimiento;
    }
}
