package clase3;

import java.util.Scanner;

public class EjPropuestos {

    public static float DOLAR = 190;

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int doble = elDobleDe(5);
        System.out.println("El doble de cinco es " + doble);


        mayorA(40);


        int multiplicacion = multiplicacionDe(2,3);
        System.out.println("El resultado de la multiplicacion es " + multiplicacion);

        // si quiero que el usuario me ingrese los numeros

        System.out.println("Ingrese el primer numero");
        int num1 = input.nextInt();

        System.out.println("Ingrese un segundo numero");
        int num2 = input.nextInt();

        int multiplicar = multiplicacionDe(num1,num2);
        System.out.println("El resultado de la operacion es " + multiplicar);

        int suma = laSumaDe(1,4,10);
        System.out.println("La suma de los numeros es " + suma);


        double multiplicarD = multiplicacionD(2,5.5);
        System.out.println("La multiplicacion es " + multiplicarD);


        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un primer numero");
        int nume1 = teclado.nextInt();
        System.out.println("ingrese el segundo numero");
        int nume2 = teclado.nextInt();

        mayorQue(nume1,nume2);


        int sumatoria = laSuma(6);
        System.out.println("LA SUMATORIA ES " +sumatoria);


        esPar(8);


        float area = calcularArea(2,5);
        System.out.println("El area del paralelogramo es " + area);


        Scanner tecla = new Scanner(System.in);
        System.out.println("Ingrese su sueldo");
        float sueldo = tecla.nextFloat();
        float dolares = cantidadDolares(sueldo);
        System.out.println("Con su sueldo, ud puede comprar U$S" + dolares);


        float iva = calcularIva(1000);
        System.out.println("El iva del sueldo es " + iva);

        //si el sueldo lo debe ingresar el usuario
        //Scanner input = new Scanner(System.in);
        System.out.println("Ingrase su Sueldo nominal");
        float sueldoNominal = input.nextFloat();

        float ivaSN = calcularIva(sueldoNominal);
        System.out.println("El iva del sueldo es " + ivaSN);


        System.out.println("Ingrese un Minimo");
        int min = input.nextInt();
        System.out.println("Ingrese un Maximo");
        int max = input.nextInt();

        System.out.println("Ingrese su edad");
        int edad = input.nextInt();

        estaDentroDelRango( min, max,edad);

    }

    //Ej 1 : metodo que reciba un numero y retorne su doble
    public static int elDobleDe(int num) {
        return 2 * num;
    }

    //ej 2 : metodo que reciba un numero entero e imprima en pantalla en caso
    //de ser mayor a 20 -->"es mayor a 20", de lo contrario "no es mayor a 20"
    public static void mayorA(int num) {
        if (num >= 20) {
            System.out.println("El numero es mayor a 20");
        } else {
            System.out.println("El numero es menor a 20");
        }
    }

    //ej 3 : metodo que reciba dos enternos y retorne la miltiplicacion de los mismos
    public  static int multiplicacionDe(int num1, int num2){
        return num1 * num2;
    }

    //ej 4 : metodo que reciba tres numeros y retorne su suma
    public static int laSumaDe(int num1, int num2, int num3){
       return num1 + num2 + num3;
    }

    //ej 5 : metodo que reciba un entero y un num double y retorne su multiplicacion
    public static double multiplicacionD (int num1, double num2){
        return num1 * num2;
    }
    //ej 6 : metodo que reciba dos numeros ingresados por el usuario, y que se devuelve el mayor de ellos
    public static void mayorQue (int nume1, int nume2){
        if (nume1 > nume2){
            System.out.println("El primer numero ingresado es mayor!!");
        }else if (nume1 < nume2){
            System.out.println("El segundo numero ingresado es mayor!!");
        }else
            System.out.println("Los numeros son iguales!!");
    }


    //ej 7 : metodo que reciba un numero n, y muestre la suma desde 1 a n.
    public static int laSuma (int n){
        int laSuma = 0;

        for (int i = 1; i <= n ; i++) {
            laSuma = laSuma + i;
        }
        return laSuma;
    }


    //ej 8: metodo que retone verdadero si el numero es par sino falso
    public static void esPar (int numero){
        if (numero %2 == 0){
            System.out.println("Verdadero");
        }else
            System.out.println("Falso");
    }


    //ej 9:

    
    //ej 10 : metodo que reciba alto y ancho de un paralelogramo y retorne su area
    public static float calcularArea(float alto, float ancho){
        return alto * ancho;
    }


    //ej 11: programa que indique cuantos dolares puede comprar con su sueldo / dolar :190
    public static float cantidadDolares (float sueldo){
        return  sueldo / DOLAR;
    }


    //ej 12 : realizar metodo llamado "calcularIva", que calcule el iva del 22% dado un
    //numero float llamado sueldo
    public static float calcularIva(float sueldo){
        return (float) (sueldo * 0.22);
    }


    //ej 13, programa que tenga como parametro  un maximo y un min , y se pida el ingreso de un numero y que diga
    //"el n es valido" si esta dentro del rango sino, "el numero es invalido"

    public static void estaDentroDelRango (int min, int max, int edad){
        if ( min < edad  && edad < max){
            System.out.println("Edad valida para votar");
        }else{
            System.out.println("No puede votar");
        }

    }
}

