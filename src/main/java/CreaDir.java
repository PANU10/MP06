import java.io.File;
import java.util.Scanner;

public class CreaDir {
    public static void main(String[] args) {

        System.out.println("Introduce el directorio donde va a crear directorio: ");
        Scanner dir = new Scanner(System.in);
        File route = new File(dir.nextLine());


        if (!route.isDirectory()) System.out.println("Ruta no valida");
        System.out.println("Nombre directorio: ");
        route = new File(route.getAbsolutePath()+"/"+dir.nextLine());


        dir.close();

        if (route.exists()){
            System.out.println("Directorio ya existe");
        }
        else if (route.mkdir()){
            System.out.println("Directorio Creado");
        }
        else {
            System.out.println("No ha podido crear el directorio");
        }
    }
}
