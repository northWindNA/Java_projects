public class Car {
    private int id;

    public Car(int id) {
        this.id = id;
    }

    public void startCar() {
        final int SOMECONSTANT = 777;
        Engine engine = new Engine();
        engine.startEngine();
        System.out.println("Car " + id + " goes bjjj");

        //third, inner-class in method have access to the constant fields of outer class
        class SomeClass {
            public void someMethod() {
                System.out.println(SOMECONSTANT);
                System.out.println(id);
            }
        }
        SomeClass someObj = new SomeClass();
        test(someObj);
    }

    // first, non-static inner-class
    private class Engine {
        public void startEngine() {
            System.out.println("Engine " + id + " goes brrr");
        }
    }

    // second, static inner-class
    public static class FuelTank {
        public void fillTank() {
            System.out.println("filling the fuel tank");
        }
    }

    private void test(Object obj) {}
}

//  Все дело в том, что при создании объекта вложенного
//  класса внутри метода все переменные методакопируются
//  в объект этого вложенного класса. То есть переменные в
//  методе и переменные во вложенном в этот метод классе-это
//  две разные переменные, которые имеют одинаковое значение.
//
//  Пример:
//  public void test() {
//      final int a = 5; // эта переменная
//      class SomeClass {
//          public void someMethod() {
//              a = 1; // отличается от этой переменной
//          }
//      }
//  }
//
//  Имея в виду такую особенность реализации вложенных классов в Java,
//  разработчики языка решили, что возможность передавать во вложенные
//  классы не константы приведет к путанице.
//  Какого рода путаница?
//  Если бы вы могли передавать во вложенные классы переменные-неконстанты,
//  то вы бы могли изменять их внутри вложенных классов. Тогда, изменив
//  переменную внутри класса, вы бы ожидали, что она изменится и в самом
//  методе-обертке, но этого не произойдет потому, что в методе и во вложенном
//  классе хранятся разные переменные.
//  И наоборот, изменяя переменную в методе, вы бы ожидали, что она
//  изменится во вложенном классе, но этого не произойдет.
//  Поэтому, чтобы такой путаницы не возникало, во вложенные
//  классы можно передавать только final переменные.
