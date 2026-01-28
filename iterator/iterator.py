class Iterator:
    def __init__(self,n): self.n=n; self.i=0
    def has_next(self): return self.i<len(self.n)
    def next(self):
        v=self.n[self.i]; self.i+=1; return v

if __name__=="__main__":
    it=Iterator(["Ana","Luis","Carlos"])
    while it.has_next(): print(it.next())
