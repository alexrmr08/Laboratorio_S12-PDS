public class CreadorLaptopProfesional extends LaptopCreador{
 
    @Override
    public Laptop crearLaptop() {

        return new LaptopProfesional(
                "Dell",
                "XPS 15",
                2024,
                "Intel Core Ultra 7",
                15
        );

    }

}