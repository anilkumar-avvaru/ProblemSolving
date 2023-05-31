// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import com.problems.DebugUtils;
public class Main {
    private static final int INFINITY = -9999;
    public static void main(String[] args) {
        //Min-Coins Change problem
        try{
            int[][] myArray = {
                    {0, 1, 2, 3, 123, 123, 123, 123},
                    {12345, 123, 1234567, 123, 1, 123, 12, 12345678},
                    {12, 12, 123, 12, 12, 123, 1, 1234}
            };
            DebugUtils du = new DebugUtils();
            du.printTwoDimensionalArray(myArray, "myArray");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}