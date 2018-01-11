import java.util.Random;
import java.util.Arrays;

public class TextBall{
	public static void main(String[] args) {
		Random ball1 = new Random();
		Random ball2 = new Random();

		int[] win = new int[]{14,8,13/*,2,20,18*/};
		int[] test = new int[3];
		int count = 1;


        //Ëæ»ú³éºìÇò
        while(true){
        	for(int i=0;i<3;i++) {
        		int[] rednum = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33};
           		aa:
           		while(true) {
              	  int red = ball1.nextInt(33);
              	  if(rednum[red] != 0) {
               	     test[i] = rednum[red];
               	     rednum[red] = 0;
               	     break aa;
               	 	}

           	 	}
        	}

           	int lucky = ball2.nextInt(16)+1;
        	Arrays.sort(test);
			Arrays.sort(win);
			String test1 = Arrays.toString(test);
			String win1 = Arrays.toString(win);


			if(test1.equals(win1)&&lucky==6){
				System.out.println(test1);
				System.out.println("»¨ÁË"+2*count+"RMB");
				break;
			}else{
				count++;
			}


        }
	}

}
