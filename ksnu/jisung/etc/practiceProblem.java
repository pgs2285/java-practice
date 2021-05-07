package ksnu.jisung.etc;
import java.util.*;

public class practiceProblem {
    Scanner scan = new Scanner(System.in);
    random_FirstArray random_avg = new random_FirstArray();
    randomArr random_arr = new randomArr();
    rock_paper_scissors RPS = new rock_paper_scissors();
    public void printMenu(){
        System.out.println("\n배열 연습문제 풀기\n 1)연습문제 8번 \n 2)연습문제 10번 \n 3)연습문제 16번\n0)종료");
    }
    public void get_number(){
        int cnt = 0;
        while(cnt == 0){
            printMenu();
            switch(scan.nextInt()){
                case 1: random_avg.randomArr();
                    break;
                case 2: random_arr.GenerateZero();
                    break;
                case 3: RPS.usersChoice();
                    break;
                case 0: cnt++;
                    break;            
            }    
        }
    }
}

