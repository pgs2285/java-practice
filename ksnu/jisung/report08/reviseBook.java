package ksnu.jisung.report08;
import ksnu.jisung.getInt;
public class reviseBook {
    getInt GetInt = new getInt();
    printBookList pBookList = new printBookList();
    bookEnter BookEnter = new bookEnter();
    public book[] reviseBookList(book[] books){
        System.out.println("수정할 도서의 인덱스를 입력해주세요(현재 입력):");
        pBookList.printList(books);
        int rIndex = GetInt.GetInt();
        books = BookEnter.BookInfo(books, rIndex);
        return books;
    }
}
