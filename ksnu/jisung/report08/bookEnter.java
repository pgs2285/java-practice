package ksnu.jisung.report08;
import ksnu.jisung.getInt;
import java.util.Scanner;
public class bookEnter {
    static int addBookCount = 0;
    static int bookNumber = 0;    
    getInt GetInt = new getInt();
    Scanner scan = new Scanner(System.in);
    public book[] BookEnter(book[] books){
        System.out.print("입력할 책의 개수는? >> ");
        int add = GetInt.GetInt(); // 현재 추가되는 개수
        bookNumber += add; // 기존의 책 개수에 추기되는 것
        for(int i = addBookCount; i < bookNumber; i++){
            books = BookInfo(books, i);
        }  
        addBookCount += add; // for문 후 책 개수 저장 
        return books;
    }
    public book[] BookInfo(book[] books, int i){
        books[i] = new book();
        System.out.print(i+"번 도서정보 입력(책제목, 저자, 출판년도, 출판사, 가격, 개수순)>>");
        books[i].setBook(i);
        books[i].setTitle(scan.next());
        books[i].setAuthorName(scan.next());
        try{books[i].setReleaseYear(scan.nextInt());} catch(Exception e){
            System.out.println("입력오류 발생 0처리"); books[i].setReleaseYear(0);}
        books[i].setPublisher(scan.next());
        try{books[i].setPrice(scan.nextInt());} catch(Exception e) {
            System.out.println("입력오류 발생 0처리");books[i].setPrice(0);}
        try{books[i].setCount(scan.nextInt());} catch(Exception e) {
            System.out.println("입력오류 발생 0처리");books[i].setCount(0);}
        return books;
    }
}