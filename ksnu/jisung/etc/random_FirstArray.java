package ksnu.jisung.etc;
import java.util.*;
public class random_FirstArray {
    Scanner scan = new Scanner(System.in);
    public void randomArr(){
        int size;
        do{
            System.out.println("정수 몇개?(100이하)");
            size = getInt();
        }while(size > 100);
        int[] randomArray = checkOverlap(size);
        for (int i = 0;i<size;i++){
            System.out.print(randomArray[i]+" ");
        }
    }
    public int[] checkOverlap(int size){
        int[] check = new int[100];
        int[] randomArray = new int[size];
        int num;
        for (int i = 0; i<size; i++){
            do{
                num = (int)(Math.random()*100+1);    
            }while(check[num-1] == 1); 
            check[num-1] = 1;
            randomArray[i] = num;
        }
        return randomArray;
    }
    public int getInt(){
        int size = 0;
        while (true){
            try{
                size = scan.nextInt();
                break;
            }
            catch(Exception e){
                System.out.println("잘못된 변수입니다. 다시 입력 하세요!");
                scan = new Scanner(System.in);
            }
        }    
        return size;
    }
}
