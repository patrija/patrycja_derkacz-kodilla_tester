import java.util.Random;

public class RandomNumbers {

    Random random = new Random();

    public void drawNumbers() {
        int suma = 0;
        while (suma < 5000) {
            int temp = random.nextInt(31);
            suma = suma + temp;
        }
    }

    public int getMax() {
        int suma = 0;
        int max = 0;

        while (suma < 5000) {
            int temp = random.nextInt(31);
            //System.out.println(temp);
            suma = suma + temp;

            if(temp > max) {
                max = temp;
            }
        }

        //System.out.println(max + " to jest max.");
        return max;
    }

    public int getMin(){
        int suma = 0;
        int min = 10000;

        while (suma < 5000) {
            int temp = random.nextInt(31);
            //System.out.println(temp);
            suma = suma + temp;

            if (temp < min) {
                min = temp;
            }
        }
        //System.out.println(min + " to jest min.");
        return min;
    }
}
