package ksnu.jisung.etc;


import java.util.*;

public class Average {
    Scanner scanner = new Scanner(System.in);
    public void average(){
        int n = 0;
        double sum = 0;
        int i = 0;
        while((i = scanner.nextInt())!=-1){
            sum += i;
            n++;
        }
        System.out.println("입력된 수의 개수는 "+n+"개이며 평균은 "+sum/n+"입니다\n");
    }
}
