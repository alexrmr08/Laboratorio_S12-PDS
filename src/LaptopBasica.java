public class LaptopBasica extends Laptop {
    
    public LaptopBasica(String marca, String modelo, int anioFabricacion, String procesador, int tamanioPantalla) {
        super(marca, modelo, anioFabricacion, procesador, tamanioPantalla);
    }

    @Override
    public void ejecutarPrueba() {

        System.out.println("Ejecutando prueba en la laptop básica: " + marca + " " + modelo);
        System.out.println("Prueba de una Laptop Básica");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Prueba completada.\n");

    }
    
}