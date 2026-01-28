// State
interface State {
    void handle(Context context);
}

// ConcreteState
class OnState implements State {
    public void handle(Context context) {
        System.out.println("El dispositivo está ENCENDIDO");
        context.setState(new OffState());
    }
}

// ConcreteState
class OffState implements State {
    public void handle(Context context) {
        System.out.println("El dispositivo está APAGADO");
        context.setState(new OnState());
    }
}

// Context
class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handle(this);
    }
}

// Demo
public class StatePattern {
    public static void main(String[] args) {
        Context context = new Context(new OffState());

        context.request();
        context.request();
    }
}
