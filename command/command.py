class Light:
    def on(self): print("Light ON")

class LightOnCommand:
    def __init__(self,l): self.l=l
    def execute(self): self.l.on()

if __name__=="__main__":
    LightOnCommand(Light()).execute()
