import java.util.Scanner;

public class tipodato{
    public static void main (String [] args){
        Scanner console = new Scanner (System.in);

        //Cadena 
        System.out.println("Ingresa tu nombre: ");
        String nombre = console.nextLine();
        // Caracter
        System.out.println("Ingresa tu inicial: ");
        char inicial = console.next().charAt(0);
        // Entero
        System.out.println("Ingresa tu edad: ");
        int edad = console.nextInt();
        // Decimal
        System.out.println("Ingresa tu estatura: ");
        float estatura = console.nextFloat();
        // Decimal
        System.out.println("Ingresa tu peso: ");
        double peso = console.nextDouble();
        // Booleano
        System.out.println("¿Eres estudiante? (true (sí), false (no))");
        Boolean estudiante = console.nextBoolean();
        if (estudiante){
            System.out.println("\nTu nombre es: " + nombre + "\nTu inicial es: " + inicial + "\nTu edad es: " + edad + "\nTu estatura es: " + estatura + "\nTu peso es: " + peso + "\ny eres Estudiante.");
        } 
        else{
            System.out.println("\nTu nombre es: " + nombre + "\nTu inicial es: " + inicial + "\nTu edad es: " + edad + "\nTu estatura es: " + estatura + "\nTu peso es: " + peso + "\ny no eres Estudiante.");
        }
    }
}