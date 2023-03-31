public class Main {
    public static void main(String[] args)
    {
        Tecnologia Stock1 = new Tecnologia("Laptop","Blanco",3500,2.5);
        Tecnologia Stock2 = new Tecnologia("Tv","Negro",2500.99,4.5);

        System.out.println("Los datos antiguos son: ");
        System.out.println("Nombre = "+Stock2.nombre);
        System.out.println("Color = "+Stock2.color);
        System.out.println("Precio = "+Stock2.precio);
        System.out.println("Peso = "+Stock2.peso);

        //añadir adicional de precio en Stock2 (700.99); para 3200.99
        Stock2.adicional(699.99);

        System.out.println("\nLos datos actuales son: ");
        System.out.println("Nombre = "+Stock2.nombre);
        System.out.println("Color = "+Stock2.color);
        System.out.println("Precio = "+Stock2.precio);
        System.out.println("Peso = "+Stock2.peso);
    }
}