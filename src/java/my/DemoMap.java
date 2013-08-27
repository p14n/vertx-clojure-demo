package my;
import clojure.lang.Keyword;
import java.util.Map.Entry;
import java.util.Collection;
public class DemoMap extends java.util.HashMap {

    public DemoMap(java.util.Map obj){
        super(obj);
    }

    public static Collection examine(DemoMap m){
        
        Collection c = new java.util.ArrayList();
        for(Object o:m.entrySet()){
            Entry e = (java.util.Map.Entry)o;
            Keyword k = (Keyword)e.getKey(); 
            if(Keyword.find((String)null,k.getName())==null){
              throw new RuntimeException("Lost in translation");
            } else {
                System.out.println("Found "+ k.getName());
            }
            c.add(k.getName());
        }
        return c;
    }
}
