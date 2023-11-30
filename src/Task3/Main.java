package Task3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {

        Class cl = null;
        cl = OurCl.class;

        Field[] fields = cl.getDeclaredFields();

        for (Field e:fields) {
            int mF = e.getModifiers();
            if (Modifier.isPrivate(mF))
                System.out.print("private ");
            if (Modifier.isPublic(mF))
                System.out.print("public ");


            System.out.println(e.getName() + " " + e.getType().getName());
        }

        Method[] methods = cl.getDeclaredMethods();

        for (Method i: methods) {
            System.out.println(i.getName());
            Class[] p = i.getParameterTypes();

            for (Class y:p) {
                System.out.println(y.getName());
            }
        }

        int mods = cl.getModifiers();
        if (Modifier.isPrivate(mods))
            System.out.println("private ");
        if (Modifier.isAbstract(mods))
            System.out.println("abstract ");
        if (Modifier.isFinal(mods))
            System.out.println("final ");
        if (Modifier.isPublic(mods))
            System.out.println("public class ");


        Constructor[] constructors = cl.getConstructors();

        for (Constructor construct : constructors) {

            System.out.println("Constructor " + construct.getName());
            System.out.println(construct);

        }


    }
}
