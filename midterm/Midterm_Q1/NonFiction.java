package Midterm_Q1;

public class NonFiction extends Book implements iBorrowable{

    //Constructor
    public NonFiction  (String title, double price, String publishYear){
        super(title, price, publishYear);
    }

    @Override
    public void setBorrowDate(int day) {
        this.borrowDate = day;
    }

    @Override
    public void setReturnDate(int day) {
        this.returnDate = day;
    }

    @Override
    public boolean isAvailable(int day) {
        if(day >= borrowDate && day <= returnDate){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public String description() {
        return getTitle() + " all events are true and based on real facts.";
    }
}
