package com.ua.robotd.homework30;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Field> privett = new ArrayList<>();
        List<Field> publikk = new ArrayList<>();
        List<Field> protectedd = new ArrayList<>();
        List<Field> noField = new ArrayList<>();

        Field fields[] = Reflexiya9.class.getDeclaredFields();
        for (Field i : fields) {
            if (Modifier.isPrivate(i.getModifiers())) {
                privett.add(i);
            } else if (Modifier.isPublic(i.getModifiers())) {
                publikk.add(i);
            } else if (Modifier.isProtected(i.getModifiers())) {
                protectedd.add(i);
            } else
                noField.add(i);
        }
        for (Field i : noField) {
            System.out.println(i.getAnnotatedType());

        }
    }
}
