import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class runs {
    public static void main(String[] args) {
        HashMap<Integer, String> match = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter Name : ");
            String name = sc.nextLine();
            System.out.println("Enter Time : ");
            int time = sc.nextInt();
            match.put(time,name);
            System.out.println("Do you want to add another record(Y/N)?");
            sc.nextLine();
            String opt = sc.nextLine();
            if (opt.equals("N") || opt.equals("n")){
                break;
            }
        }
        ArrayList<Integer> score = new ArrayList<>(match.keySet());
        Collections.sort(score);
        int minimum = score.get(0);
        int runnerup = score.get(1);

        System.out.println("Sorted Record list : ");
        System.out.println("NAME\t\t\tTIME");
        for (int i = 0; i < match.size(); i++){
            System.out.println(match.get(score.get(i)) + "\t\t" + score.get(i));
        }

        System.out.println("Winner is : " + match.get(minimum));
        System.out.println("Winning time lap : " + minimum);

        System.out.println("Runner up : " + match.get(runnerup));
        System.out.println("Runner time lap : " + runnerup);
    }
}
