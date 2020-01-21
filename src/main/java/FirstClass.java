public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600,1000,2017);
        System.out.println(notebook.weight);
        System.out.println(notebook.price);
        System.out.println(notebook.year);
        notebook.checkWeight();
        notebook.checkPrice();
        notebook.checkYearAndPrice();
        System.out.println(" ");

        Notebook heavyNotebook = new Notebook(2000,1500,2014);
        System.out.println(heavyNotebook.weight);
        System.out.println(heavyNotebook.price);
        System.out.println(heavyNotebook.year);
        heavyNotebook.checkWeight();
        heavyNotebook.checkPrice();
        heavyNotebook.checkYearAndPrice();
        System.out.println(" ");

        Notebook oldNotebook = new Notebook(1200,500,2008);
        System.out.println(oldNotebook.weight);
        System.out.println(oldNotebook.price);
        System.out.println(oldNotebook.year);
        //System.out.println(oldNotebook.weight + " "+  oldNotebook.price);
        oldNotebook.checkWeight();
        oldNotebook.checkPrice();
        oldNotebook.checkYearAndPrice();
        System.out.println(" ");

        Notebook randomNotebook = new Notebook (1100,1500,2018);
        System.out.println(randomNotebook.weight);
        System.out.println(randomNotebook.price);
        System.out.println(randomNotebook.year);
        randomNotebook.checkPrice();
        randomNotebook.checkWeight();
        randomNotebook.checkYearAndPrice();
    }
}
