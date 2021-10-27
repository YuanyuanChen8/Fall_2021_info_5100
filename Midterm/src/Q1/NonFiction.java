package Q1;

public static class NonFiction extends Book implements iBorrowable {
    private int borrowDate;
    private int returnDate;
    private String title;
    public NonFiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }
    }

    @Override
    String description() {
        return "Anne Frank"+title+"all events are true and based on real facts.";
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