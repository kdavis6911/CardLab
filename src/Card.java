public class Card {

    String rank;
    String suit;
    int pointvalue;

    public Card(String rank, String suit, int pointvalue)
    {
        this.rank = rank;
        this.suit = suit;
        this.pointvalue = pointvalue;
    }
    public boolean equals(Card othercard)
    {
        if (pointvalue == othercard.pointvalue)
        {
            return true;
        }
        return false;
    }
    public String toString()
    {
        return "This card's rank is: " + this.rank + "\nThis card's suit is: " + this.suit + "\nThis card's value is: " + this.pointvalue;
    }
}
