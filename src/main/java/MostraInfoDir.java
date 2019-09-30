import java.io.File;
import java.util.Scanner;

public class MostraInfoDir {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) {


        // write your code here
            System.out.println("Introduce path: ");
            Scanner path = new Scanner(System.in);
            File dire = new File(path.nextLine());
            String[] file = dire.list();

            int l =0;
            for (int i = 0; i <file.length ; i++) {
                if (l>=6){
                    System.out.println();
                    l=0;
                }
                System.out.print(" "+ file[i]);
                l++;
            }
        }
    }
