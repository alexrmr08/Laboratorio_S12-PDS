public class CreadorLaptopGamer extends LaptopCreador {
 
    @Override
    public Laptop crearLaptop() {

        return new LaptopBasica(
                "Lenovo",
                "IdeaPad 3",
                2024,
                "Intel Core i3",
                15
        );

    }

}