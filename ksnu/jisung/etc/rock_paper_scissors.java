package ksnu.jisung.etc;
import java.util.*;
public class rock_paper_scissors {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    public void usersChoice(){
        int cnt = 0;
        while(cnt == 0){
            System.out.print("가위 바위 보!>>");
            int com_choice = rand.nextInt(3);
            String user_choice = scan.nextLine();
            cnt = RockPaperScissor(com_choice, user_choice, cnt);
        }
    
    }
    public int RockPaperScissor(int com, String user, int cnt){
        String Result[] = {"가위", "바위", "보"};
        if(user.equals(Result[com])) System.out.println("사용자:"+user+"컴퓨터"+":"+Result[com]+" 비겼습니다");
        else checkResult(com, user);
        if(!(user.equals("가위")||user.equals("보")||user.equals("바위")||user.equals("그만"))) System.out.println("입력값 오류");
        if(user.equals("그만")) {System.out.println("종료합니다"); cnt++;}
        return cnt;
    }
    public void checkResult(int com, String user){
        if(user.equals("바위") && com == 2) System.out.println("사용자:"+user+"컴퓨터:보 졌습니다");
        else if(user.equals("가위") && com == 1) System.out.println("사용자:"+user+"컴퓨터:바위 졌습니다");
        else if(user.equals("보") && com == 0) System.out.println("사용자:"+user+"컴퓨터:가위 졌습니다");
        if(user.equals("바위") && com == 0) System.out.println("사용자:"+user+"컴퓨터:가위 이겼습니다");
        else if(user.equals("가위") && com == 2) System.out.println("사용자:"+user+"컴퓨터:보 이겼습니다");
        else if(user.equals("보") && com == 1) System.out.println("사용자:"+user+"컴퓨터:바위 이겼습니다");
    }
}
