package app;

import app.annotation.Author;
import app.annotation.MethodInfo;

import java.lang.reflect.Method;

public class Demonstration {
    Class<?> clazz = ArrayUtils.class;

    Method[] methods = clazz.getDeclaredMethods();

    // Check and output with Info of Methods via reflections
    public void runDemo(){
        for (Method method : methods) {
            if (method.isAnnotationPresent(MethodInfo.class)) {
                MethodInfo methodInfo = method.getAnnotation(MethodInfo.class);
                System.out.println("Method: " + methodInfo.name());
                System.out.println("Returns type: " + methodInfo.returnType());
                System.out.println("Description: " + methodInfo.description());

                if (method.isAnnotationPresent(Author.class)) {
                    Author author = method.getAnnotation(Author.class);
                    System.out.println("Author: " + author.firstName() + " " + author.lastName());
                }
                System.out.println("-----------------------------------");
            }
        }
    }
}
