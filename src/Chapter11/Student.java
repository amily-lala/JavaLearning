package Chapter11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 马晓晓cloudlet
 */
public class Student {
    private static String name ;
    private static int    age ;

    public Student (String name,int age) {
        Student.name = name;
        Student.age = age;
    }

    private String getName () {
        return name;
    }

    private int getAge () {
        return age;
    }

}
