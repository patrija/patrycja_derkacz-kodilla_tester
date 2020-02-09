import java.util.Random;

public class test {
    public static void main(String[] args) {

        Random random = new Random();
        int max = 20;
        //int i = 0;
        // licznik = 0;
        int temp = 0;
        int suma = 0;
        while (suma < max) {
            temp = random.nextInt(10);
            System.out.println(temp);
            //licznik ++;
            suma = suma + temp;
            if(suma + temp >= max ) {
                suma = suma - temp;
                break;
              //  System.out.println(suma);
            }
        }
        //System.out.println(licznik + " - tyle było losowań.");
        //System.out.println(suma + " -> tyle wynosi suma wylosowanych liczbh");

    }
}
