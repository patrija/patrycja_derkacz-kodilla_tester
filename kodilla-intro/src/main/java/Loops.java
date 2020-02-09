public class Loops {
    int pierwszy;
    int drugi;
    public Loops(int pierwszy, int drugi) {
        this.pierwszy = pierwszy;
        this.drugi = drugi;
    }



    public int getSum() {
        int[] numerki = new int[] {pierwszy,  drugi};
        int sum = 0;

        for (int i = 0; i < numerki.length; i++) {
            sum = sum + numerki[i];
        }
        return sum;

    }


}
