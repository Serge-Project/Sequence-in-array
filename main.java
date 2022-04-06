public class MyClass {
    public static void main(String args[]) {
     
        int array[] = {5, 1, 22, 25, 6, -1, 8, 10};
        int sequence[] = {5, -1, 22};
        int arr_length = array.length;
        int sequence_length = sequence.length;
        int temp = 0;
        int j=0;
         
        for (int i = 0; i < arr_length; i++) {
                if(array[i] == sequence[j]){
                    //System.out.println("i is: " + i + "  j is: " + j + " and We are in ONE           YESSSSSSSSSS");
                        // for(int x=0; x<j; x++){
                        //      System.out.println(sequence[x]);
                        // }
                        if(j == sequence_length-1){
                             System.out.println("True");
                             return;
                        }
                    j++;
                }
                else if( (i>0) && (array[i] == sequence[0]) ){
                   // System.out.println("i is: " + i + "   j is: " + j + " and We are in TWO ");
                    //  System.out.println(" Found the first one in sequence again ");
                     j = 0;
                     j++;
                }
                else {
                  //  System.out.println("i is: " + i + "  j is: " + j + " and We are in THREE ");
                    for (temp = 0; temp < sequence_length; temp++) {
                        if( (array[i] == sequence[temp]) && (temp < j) ){
                            j=0;
                        }
                    }
                }
        }
        System.out.println("False");
    }
}
