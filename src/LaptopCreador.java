public abstract class LaptopCreador {

    public abstract Laptop crearLaptop();

    public void ejecutarPrueba() {

        Laptop laptop = crearLaptop();

        laptop.ejecutarPrueba();

    }
    
}