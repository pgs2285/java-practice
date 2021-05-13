package ksnu.jisung.report08;
import java.util.Scanner;
public class searchBookByAuthor {
    Scanner scan = new Scanner(System.in);
    public void PrintResult(book[] books){
        System.out.print("도서정보검색(저자명)\n저자명 입력:");
        String author = scan.next();
        System.out.println("일련번호     책제목      저자      출판년도      출판사       가격       개수");
        for(book b:books){
            if(b!=null){if(b.getAuthorName().equals(author)){
                System.out.println(b.toString());
            }}
        }
    }
}
