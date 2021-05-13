package ksnu.jisung;
import java.util.Scanner;
public class getInt {
    Scanner scan = new Scanner(System.in);
    public int GetInt(){ // 인트 예외 처리하기
        int number = 0;
        while(true){
            try{
                number = scan.nextInt();
                break;
            }catch(Exception e){
                System.out.println("입력이 잘못 되었습니다");
                scan = new Scanner(System.in); // 비우기
            }
        }
        return number;
    }
}
