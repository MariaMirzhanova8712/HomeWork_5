package Сollections;

public class ArrayList<I extends Number> implements List {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(8);
        list.add(5);
        list.add(0);
        list.add(2);
        list.add(6);
        Iterator Itr = list.iterator();
        while (Itr.hasNext()) {
            System.out.println(Itr.next());
        }

    }

}
