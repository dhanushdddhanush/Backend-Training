package Collections;

import java.util.*;

/**
 * person class
 */
public class Person {
	String name;
    int age;
    String city;
    List<String> subjects;
    
    /**
     * @param name
     * @param age
     * @param city
     * @param subjects
     */
    public Person(String name, int age, String city, List<String> subjects) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.subjects = subjects;
    }
    /**
     *prints all data
     */
   
    public String toString() {
        return "name='" + name + "', age=" + age + ", city='" + city + "', subjects='" + subjects;
    }
    
} 


