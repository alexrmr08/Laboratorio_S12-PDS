public class Aplicacion {
    
    public static void main(String[] args) {

        LaptopCreador creador;

        creador = new CreadorLaptopBasica();
        creador.ejecutarPrueba();

        creador = new CreadorLaptopGamer();
        creador.ejecutarPrueba();

        creador = new CreadorLaptopProfesional();
        creador.ejecutarPrueba();

    }

}
