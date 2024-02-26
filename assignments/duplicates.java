
import java.util.Scanner;
class Duplicates {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ls = sc.nextLine();

        boolean[] visited = new boolean[256];

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<ls.length();i++){
            if(!visited[ls.charAt(i)]){
                visited[ls.charAt(i)] = true;
                sb.append(ls.charAt(i));
            }
        }

        System.out.println(sb.toString());

        sc.close();

    }
}
