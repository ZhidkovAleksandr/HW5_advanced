package Task4;

import java.lang.reflect.Field;

public class Cat {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Class strangeCat = Animal.class;

        Animal realDog = new Animal();

        System.out.println("before change");
        System.out.println(realDog.getName());
        System.out.println(realDog.getSize());
        System.out.println(realDog.getAge());

        Field field = strangeCat.getDeclaredField("name");

        field.setAccessible(true);

        field.set(realDog, "Cat");

        field = strangeCat.getDeclaredField("age");

        field.setInt(realDog, 10);

        field = strangeCat.getDeclaredField("size");

        field.setAccessible(true);

        field.setDouble(realDog, 5.0);


        System.out.println("after change");
        System.out.println(realDog.getName());
        System.out.println(realDog.getSize());
        System.out.println(realDog.getAge());



    }

}
