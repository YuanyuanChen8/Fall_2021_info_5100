package Q1;

public class Fiction extends Book implements iBorrowable {
    private int borrowDate;
    private int returnDate;
    private  String title;


    public Fiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    public void setBorrowDate(int day) {
        this.borrowDate=day;

    }

    @Override
    public void setReturnDate(int day) {
        this.returnDate=day;
    }

    @Override
    public boolean isAvailable(int day) {
        if(day<=returnDate&&day>=borrowDate){
            return false;
        }
        return true;
    }

    @Override
    String description() {
        return "Frankenstein"+title+" all events are imaginary and not based on real facts";
    }
}

