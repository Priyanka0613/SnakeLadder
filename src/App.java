import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Snake and Ladder!");
        int pos1 = 0;
        int pos2=0;
        int steps1=0;
        int steps2=0;
        Random random = new Random();
        boolean flag = false; //player1->false; player2->true
        boolean flag1=false;
        while (pos1<100 && pos2<100) {
            while(flag==false){
                int number1 = (random.nextInt(6)+1);
                int choose1 = random.nextInt(3);
                if(choose1==1){
                    flag=false;
                    if(pos1+number1<100){
                        pos1=pos1+number1;
                        System.out.println("You are at position: "+pos1);
                    }
                    else if(pos1+number1==100){
                        System.out.println("WON player1! and the number of dices it took you: " + steps1);
                        flag1=true;
                        break;
                    }
                }
                else if(choose1==2 && pos1-number1>=0){
                    flag=true;
                    pos1-=number1;
                    System.out.println("You are at position: "+pos1);
                }
                else{
                    flag=true;
                }
                steps1+=1;
            }
            if(flag1==true){break;}
            while(flag==true){
                int number2 = (random.nextInt(6)+1);
                int choose2 = random.nextInt(3);
                if(choose2==1){
                    flag=false;
                    if(pos2+number2<100){
                        pos2=pos2+number2;
                        System.out.println("You are at position: "+pos2);
                    }
                    else if(pos1+number2==100){
                        System.out.println("WON player2! and the number of dices it took you: " + steps2);
                        flag1=true;
                        break;
                    }
                }
                else if(choose2==2 && pos2-number2>=0){
                    flag=false;
                    pos2-=number2;
                    System.out.println("You are at position: "+pos2);
                }
                else{
                    flag=false;
                }
                steps2+=1;
            }
            if(flag1==true){break;}
        }
    }
}
