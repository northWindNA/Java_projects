public class Main {
    public static void main(String[] args) {
//        int x = 1;
//        int y = 1;
//        System.out.println(x == y); //true

//        animal1 -> {1} <- link1
//        animal2 -> {1} <- link2
//        link1 != link2

//        Animal animal1 = new Animal();
//        Animal animal2 = new Animal();
//        System.out.println(animal1 == animal2); //false, links are different

//        Animal animal1 = new Animal(1);
//        Animal animal2 = new Animal(1);
//        System.out.println(animal1 == animal2); //false, links are different

//        Object obj = new Object(); // object is parent of any other objects
//        obj.equals();              // each object has equals-method

//        Animal animal1 = new Animal(1);
//        Animal animal2 = new Animal(1);
//        System.out.println(animal1.equals(animal2)); //false, equals-method is default

//        Animal animal1 = new Animal(1);
//        Animal animal2 = new Animal(1);
//        System.out.println(animal1.equals(animal2)); //true, equals-method is overwritten

//        String string1 = "Hello";      //    string1   ->   |{"Hello"}
//        String string2 = "Hello";      //    string2   ->   | both strings point to the same string in the memory
//        System.out.println(string1 == string2);  //true, it's about string-pool,java mechanism to use less memory

//        String string1 = new String("Hello");
//        String string2 = new String("Hello");
//        System.out.println(string1 == string2);    //false, string-pool mechanism doesn't work

        String string1 = "Hello";
        String string2 = "Hello123".substring(0, 5);
        System.out.println(string2);
        System.out.println(string1 == string2);      //false, even in such case
    }
}

//class Animal {
//    private int id;
//
//    public Animal(int id) {
//        this.id = id;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        Animal otherAnimal = (Animal) obj;
//
//        return this.id == otherAnimal.id;
//    }
//}
