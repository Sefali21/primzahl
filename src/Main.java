import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int numberMax;
        Scanner scanner=new Scanner(System.in);
        numberMax= scanner.nextInt();
        int limit=3;
        ArrayList<Integer> primeList=new ArrayList<>();
        primeList.add(2);
        while (limit!=numberMax+1) {
            boolean flag=true;
            for (int i = 2; i <limit ; i++) {
                if(limit%i==0){
                    flag=false;
                    break;}
            }
            System.out.println(flag+" "+limit);
            if (flag){
                primeList.add(limit);
            }
            limit++;

        }
        for (var c:primeList ) {
            System.out.println(c+" ");
        }
    }
}
