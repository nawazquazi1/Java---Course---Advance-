import com.sun.source.tree.SynchronizedTree;

 class Parenthesis {
   synchronized void display(String s)  {
        System.out.println("\n");
        System.out.print("("+s);
        try {
            Thread.sleep(500);
        }catch (InterruptedException io){}
            System.out.print(")");
    }
}
class  SyncDemo extends Thread {
    String s1;
    Parenthesis p1;

    public SyncDemo(Parenthesis p1, String s1) {
        this.p1 = p1;
        this.s1 = s1;
        start();
    }

    public void run() {
        p1.display(s1);
    }

    public static void main(String[] args) {
        Parenthesis p = new Parenthesis();
        SyncDemo sy = new SyncDemo(p, "java");
        SyncDemo sy1 = new SyncDemo(p, "OOCP");
    }
    public static void nawaz(int a,int b){
        int c=a+b;
        System.out.println();
    }
}