<h2><span>Brain Academy. Java Course. Laboratory Work 2.16 
(Methods Overloading Resolution)</span></h2>

###Laboratory Work 2.16.1

<div>
    <b>Execute following steps:</b>
    <ol>
        <li><span>Student should create class Animal and 
            extends from him create class Dog.</span></li>
        <li><span>Student should create class Main which 
            has two methods foo(Animal a) and foo(Dog d). 
            This methods print to console “Animal” and 
            “Dog” respectively.</span></li>
        <li><span>Student should create and provide all 
            necessary code in a method main() to show how 
            does overload resolution works when we put 
            this reference(Animal a = new Dog();) to 
            method (foo).</span></li>
    </ol>
</div>

<b>Solution 2.16.1:</b>

<i>Animal.java</i>
```java
/*
 * 1. Student should create class Animal and
 *    extends from him create class Dog.
 */
public class Animal {
}
```

<i>Dog.java</i>
```java
/*
 * 1. Student should create class Animal and
 *    extends from him create class Dog.
 */
public class Dog extends Animal {
}
```

<i>LabWork_2_16_Main.java</i>
```java
public class LabWork_2_16_Main {

    /*
    * 3. Student should create and provide all
    *    necessary code in a method main() to show how
    *    does overload resolution works when we put
    *    this reference(Animal a = new Dog();) to
    *    method (foo).
    */
    public static void main(String[] args) {
        Animal a = new Dog();
        foo(a);
    }

    /*
     * 2. Student should create class Main which
     *    has two methods foo(Animal a) and foo(Dog d).
     *    This methods print to console “Animal” and
     *    “Dog” respectively.
     */
    private static void foo(Animal a) {
        System.out.println("Animal");
    }

    private static void foo(Dog d) {
        System.out.println("Dog");
    }
}
```