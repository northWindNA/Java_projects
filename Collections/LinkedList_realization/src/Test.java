public class Test {
    public static void main(String[] args) {
        MyLInkedList myLInkedList = new MyLInkedList();
        myLInkedList.add(1);
        myLInkedList.add(2);
        myLInkedList.add(3);
        myLInkedList.add(4);
        System.out.println(myLInkedList);
        System.out.println(myLInkedList.get(0));
        System.out.println(myLInkedList.get(1));
        System.out.println(myLInkedList.get(2));
        System.out.println(myLInkedList.get(3));

        myLInkedList.remove(0);
//        myLInkedList.remove(0);
        System.out.println(myLInkedList);
    }
}
