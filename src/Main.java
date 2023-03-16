public class Main {
    public static void main(String[] args) {
        bucleIf(-5);
        bucleWhile(1);
        bucleDoWhile();
        bucleFor();
        bucleSwitch(6);
    }

    public static void bucleIf(int numeroIf ){
        if (numeroIf > 0){
            System.out.println("es positivo");
        } else if (numeroIf < 0) {
            System.out.println("es negativo");
        } else {
            System.out.println("el numero es 0");
        }
    }

    public static void bucleWhile(int numeroWhile){
        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println("se ejecuto el bucle while: " + numeroWhile);
        }
    }

    public static void bucleDoWhile(){
        int i = 0;
        do {
            System.out.println("se ejecuto el bucle doWhile");
            i++;
        } while (i < 1);
    }

    public static void bucleFor(){
        for (int i = 0; i <= 3; i++){
            System.out.println("Se ejecuto el bucle For: " + i);
        }
    }

    public static void bucleSwitch(int estacion){
        switch (estacion){
            case 1:
                System.out.println("La estacion es Verano");
                break;
            case 2:
                System.out.println("La estacion es Otoño");
                break;
            case 3:
                System.out.println("La estacion es Invierno");
                break;
            case 4:
                System.out.println("La estacion es Primavera");
                break;
            default:
                System.out.println("La variable ingresada no pertenece a ninguna estacion, por favor ingrese una variable de 1 a 4");
                break;
        }
    }
}