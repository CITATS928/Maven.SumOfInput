import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer in Jan 2024
 */
public class Main {

    public static void main(String[] args){
        long st,et,et2,at,at2;
        int number = getInputNumber();

        st=System.currentTimeMillis();
        int sum = sumOfNumbers(number);
        et=System.currentTimeMillis();
        int sum2=gaussianSumOfNumbers(number);
        et2=System.currentTimeMillis();
        at=et-st;
        at2=et2-et;
        System.out.println("sum is "+sum+"\ngaussian is "+sum2);
        System.out.println("st:"+st+"\net:"+et+"\net2:"+et2);

        if(at>at2){
            System.out.println("2 fast");
        } else if (at2>at) {
            System.out.println("1 fast");
        }else{
            System.out.println("same");
        }

    }

    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6
    static int sumOfNumbers(int n) {
        int sum=0;
/*        long st,et,at;
        st=System.currentTimeMillis();*/
        for(int i=n;i>=0;i--){
            sum+=n;
            n--;
        }
/*        et = System.currentTimeMillis();
        at = et - st;
        System.out.println("actual time is "+at);*/
        return sum;
    }
    
    
    static int getInputNumber() { // gee, may thi sis useful in another lab?
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        return num;
    }
    
    
    
    // for Extra Credit
    static int gaussianSumOfNumbers(int n) {
        int sum;
/*        long st,et,at;
        st=System.currentTimeMillis();*/
        sum=(n*(n+1))/2;

/*        et = System.currentTimeMillis();
        at = et - st;
        System.out.println("actual time is "+at);*/


        return sum;
    }
   
    // for Extra extra credit - compare the methods and show which one is faster
    // google "how to time some java code"
    // use "System.currentTimeMillis()" to ask the system what time it is.
}
