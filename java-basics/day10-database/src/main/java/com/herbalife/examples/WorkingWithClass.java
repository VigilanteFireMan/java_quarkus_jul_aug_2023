package com.herbalife.examples;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class WorkingWithClass {
    public static void main(String[] args) throws Exception {
        //compiling a class gives you bytecodes + metadata
        //metadata contains all the information about the class
        //Loading the metadata is called reflection
        //Access the metadata using Class

        Car car = new Car();
        Class carClass1 = car.getClass();

        Class carClass = Class.forName("com.herbalife.examples.Car"); //Type.GetType(...)
        System.out.println(carClass.getSuperclass().getName());
        Field[] fields = carClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());

        }
        Method[] methods = carClass.getDeclaredMethods();
        for(Method method : methods) {
            System.out.println(method.getName());
        }

        Annotation[] annotations = carClass.getDeclaredAnnotations();
        for(Annotation annotation : annotations) {
            System.out.println(annotation.annotationType().getName());
        }
    }
}

@Dummy
class Car {
    private String model;

    public void start() {
    }
}