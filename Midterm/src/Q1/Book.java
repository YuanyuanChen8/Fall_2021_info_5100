package Q1;

public abstract class Book {
    public static abstract class Book{
        private String title;
        private double price;
        private String  publishYear;
        public Book(String title, double price, String publishYear){
            setTitle(title);
            setPrice(price);
            setPublishYear(publishYear);
        }
        abstract String description();
        public void getTitle(){
            System.out.println(this.title);
        }
        public void getPrice(){
            System.out.println(this.price);

        }
        public void getPublishYear(){
            System.out.println(this.publishYear);

        }
        public void setTitle(String title){
            this.title=title;

        }
        public void setPrice(double price){
            this.price=price;

        }
        public void setPublishYear(String  publishYear){
            this.publishYear=publishYear;
        }
    }
}


























