package ksnu.jisung.report07;

public class printAll {
    public int print_all(Person[] plist){
        int i = 0;
        for(Person p:plist)
        {
          try{  
          if(p.classify == 0)
              System.out.print(i+":Person :"+p.toString());
          if(p.classify == 1)
              System.out.print(i+":Student: "+p.toString());
          if(p.classify == 2)
              System.out.print(i+":Researcher: "+p.toString());
          if(p.classify == 3)
              System.out.print(i+":Professor :"+p.toString());
          System.out.println(); i++;
        }catch(Exception e){}
       }
       return i;
    }
}
