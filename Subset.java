import java.lang.Math; 
public class Subset { 

    public static void main(String[] args) { 
        char set[] = {'a', 'b', 'c'}; 
        int len = set.length;
        double n = Math.pow(2,len);
        for(int i = 0; i < n; i++){
            String s = Integer.toBinaryString(i);
            String subset = "";
            
            /**
                adding 0's to make it's length 3
             */
            if(s.length() == 1) {
                s = "00" + s;
            }
            if(s.length() == 2){
                s = "0"+ s;
            }

            /**
            finding subsets
            if the digit is equals to 1 then we print the character either a or b or c
             */
            if(s.charAt(0) == '1'){
                subset = subset + 'a';
            }
            if(s.charAt(1) == '1'){
                subset = subset + 'b';
            }   
            if (s.charAt(2) == '1'){
                subset = subset + 'c';
            }
            System.out.println("{ "+subset+" }");
        }
    } 
} 