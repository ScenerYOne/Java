public class Card {
    
    private int number ;

    public Card(){
        rand();
    }

    public void rand(){
        number = (int) (Math.random() * 9) + 1;
    }


    public int getNumber(){
        return this.number;
    }
}