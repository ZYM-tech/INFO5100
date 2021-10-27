package Midterm_Q1;
public abstract class Book {
    //fields
    private String title;
    private double price;
    private String publishYear;

    protected int borrowDate;
    protected int returnDate;

    public Book(){}
    //Constructor
    protected Book(String title, double price, String publishYear){
        this.title = title;
        this.price = price;
        this.publishYear = publishYear;
    }

    //getters
    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }
    public String getPublishYear(){
        return publishYear;
    }

    //setters
    public void setTitle(String title){
        this.title = title;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public void setPublishYear(String publishYear){
        this.publishYear = publishYear;
    }

    //an abstract method
    public abstract String description();
}
