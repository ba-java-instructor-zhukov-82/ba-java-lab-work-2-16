package lab_work_2_16;


/*
 * Execute following steps:
 *     1. Student should create class Animal and
 *        extends from him create class Dog.
 *     2. Student should create class Main which
 *        has two methods foo(Animal a) and foo(Dog d).
 *        This methods print to console “Animal” and
 *        “Dog” respectively.
 *     3. Student should create and provide all
 *        necessary code in a method main() to show how
 *        does overload resolution works when we put
 *        this reference(Animal a = new Dog();) to
 *        method (foo).
 */
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
