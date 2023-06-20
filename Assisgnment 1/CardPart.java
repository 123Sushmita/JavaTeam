public class CardPart {
    private int rank;
    private String suit;

    public CardPart(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }



}



