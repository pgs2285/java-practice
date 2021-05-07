package ksnu.jisung.etc;

import java.util.*;

public class addXY {
    Scanner scanner = new Scanner(System.in);
    public void printXY(){
        System.out.print("정수x를 입력하세요");
        int x = scanner.nextInt();
        System.out.print("정수y를 입력하세요");
        int y = scanner.nextInt();
        printAddXY(x, y);
    }
    public void printAddXY(int x, int y){
        int sum = 0;
        for(int i = x ; i <= y; i++){
            sum += i;
            System.out.print(i);
            if(i < y)  System.out.print("+");
            else System.out.println("="+sum);
        }
    }
}
