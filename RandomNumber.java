import java.util.*;

class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("5 Random 3-digit numbers:");
	int a[]=new int [5];
        for (int i = 0; i < 5; i++) {
            int randomNumber = 100 + random.nextInt(900);
		a[i]=randomNumber;
            System.out.println(randomNumber);
        }
	int max=Integer.MIN_VALUE;
	int small=Integer.MAX_VALUE;
	for(int i=0;i<5;i++){
	small=Math.min(small,a[i]);
	max=Math.max(max,a[i]);
    }
System.out.println("THE MAX VALUE IS :"+max);
System.out.println("THE MIN VALUE IS :"+small);


}
}
