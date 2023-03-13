
package com.syle.mathutil.core;

public class MathUtilTest {
    // Hàm tính giai thừa.
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException("Gia tri vuot qua < 0  || > 20");
//        
//        if (n == 0 || n == 1)
//            return 1;
//        
//        int product = 1;
//        
//        for (int i = 2; i <= n; i++) {
//            product *= i;
//        }
//        return product;
//    }
                
    
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("n must be between 0..20. plz!");
        
        if (n == 0 || n == 1)
            return 1;
        return n * getFactorial(n - 1);
        
    }
    


}
