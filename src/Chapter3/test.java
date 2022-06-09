package Chapter3;

import Chapter11.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class test {
    public static void main (String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Student xiaoxiao = new Student("xiaoxiao",19);

        Class cl1 =xiaoxiao.getClass();

        Constructor cons =  cl1.getConstructor(String.class , int.class) ;
        Student xiaobai = (Student) cons.newInstance("xiaobai",22);

        Field name1 = cl1.getDeclaredField("name");
        name1.setAccessible(true);
        name1.set(xiaobai,"xiaoBai");

        Method getName1 = cl1.getDeclaredMethod("getName");
        getName1.setAccessible(true);

        System.out.println(getName1.invoke(xiaobai));

//        System.out.println(xiaoxiao.getClass());
//        System.out.println(xiaoxiao.getClass().getName());
//        System.out.println(Student.class);
//
//        System.out.println(xiaobai);
//        System.out.println(xiaobai.equals(xiaoxiao));

    }
}
