package src;

public abstract class Laptop {

    protected String marca;
    protected String modelo;
    protected int anioFabricacion;
    protected String procesador;
    protected int tamanioPantalla;

    public Laptop(String marca, String modelo, int anioFabricacion, String procesador, int tamanioPantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.procesador = procesador;
        this.tamanioPantalla = tamanioPantalla;
    }

    public abstract void ejecutarPrueba();

}