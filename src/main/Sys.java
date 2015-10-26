package main;

public abstract class Sys {
    public static void out(Object... objects){
        int size = 0;
        for (Object ob : objects) size++;
        String str = "[";
        for (int i = 0; i < size; i++){
            str += String.valueOf(((Integer) objects[i]));
            if (i != size-1) str += ",";
        }
        str += "]";
        System.out.println(str);
    }
}
