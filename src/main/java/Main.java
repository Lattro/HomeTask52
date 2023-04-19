import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main
{
    public static void main(String[] args)
    {
        Set<String> setTree = new TreeSet<String>();
        System.out.println("Введите 20 слов");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <20;i++)
        {
            setTree.add(scanner.next());
        }
        System.out.println(setTree.toString());
    }
}
