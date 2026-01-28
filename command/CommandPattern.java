interface Command{ void execute(); }
class Light{ void on(){ System.out.println("Light ON"); } }
class LightOnCommand implements Command{
    private Light l;
    LightOnCommand(Light l){ this.l=l; }
    public void execute(){ l.on(); }
}
public class CommandPattern{
    public static void main(String[] args){
        Command c=new LightOnCommand(new Light());
        c.execute();
    }
}
