// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import com.problems.MinCoinChange;
public class Main {
    public static void main(String[] args) {
        //Min-Coins Change problem
        try{
            MinCoinChange minCoinChange = new MinCoinChange();
            minCoinChange.solve(true);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}