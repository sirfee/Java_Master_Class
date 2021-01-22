public class App {
    public static void main(String[] args) throws Exception {
        int result = 1 + 2;  // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10;   // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;   // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3;  // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        //result = result + 1;
        result++;
        System.out.println("1 + 1 = " + result);
        result--;
        System.out.println("2 - 1 = " + result);

        result += 2;  // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        //result = result  * 10
        result *= 10;   //3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // result = result / 3 
        result /= 3;   // 30 . 3 = 10
        System.out.println("30 / 3 = " + result);

        //result = result - 2
        result -=2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false){
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100){
            System.out.println("You got the highscore");
        }

        int secoundTopScore = 60;
        if ((topScore > secoundTopScore) && (topScore < 100)){
            System.out.println("Greater than secound top score and less than 100");
        }

        if ((topScore > 90) || (secoundTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar){
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("wasCar is true");
        } 

        double myVariable = 20.00d;
        double mySecoundVariable = 80.00d;
        double myResult = (myVariable + mySecoundVariable) * 100.00d;
        System.out.println("result = " + myResult);
        double remainder = myResult % 40.00;

        boolean hasRemainder = (remainder != 0.00) ? true: false;
        System.out.println("hasRemainder = " + hasRemainder);

        if (hasRemainder){
            System.out.println("Got some remainder");
        }else{
            System.out.println("Has no remainder");
        }

    }
}
