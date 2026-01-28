class OnState:
    def handle(self): print("ON")

class Context:
    def __init__(self,s): self.s=s
    def request(self): self.s.handle()

if __name__=="__main__":
    Context(OnState()).request()
