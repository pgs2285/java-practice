package ksnu.jisung.etc;

public class AtoZ {
    public void printAtoZ(){
        char a = 'a';
        for(char i = (char)(a - 1); i <'z';i++,System.out.print(i)){}
        System.out.println();
    }
}
