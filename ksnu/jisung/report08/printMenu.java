package ksnu.jisung.report08;
import ksnu.jisung.getInt;

public class printMenu {
    getInt GetInt = new getInt();
    printBookList pBookList = new printBookList();
    book[] books = new book[1000];
    bookEnter Bookenter = new bookEnter();
    reviseBook ReviseBook = new reviseBook();
    StaticsBook staticsBook = new StaticsBook();
    searchBookByAuthor sAuthor = new searchBookByAuthor();
    searchBookByPrice sPrice = new searchBookByPrice();
    deleteBooks dBooks = new deleteBooks();

    public void PrintMenu(){
        int count = 0;
        
        while(count == 0){
            System.out.println("<도서관 프로그램> \n 1.도서 정보 입력하기 \n 2.도서 목록 보기 \n 3.도서 정보 수정하기\n 4.도서 통계 보기 \n 5.도서 정보 검색(저자명) \n 6.가격 범위로 검색 \n 7.도서 정보 삭제 \n0.종료");
            switch(GetInt.GetInt()){
                case 0: count = 1;break;
                case 1: Bookenter.BookEnter(books);break;
                case 2: pBookList.printList(books);break;
                case 3: ReviseBook.reviseBookList(books);break;
                case 4: staticsBook.printStatics(books); break;
                case 5: sAuthor.PrintResult(books);break;
                case 6: sPrice.PrintResult(books);break;
                case 7: dBooks.delete(books); break;
            }                        
        }
    }
}
