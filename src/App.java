import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Snake and Ladder!");
        int pos=0;
        Random random = new Random();
        int number = (random.nextInt(6)+1);
        int steps=0;
        Random rand = new Random();
        int choose = rand.nextInt(3); //0->no; 1->ladder; 2->snake
        if(choose==1){steps+=number;}
        else if(choose==2){steps-=number;}
    }
}
