// import java.util.Scanner; // SCANNER IS A CLASS IN JAVA TO TAKE INPUT FROM USER OR TO READ INPUTS. 
// public class Main{
//     public static void main(String[] args){ // S SHOULD BE CAPITAL 
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         System.out.println(num); // S SHOULD BE CAPITAL
//     }
// }



import java.util.Scanner
public class main{
public static int add(int a , int b){
    return a+b;
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in)
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = add(5,3);
        System.out.println(sum);
    }
}
}