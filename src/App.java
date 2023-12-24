import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Snake and Ladder!");
        int pos = 0;
        int steps=0;
        Random random = new Random();
        int number = (random.nextInt(6)+1);
        Random rand = new Random();
        int choose = rand.nextInt(3); //0->no; 1->ladder; 2->snake
        while (pos<=100) {
            if(choose==1){
                if(pos+number<100){
                    pos=pos+number;
                    System.out.println("You are at position: "+pos);
                }
                else if(pos+number==100){System.out.println("WON! and the number of dices it took you: " + steps);}
            }
            else if(choose==2 && pos-number>=0){
                pos-=number;
                System.out.println("You are at position: "+pos);
            }
            steps+=1;
        }
    }
}
