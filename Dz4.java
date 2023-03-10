package dz4;



public class Dz4 {
    

    public static void main(String[] args) {
        int[] num ={1,2,10,25,67,2,100,400,175,7,98,2500,1392,1756};  
        for (int i = 0; i < num.length; i++) {
            if(num[i]<10){
                System.out.println("Одиночне");
            }else if(num[i]>9 && num[i]<100){
                System.out.println("Десятки");
            }else if(num[i]>99 && num[i]<1000){
                System.out.println("Сотнi");
            }else if(num[i]>999 && num[i]<10000){
            System.out.println("Тисячi");
         }else{System.out.println("Дуже-дуже велике число");}
        }
    }
}

