public class ComputerPlayer
{
    private CardStack2 myCards;


    public ComputerPlayer()
    {
        myCards = new CardStack2();
    }

    public int getNumCards()
    {
        return myCards.size();
    }

    /**
     * adds the given card to myCards.
     * @param c - a card to add
     */
    public void acceptCard(Card c)
    {
        // ---------------------------------
        // TODO: you write this.

        // ---------------------------------

    }

    /**
     * selects a card from the computer player to play on the given card, removing it from the computer player's stack of cards;
     * returns null if a move is not available.
     * @param otherCard - the card on which to play
     * @return a card to play on this, or null, if we can't!
     */
    public Card getPlayForCard(Card otherCard)
    {
        Card cardToPlay = null;
        // ---------------------------------
        // TODO: You write this.

        // initial suggestion, make a temporary list of cards, initially empty. Loop through copies of all the cards in the
        // computerplayer's stack and put the copy into our temporary list if the card could be played on otherCard.


        // if there are any cards in this list, pick one at random. Remove it from the computerplayer's stack, and return it.
        // if not, return null.

        // ---------------------------------
        return cardToPlay;
    }

}
