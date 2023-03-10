package dz4;

public class Dz44 {
    public static void main(String[] args) {
        int[] days={1,2,3,4,5,6,7};
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
            switch(days[i]){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
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
                default:
                    System.out.println("It's not a day, duude");
            }
        }

    
}}
