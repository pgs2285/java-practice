
package ksnu.jisung.etc;
public class TimesTable_auto {
    public void printTable(){
        for(int i = 1; i < 10; i++,System.out.println()){
            for (int j = 1; j < 10; j++){
                System.out.print(i + " * " + j + " = " + i*j+" ");
            }
        }
    }
}
