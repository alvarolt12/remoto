import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("¿Cuantos popochos tienes en casa?");
        int popochos= scan.nextInt();

        if(popochos== 0){
            System.out.println("Deberias conseguir uno.");
        }

        else if(popochos == 1){
            System.out.println("Tu popocho está muy mimado.");
            }

        else if(popochos >= 2 && popochos <= 3){
            System.out.println("La familia está equilibrada.");
        }

        else if(popochos < 0){
            System.out.println("No puedes tener popochos negativos.");
        }
        else{
            System.out.println("Son demasiados popochos para una cama");
        }

        for(int i= 1; i <= popochos ;i++){
            System.out.println("El popocho "+ i+ " esta Zzz...");
        }
    }
}