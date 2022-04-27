


public class Main {
    public static void main(String[] args) {

        suma(1,2,3); //Invoco la funcion suma


        Coche miCoche = new Coche(); //Objeto Coche
        miCoche.incrementaPuertas(); //Incrementa las puertas en 1

    }

    public static class Coche{ // Clase Coche
        int puertas = 0;

        public void incrementaPuertas(){
            puertas++;
            System.out.println(puertas); //Muestro por pantalla el incremento
        }
    }
    public static void suma(int a, int b, int c){ //Funcion Suma
        int resultado = a + b + c;

        System.out.println(resultado);
    }


}
