import java.util.*;
interface Iterator{ boolean hasNext(); Object next(); }
class NameIterator implements Iterator{
    private List<String> n; private int i=0;
    NameIterator(List<String> n){ this.n=n; }
    public boolean hasNext(){ return i<n.size(); }
    public Object next(){ return n.get(i++); }
}
class Repo{
    List<String> n=Arrays.asList("Ana","Luis","Carlos");
    Iterator getIterator(){ return new NameIterator(n); }
}
public class IteratorPattern{
    public static void main(String[] args){
        Iterator it=new Repo().getIterator();
        while(it.hasNext()) System.out.println(it.next());
    }
}
