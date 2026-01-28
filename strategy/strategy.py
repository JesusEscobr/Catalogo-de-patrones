class Add:
    def execute(self,a,b): return a+b

class Context:
    def __init__(self,strategy): self.s=strategy
    def exec(self,a,b): return self.s.execute(a,b)

if __name__=="__main__":
    c=Context(Add())
    print(c.exec(3,4))
