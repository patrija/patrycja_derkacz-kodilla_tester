public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice(){
        if(this.price < 600){
            System.out.println("This notebook is very cheap");
        } else if (this.price <=1000) {
            System.out.println("The price is good");
        } else {
            System.out.println("This notebook is expensive");
        }
    }

    public void checkWeight(){
        if(this.weight < 1000){
            System.out.println("This notebook is very light");
        } else if(this.weight <= 1500){
            System.out.println("This notebook is not heavy");
        } else {
            System.out.println("This notebook is very heavy");
        }
    }

    public void checkYearAndPrice(){
        if(this.year < 2010 || this.price < 600){
            System.out.println("This notebook it's not very good");
        } else if (this.year < 2015 && this.price > 1200){
            System.out.println("This notebook it's not worth to buy");
        } else if (this.year > 2016 && this.price <=1000){
            System.out.println("This notebook is worth to buy");
        } else {
            System.out.println("Check other parameters");
        }
    }
}

