package Midterm_Q1;

public class Reference extends Book{
    String category;

    public Reference(String title, double price, String publishYear, String category){
        super(title,price,publishYear);
        this.category = category;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public String getCategory(){
        return category;
    }

    @Override
    public String description() {
        return getTitle() + " all information is real.";
    }
}
