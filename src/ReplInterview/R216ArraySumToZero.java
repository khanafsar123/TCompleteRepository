package ReplInterview;

import java.util.Arrays;

/* Create an Array of size N whose elements sum to zero
    ArraySumToZero(0) ->{}
    ArraySumToZero(1) ->{0}
    ArraySumToZero(2) ->{-1,1}
    ArraySumToZero(3) ->{1,-1,0}
    ArraySumToZero(4) ->{2,-2,3,-3}
    N will be given as input to the function and fucntion will return
    an array whose element will sum to zero. */
public class R216ArraySumToZero {
        public static int[] arraySumToZero(int N) {
            int[] num = new int[N];
            for(int i=1;i<N;i+=2){
                num[i]=i;
                num[i-1]=i*-1;

            }
            return num;
        }
        public static void main(String[]args){
            System.out.println(Arrays.toString(arraySumToZero(3)));
        }
}

class Main {
    public static int[] arraySumToZero(int N) {
        int[] array = new int[N];
        for (int i=0; i< N; i+=2)  {
            array[i] =N/2 + i/2;
            if(i<(N-1))
                array[i+1] = -1*(N/2 + i/2);
            else array[i] = 0;
        }
        return array;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arraySumToZero(0)));
        System.out.println(Arrays.toString(arraySumToZero(1)));
        System.out.println(Arrays.toString(arraySumToZero(2)));
        System.out.println(Arrays.toString(arraySumToZero(3)));
        System.out.println(Arrays.toString(arraySumToZero(4)));
    }}