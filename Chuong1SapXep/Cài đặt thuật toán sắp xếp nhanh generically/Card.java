import java.util.Map;

public class Card implements Comparable<Card> {

    private final String rank;  // Giá trị
    private final String suit;  // Chất

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }
    
    private int suitValue() {
        switch (suit) {
            case "Spades":      return 1;   // Bích (Pique)
            case "Clubs":       return 2;   // Tép (Trèfle)
            case "Diamonds":    return 3;   // Rô (Carreau)
            case "Hearts":      return 4;   // Cơ (Cœur)
            default:            return 0;
        }
    }
    
    private int rankValue() {
        switch (rank) {
            case "Ace":   return 14;
            case "King":  return 13;
            case "Queen": return 12;
            case "Jack":  return 11;
            default:      return Integer.parseInt(rank);
        }
    }

    /**
     * So sánh hai lá bài theo thứ tự:
     * - So sánh chất (suit) trước
     * - Nếu chất bằng nhau, so sánh giá trị (rank)
     *
     * @param other lá bài dùng để so sánh
     * @return giá trị âm nếu lá này nhỏ hơn {@code other},
     *         bằng 0 nếu hai lá bằng nhau,
     *         và giá trị dương nếu lá này lớn hơn {@code other}
     */
    @Override
    public int compareTo(Card other) {
        // TODO
        return 0;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}