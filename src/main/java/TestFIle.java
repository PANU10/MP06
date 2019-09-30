import java.io.File;

public class TestFIle {
    public static void main(String[] args) {
        File path = new File("/home/dam2a/Prueba/FileTEst.txt");

        // En caso de que no existe el fichero.
        if (!path.exists()){
            System.out.println("El archivo no existe");
            return;
        }

        // Nombre Completo
        System.out.println("Nombre: " + path.getName());

        // Comproibar si el archivo existe o no.
        System.out.println("-----------");
        System.out.println("Existe este archivo?"+ "-> " + path.exists());

        // Probando otros metodos.
        System.out.println("-----------");
        System.out.println("Read: "+ (path.canRead() ? "Si" : "No"));
        System.out.println("Write: "+ (path.canRead() ? "Si" : "No"));
        System.out.println("Execute: "+ (path.canExecute() ? "Si" : "No"));
        System.out.println("File: "+ (path.isFile() ? "Si" : "No"));
        System.out.println("Directory: "+ (path.isDirectory() ? "Si" : "No"));

    }
}
