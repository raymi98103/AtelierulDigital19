package lab1.challenge1;

public class Main {
    void fizzBuzz() {
        int i = 1;
        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0)
                System.out.println("fizz");
             else
                if (i % 5 == 0)
                    System.out.println("Buzz");
                 else
                    System.out.println(i);
                }
            }

        public static void main (String args[]){
            System.out.println("Atelierul Digital 2019");
            Main a = new Main();
            a.fizzBuzz();
        }
    }

