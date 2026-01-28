interface State{ void handle(); }
class OnState implements State{ public void handle(){ System.out.println("ON"); } }
class Context{
    private State s;
    public void setState(State s){ this.s=s; }
    public void request(){ s.handle(); }
}
public class StatePattern{
    public static void main(String[] args){
        Context c=new Context();
        c.setState(new OnState());
        c.request();
    }
}
