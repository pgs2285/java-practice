package ksnu.jisung.report08;

public class book{
    private int book;
    private String title;
    private String authorName;
    private int releaseYear;
    private String publisher;
    private int price;
    private int count;
    public String toString(){
        return ""+book+"   "+title+"   "+authorName+"   "+releaseYear+"   "+publisher+"   "+price+"   "+count;
    }
    public int getBook() {
        return this.book; 
    }

    public void setBook(int book) {
        this.book = book;// this.book 은 class내의 book을 의미, book은 매개변수임
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }


}