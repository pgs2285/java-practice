package ksnu.jisung.report08;
import ksnu.jisung.getInt;
public class searchBookByPrice {
    getInt GetInt = new getInt();
    public void PrintResult(book[] books){
        System.out.print("가격범위로 검색\n가격 범위 입력:");
        int min = GetInt.GetInt();
        int max = GetInt.GetInt();
        System.out.println("일련번호     책제목      저자      출판년도      출판사       가격       개수");
        for(book b: books){
            if(b!=null){if(b.getPrice() > min && b.getPrice() < max){
                System.out.println(b.toString());
            }}
        }       
    }
}
