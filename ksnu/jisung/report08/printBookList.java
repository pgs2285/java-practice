package ksnu.jisung.report08;

public class printBookList {
    
    public void printList(book[] books){
        System.out.println("일련번호     책제목      저자      출판년도      출판사       가격       개수");
        for(book b:books){
            try{
            System.out.println(b.toString());
            }catch(Exception e){}
        }
    }
}
