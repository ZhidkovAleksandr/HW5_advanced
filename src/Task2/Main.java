package Task2;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

    public static String createNameOfClass() {
        String name = null;
        System.out.println("Type in the name of class");
        try (Scanner scan = new Scanner(System.in)) {
            name = scan.nextLine();
        } catch (Exception e) {
            System.out.println("oups");
        }
        return "java.lang." + name;

    }



    public static void infoPrivateFields(Field[] sFields){
        for (Field e:sFields) {
            Class fieldType = e.getType();
            System.out.println("\tName: " +  e.getName());
            System.out.println("\tType: " +  fieldType.getName());
        }
    }

    public static void infoParam(Constructor[] constructors){
        for (Constructor ctr : constructors) {

            Class[] paramTypes = ctr.getParameterTypes();
            for (Class paramType : paramTypes) {
                System.out.println(paramType.getName() + " ");
            }

        }
    }

    public static void infoMethods(Method[] methods){
        for (Method method : methods) {
            System.out.println("Name: " + method.getName());
            System.out.println("\tReturn type: " + method.getReturnType().getName());
            Class[] paramTypes = method.getParameterTypes();
            System.out.print("\tParam types:");
            for (Class<?> paramType : paramTypes) {
                System.out.print(" " + paramType.getName());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {



        String nameOfClass = createNameOfClass();
        Class cl = null;
        try {
            cl = Class.forName(nameOfClass);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }




        System.out.println("all fields");
        Field[] sFields = cl.getDeclaredFields();
        infoPrivateFields(sFields);

        Constructor[] constructors = cl.getConstructors();
        System.out.println("Constuctor parameters");
        infoParam(constructors);
        System.out.println("methods");
        Method[] methods = cl.getDeclaredMethods();
        infoMethods(methods);

    }
}