package ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<Integer>();
       try{
           list.add(0, 9);
           list.add(1, 10);
           list.add(2, 101);
           list.add(3, 102);
           list.add(4, 103);
           list.add(5, 104);
           list.add(6, 15);
           list.remove(2);

       }catch (Exception e){
           System.out.println(e);
       }
        list.contains(103);
        System.out.println(list.indexOf(9));
      list.showArr();
        System.out.println("-----------------------");
       MyList<Integer> listTest1 = list.clone();
        listTest1.add(3,1);
        listTest1.showArr();





    }
}
