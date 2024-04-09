package Oops;

 interface A {
boolean on=true;
boolean off=false;

void start();
void stop();

}

interface Mousefunction{
    void click();
    void dblclick();
    void rightclick();
    void leftclick();
}

class sample implements A,Mousefunction{
public void start(){
    System.out.println("on");
}

public void stop(){
    System.out.println("off");
}
public void click(){
    System.out.println("click");  
}
public void dblclick(){
    System.out.println("dblclick"); 
}
public void rightclick(){
    System.out.println("rightclick"); 
}
public void leftclick(){
    System.out.println("leftclick"); 
}
    public static void main(String[] args) {
        sample s = new sample();
        s.click();
        s.dblclick();
        s.leftclick();
        s.rightclick();
        s.start();
        s.stop();
    }
}


