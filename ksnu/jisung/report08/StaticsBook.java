package ksnu.jisung.report08;

public class StaticsBook {
    public void printStatics(book[] books){
        int sum = 0;
        int bookPriceSum = 0;
        int[] max = {0,0}; // index 0: 최대값 index 1:최대값
        int[] min = {0,1000000}; // index 0: 최솟값 index 1:최솟값
        for(book b: books){
            if(b != null){sum += b.getCount();
            bookPriceSum += b.getPrice();
            if(max[1] < b.getPrice()) {max[0] = b.getBook(); max[1] = b.getPrice();}
            if(min[1] > b.getPrice()) {min[0] = b.getBook(); min[1] = b.getPrice();}}
        }
        System.out.println("도서통계보기 \n전체보유권수:"+sum+"\n도서당 평균 가격:"+bookPriceSum+"\n최고가격도서:"+books[max[0]].getTitle()+" "+
                            max[1]+"\n최저가격도서:"+books[min[0]].getTitle()+" "+min[1]);
    }
}
