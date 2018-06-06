package amazon;

import java.util.ArrayList;

public class StockBuySellMaxProfit {

    public static void main(String[] args) {
        StockBuySellMaxProfit stock = new StockBuySellMaxProfit();

        // stock prices on consecutive days
        int price[] = {100, 180, 260, 450};
        int n = price.length;

        // fucntion call
        stock.stockBuySell(price, n);

        int priceArr[] = {100, 80};
        n = priceArr.length;

        // fucntion call
        stock.stockBuySell(priceArr, n);
    }

    void stockBuySell(int price[], int n){

        //Prices must be given for atleast two days
        if(n==1){
            return;
        }
        int count = 0;

        //Solution Array
        ArrayList<Interval> sol = new ArrayList<Interval>();

        // Traverse through given price array
        int i = 0;
        while (i < n-1){

            // Find Local Minima. Note that the limit is (n-2) as we are
            // comparing present element to the next element.
            while ((i < n - 1) && (price[i + 1] <= price[i]))
                i++;

            // If we reached the end, break as no further solution possible
            if (i == n - 1)
                break;

            Interval interval = new Interval();
            interval.buy = i++;
            // Store the index of minima


            // Find Local Maxima.  Note that the limit is (n-1) as we are
            // comparing to previous element
            while ((i < n) && (price[i] >= price[i - 1]))
                i++;

            // Store the index of maxima
            interval.sell = i-1;
            sol.add(interval);

            // Increment number of buy/sell
            count++;

        }

        // print solution
        if (count == 0)
            System.out.println("There is no day when buying the stock "
                    + "will make profit");
        else
            for (int j = 0; j < count; j++)
                System.out.println("Buy on day: " + sol.get(j).buy
                        +"        " + "Sell on day : " + sol.get(j).sell);

        return;

    }
}

class Interval{
    int buy, sell;
}

