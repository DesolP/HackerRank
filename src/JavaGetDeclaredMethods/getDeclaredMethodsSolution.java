package JavaGetDeclaredMethods;

import com.sun.org.apache.xml.internal.security.signature.ReferenceNotInitializedException;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class getDeclaredMethodsSolution {

    public static void main(String[] args) {

        Student st = new Student();
        Class student = st.getClass();
        Method[] methods = student.getDeclaredMethods();
        ArrayList<String> methodList = new ArrayList<>();
        for(Method method : methods) {
            methodList.add((method.getName()));
        }
        Collections.sort(methodList);
        for (String name : methodList) {
            System.out.println(name);
        }

    }
}

