# State
class State:
    def handle(self, context):
        pass

# ConcreteState
class OnState(State):
    def handle(self, context):
        print("El dispositivo está ENCENDIDO")
        context.set_state(OffState())

# ConcreteState
class OffState(State):
    def handle(self, context):
        print("El dispositivo está APAGADO")
        context.set_state(OnState())

# Context
class Context:
    def __init__(self, state):
        self.state = state

    def set_state(self, state):
        self.state = state

    def request(self):
        self.state.handle(self)

# Demo
if __name__ == "__main__":
    context = Context(OffState())
    context.request()
    context.request()
