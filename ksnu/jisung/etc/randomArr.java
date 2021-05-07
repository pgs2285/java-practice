package ksnu.jisung.etc;
public class randomArr {
    public int[][] random_Arr(){
        int[][] Array = new int[4][4];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                Array[i][j] = (int)(Math.random()*10 + 1);
            }
        }
        return Array;
    }
    public int[][] GenerateZero(){
        int[][] Array = random_Arr();
        for (int i = 0; i < 6;i ++){
            int A_random = (int)(Math.random()*4); 
            int B_random = (int)(Math.random()*4); 
            while(Array[A_random][B_random] == 0) {A_random = (int)(Math.random()*4);B_random = (int)(Math.random()*4);}
            Array[A_random][B_random] = 0;
        }
        printmap(Array);
        return Array;
    }
    public void printmap(int[][] Array){
        for(int i = 0; i < 4; i++,System.out.println()){
            for(int j = 0; j < 4; j++){
                System.out.print(Array[i][j]+" ");
            }
        }

    }
}
