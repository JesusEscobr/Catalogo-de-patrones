class Observer:
    def update(self, msg): pass

class Subject:
    def __init__(self): self.obs=[]
    def attach(self,o): self.obs.append(o)
    def notify(self,msg):
        for o in self.obs: o.update(msg)

class ConcreteObserver(Observer):
    def update(self,msg): print("Observer:",msg)

if __name__=="__main__":
    s=Subject()
    s.attach(ConcreteObserver())
    s.notify("Cambio de estado")
