import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
      Ex1();
      System.out.println("");
      Ex2();
    }

    private static void Ex1(){
       
      Node<String> a = new Node<>("a");
      Node<String> b = a.setLeftChild(new Node<String>("b"));
      Node<String> d = a.setRightChild(new Node<String>("d"));

      Node<String> e = b.setLeftChild(new Node<String>("e"));
      Node<String> f = b.setRightChild(new Node<String>("f"));
      Node<String> g = d.setLeftChild(new Node<String>("g"));
      Node<String> i = d.setRightChild(new Node<String>("i"));

      Node<String> j = e.setLeftChild(new Node<String>("j"));
      Node<String> l = e.setRightChild(new Node<String>("l"));
      Node<String> m = g.setLeftChild(new Node<String>("m"));
      Node<String> n = i.setLeftChild(new Node<String>("n"));
      Node<String> o = i.setRightChild(new Node<String>("o"));

      Node<String> p = m.setLeftChild(new Node<String>("p"));

      Tree Tree = new Tree(a);
      printTree(a, ">");
    }

    private static void Ex2(){
      Node<Integer> Num20 = new Node<>(20);
      Node<Integer> Num5 = Num20.setLeftChild(new Node<Integer>(5));
      Node<Integer> Num25 = Num20.setRightChild(new Node<Integer>(25));

      Node<Integer> Num3 = Num5.setLeftChild(new Node<Integer>(3));
      Node<Integer> Num12 = Num5.setRightChild(new Node<Integer>(12));
      Node<Integer> Num21 = Num25.setLeftChild(new Node<Integer>(21));
      Node<Integer> Num28 = Num25.setRightChild(new Node<Integer>(28));

      Node<Integer> Num8 = Num12.setLeftChild(new Node<Integer>(8));
      Node<Integer> Num13 = Num12.setRightChild(new Node<Integer>(13));

      Node<Integer> Num6 = Num8.setLeftChild(new Node<Integer>(6));


      Tree Tree = new Tree(Num20);
      printTree(Num20, ">");
    }

    private static <T> void printTree(Node<T> Node, String appender) {
        System.out.println(appender + Node.getData());
        if(Node.getLeftChild() != null) {
         printTree(Node.getLeftChild(), appender + appender);
        }

        if(Node.getRightChild() != null) {
         printTree(Node.getRightChild(), appender + appender);
        }
    }
}
