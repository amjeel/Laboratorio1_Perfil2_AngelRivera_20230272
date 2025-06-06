package AngelRivera_20230272;
import java.util.TreeMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido al sistema de gestion de productos");
        System.out.println("Que desea hacer?");
        System.out.println("1. Ver productos");
        System.out.println("2. Agregar productos");
        System.out.println("3. Editar/Actualizar productos");
        System.out.println("4. Eliminar productos");

        int OpcionMenu = 4;

        switch (OpcionMenu) {
            case 1:
            System.out.println("estos son los productos:");

        }
        TreeMap<String, Integer> productos = new TreeMap<>();
        productos.put("Mesa", 100);
        productos.put("Cama", 220);
        productos.put("cocina", 400);
        productos.put("Refri", 330);
        productos.put("Tv", 750);

        System.out.println("estos son los productos: " + productos);
    }

}