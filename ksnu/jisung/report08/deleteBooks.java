package ksnu.jisung.report08;
import ksnu.jisung.getInt;
public class deleteBooks {
    printBookList pBookList = new printBookList();
    getInt GetInt = new getInt();
    public book[] delete(book[] books){
        System.out.println("삭제할 도서번호를 입력해주세요 (현재 입력)");
        pBookList.printList(books);
        int index = GetInt.GetInt();        
        deleting(books, index);
        return books;
    }
    public book[] deleting(book[] books, int index){
        books[index] = null;
        return books;
    }
}
