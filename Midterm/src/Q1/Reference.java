package Q1;

public class Reference {
    public String title;
    public double price;
    public String publishYear;
    public String category;


    public Reference(String title, double price, String publishYear, String category) {
        this.title = title;
        this.price = price;
        this.publishYear = publishYear;
        this.category = category;
    }

    @Override
    String description() {
        return "World Maps+" + title + "+all information is real.";
    }

    public void getTitle() {
        System.out.println(this.title);
    }

    public void getPrice() {
        System.out.println(this.price);

    }

    public void getCategory() {
        System.out.println(this.category);

    }

    public void setTitle(String title) {
        this.title = title;

    }

    public void setPrice(double price) {
        this.price = price;

    }

    public void setCategory(String category) {
        this.category = category;
    }
}

