package ksnu.jisung.report07;

public class printAll {
    public void print_all(Person[] plist){
        for(Person p:plist)
        {
          if(p.classify == 0)
              System.out.print("Person :"+p.toString());
          if(p.classify == 1)
              System.out.print("Student: "+p.toString());
          if(p.classify == 2)
              System.out.print("Researcher: "+p.toString());
          if(p.classify == 3)
              System.out.print("Professor :"+p.toString());
          System.out.println();
       }

    }
}
