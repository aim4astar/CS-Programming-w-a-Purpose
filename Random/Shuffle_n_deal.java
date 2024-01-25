
// Algorithm: Shuffle the deck, then deal.
// 1. Consider each card index from 0 to 51.
// Calculate a random index r b/w i and 51.
//Exchange deck[i] with deck[r]
//Print the first N cards in the deck
public class Shuffle_n_deal
{
    public static void main(String[] args)
    {
        String[] suit = {" Heart", " Diamond", " Clubs", " Spades"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int N = Integer.parseInt(args[0]);

        String[] deck = new String[52];
        for (int i=0; i< suit.length; i++)
            for (int j=0; j< rank.length; j++)
                deck[j+13*i] = rank[j] + suit[i];

        for(int i=0; i<52; i++) {
            int r = i + (int) (Math.random() * (52 - i));
            String t = deck[r];    //We initialize a String-type variable "t" that holds the value of the element at the rth index position of the array deck
            deck[r] = deck[i];     //The ith location element is copied to the rth location, thus leaving the ith location empty
            deck[i] = t;    //t is copied to the previously empty ith location.
        }
        for(int i=0; i<N; i++)
            System.out.println(deck[i]);


    }
}
