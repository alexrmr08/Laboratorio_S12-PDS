public class LaptopGamer extends Laptop{
    
    public LaptopGamer(String marca, String modelo, int anioFabricacion, String procesador, int tamanioPantalla) {
        super(marca, modelo, anioFabricacion, procesador, tamanioPantalla);
    }

    @Override
    public void ejecutarPrueba() {

        System.out.println("Prueba de Laptop Gamer");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Prueba gráfica completada.\n");

}