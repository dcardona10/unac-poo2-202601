package ejemplo01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws DivisionPorCeroException {

        int opcion = 0;
        double num1 = 0.0;
        double num2 = 0.0;
        Scanner scanner = new Scanner(System.in);

        while(opcion != 5) {
            System.out.println("Bienvenido al programa de operaciones matemáticas");
            System.out.println("Por favor, ingrese una opción de operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el primer número:");
                    num1 = scanner.nextDouble();
                    System.out.println("Ingrese el segundo número:");
                    num2 = scanner.nextDouble();
                    Operaciones suma = new Operaciones(num1, num2);
                    ServicioOperaciones servicioSuma = new ServicioOperaciones(suma);
                    System.out.println("El resultado de la suma es: " + servicioSuma.sumar(suma));
                    break;
                case 2:
                    System.out.println("Ingrese el primer número:");
                    num1 = scanner.nextDouble();
                    System.out.println("Ingrese el segundo número:");
                    num2 = scanner.nextDouble();
                    Operaciones resta = new Operaciones(num1, num2);
                    ServicioOperaciones servicioResta = new ServicioOperaciones(resta);
                    System.out.println("El resultado de la resta es: " + servicioResta.restar(resta));
                    break;
                case 3:
                    System.out.println("Ingrese el primer número:");
                    num1 = scanner.nextDouble();
                    System.out.println("Ingrese el segundo número:");
                    num2 = scanner.nextDouble();
                    Operaciones multiplicacion = new Operaciones(num1, num2);
                    ServicioOperaciones servicioMultiplicacion = new ServicioOperaciones(multiplicacion);
                    servicioMultiplicacion.multiplicar(multiplicacion);
                    break;
                case 4:
                    System.out.println("Ingrese el primer número:");
                    num1 = scanner.nextDouble();
                    System.out.println("Ingrese el segundo número:");
                    num2 = scanner.nextDouble();
                    Operaciones division = new Operaciones(num1, num2);
                    try {
                        ServicioOperaciones servicioDivision = new ServicioOperaciones(division);
                        System.out.println("El resultado de la división es: " + servicioDivision.dividir(division));
                    } catch (DivisionPorCeroException e) {
                        System.out.println("Error: " + e.getMessage());
                        e.printStackTrace();
                    }
                    break;
            }
        }        
    }
}
