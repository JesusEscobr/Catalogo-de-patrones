interface Observer { void update(String msg); }
interface Subject { void attach(Observer o); void notifyObservers(); }

class ConcreteSubject implements Subject {
    private java.util.List<Observer> observers = new java.util.ArrayList<>();
    private String state;
    public void setState(String s){ state=s; notifyObservers(); }
    public void attach(Observer o){ observers.add(o); }
    public void notifyObservers(){ for(Observer o:observers) o.update(state); }
}
class ConcreteObserver implements Observer {
    public void update(String msg){ System.out.println("Observer: "+msg); }
}
public class ObserverPattern {
    public static void main(String[] args){
        ConcreteSubject s=new ConcreteSubject();
        s.attach(new ConcreteObserver());
        s.setState("Cambio de estado");
    }
}
