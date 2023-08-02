public class Main {
    public static void main(String[] args) {
        System.out.println("Java sswitch");
        //Java switch statement
        /*Instead of writting many if...else statements, you can use the switch statement.
        * The switch statement selects one of many code blocks to be executed*/
        //The switch expression is evaluated once
         int day =3;
         switch (day) {
             case 1:
                 System.out.println("Monday");
                 break;
             case 2:
                 System.out.println("Tueday");
                 break;
             case 3:
                 System.out.println("Wednesday");
                 break;
             case 4:
                 System.out.println("Thursday");
                 break;
             case 5:
                 System.out.println("Friday");
                 break;
             case 6:
                 System.out.println("Saturday");
                 break;
             case 7:
                 System.out.println("Sunday");
                 break;
                 //outputs "wednesday" (day 3)
             /*When java reaches a break keyword, it breaks out of the switch block.
             * A break can save alot of execution time because it ignores te execution of all
             * the rest of the code in the switch block*/
         }
         int num=8;
         switch (num) {
             case 5:
                 System.out.println("Today is Friday");
                 break;
             case 6:
                 System.out.println("Today is Saturday");
                 break;
             case 7:
                 System.out.println("Today is Sunday");
                 break;
             default:
                 System.out.println("Looking forward to a weekend");
                 //The defoult keyword specifies some code to run if there is no case match.
                 //Note that if the default statement is used as the last statement in a switch block, it does not need a break

         }

    }
}