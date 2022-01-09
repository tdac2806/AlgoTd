import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class App {
   public static void main(String[] args) {

      ArrayList<Integer> ArrayInfix = new ArrayList<Integer>(
            Arrays.asList(20, 5, 25, 3, 12, 21, 28, 8, 13, 50, 19, 6));

      Node<Integer> TreeInfix = null;
      TreeInfix = TreeInfix.ArrayListToTree(TreeInfix, ArrayInfix);
      InfixeSort(TreeInfix);
      System.out.println("");

      ArrayList<Integer> ArrayL = new ArrayList<Integer>(
            Arrays.asList(25, 60, 35, 10, 5, 20, 65, 45, 70, 40,
                  50, 55, 30, 15));

      Node<Integer> Tree = null;

      Tree = Tree.ArrayListToTree(Tree, ArrayL);
      printTree(Tree, "-");
      System.out.println("");
      InfixeSort(Tree);
      System.out.println("");

      ArrayList<Integer> Array10000 = new ArrayList<Integer>();
      for(int i = 0; i < 10000; i++)
         Array10000.add((int)(Math.floor(Math.random()*(10000-0+1)+0)));

      Node<Integer> Tree10000 = null;
      Tree10000 = Tree10000.ArrayListToTree(Tree10000, Array10000);   

      double startInfixe = System.nanoTime();
      InfixeSort(Tree10000);
      double endInfixe = System.nanoTime() - startInfixe;
      System.out.println("\n"+endInfixe/1_000_000_000+"s");

      double startCollections = System.nanoTime();
      Collections.sort(Array10000);
      for(int i = 0; i < Array10000.size(); i++)
         System.out.print(Array10000.get(i)+", ");
      double endCollections = System.nanoTime() - startCollections;
      System.out.println("\n"+endCollections/1_000_000_000+"s");
      

   }

   private static <T> void printTree(Node<T> Node, String appender) {
      System.out.println(appender + Node.getData());
      if (Node.getLeftChild() != null) {
         printTree(Node.getLeftChild(), appender + appender);
      }

      if (Node.getRightChild() != null) {
         printTree(Node.getRightChild(), appender + appender);
      }
   }

   private static <T> void InfixeSort(Node<T> Node) {
      if (Node.getLeftChild() != null) {
         InfixeSort(Node.getLeftChild());
      }
      System.out.print(Node.getData() + ", ");
      if (Node.getRightChild() != null) {
         InfixeSort(Node.getRightChild());
      }
   }
}
