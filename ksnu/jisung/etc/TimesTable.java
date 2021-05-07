package ksnu.jisung.etc;

import java.util.Scanner;
public class TimesTable {    
    Scanner scanner = new Scanner(System.in);
    int[] numberInput(){ // 숫자 2개를 입력하는 함수
        int[] firstArr = {0, 0};
        firstArr[0] = scanner.nextInt();
        firstArr[1] = scanner.nextInt();        
        return firstArr;
    }
    void isZero(int[] firstArr){ //0인지 아닌지 확인해 주는 함수
        boolean check = (firstArr[0] == 0 && firstArr[1] == 0) ? false : true; // 둘다 0이면 false반환
        endProgram(check);       
    }
    void endProgram(boolean checkEnd){ // false가 반환되면 프로그램을 종료함
        if (checkEnd == false) {
            System.exit(0);
        }
    }
    int[] Swap(int[] firstArr){
        int temp = 0;
        if (firstArr[0] > firstArr[1]){
            temp = firstArr[1];
            firstArr[1] = firstArr[0];
            firstArr[0] = temp; 
        }
        return firstArr;
    }
    void output(int[] firstArr, int[] secondArr){
        for(int i = firstArr[0]; i <= firstArr[1]; i++,System.out.println("")){
            for(int j = secondArr[0]; j <= secondArr[1]; j++){
                System.out.print("  " + i + " * " + j + "=" + (i*j));
            }            
        }
    }
    public void timesTables(){     
            TimesTable timesTable= new TimesTable();    
            System.out.print("숫자 a,b를 입력해 주세요(a~b단):");        
            int[] firstArr =timesTable.numberInput(); // 숫자 2개를 입력받는 함수
            timesTable.isZero(firstArr); // 0이 2개가 들어왔다면 종료하는 함수  
            System.out.print("\n숫자 c~d를 입력해주세요:");
            int[] secondArr =timesTable.numberInput(); 
            timesTable.isZero(secondArr);
            firstArr =timesTable.Swap(firstArr); //만약 a가 b보다 크다면 스왑하는 함수
            secondArr =timesTable.Swap(secondArr);
            timesTable.output(firstArr, secondArr);      
    }
}   
