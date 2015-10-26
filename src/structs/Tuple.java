package structs;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Tuple extends ArrayList<Integer>{
    
    public Tuple(Object... objects){
        super();
        try {
            for (Object ob : objects){
                if (ob == null) continue;   //TODO Is skipping better than putting a zero?
                if (ob.getClass() == Tuple.class){
                    Tuple subTup = (Tuple)ob;
                    this.addAll(subTup);
                } else
                if (ob.getClass() == Integer.class){
                    Integer integer = (Integer)ob;
                    this.add(integer);
                } else {
                    throw new Exception("Illegal argument in Tuple constructor");
                }      
            }
        } catch (Exception e) {
            e.printStackTrace();    // TODO Auto-generated catch block
        }

    }
}
