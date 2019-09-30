import java.io.File;
import java.util.Scanner;

public class MostraFitxers {
    public static void main(String[] args) {

        System.out.println("Introduce PATH: ");
        Scanner path = new Scanner(System.in);

        File ruta = new File(path.nextLine());
        System.out.println(ruta.getAbsoluteFile());
        String [] archivo = ruta.list();

        for (int i = 0; i <archivo.length ; i++) {
            System.out.println(archivo[i]);
        }
    }
}
