interface Strategy { int execute(int a,int b); }
class Add implements Strategy{ public int execute(int a,int b){ return a+b; } }
class Context{
    private Strategy s;
    public void setStrategy(Strategy s){ this.s=s; }
    public int exec(int a,int b){ return s.execute(a,b); }
}
public class StrategyPattern{
    public static void main(String[] args){
        Context c=new Context();
        c.setStrategy(new Add());
        System.out.println(c.exec(3,4));
    }
}
