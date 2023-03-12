
package com.syle.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilityTest {
    // Đây là class sẽ sử dụng các hàm của thư viện/frameWork JUnit
    // Để kiểm thử/kiểm tra code chính - hàm tính giai thừa() bên
    // class core.MathUtil
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
         int n = 0; 
         long expected = 1;
         // long actual =;
        long actual = MathUtilTest.getFactorial(n);
         
         // So sánh dung frameWork.
         // Hàm này nếu giống thì nó thảy ra màu xanh, không giống thảy ra màu đỏ.
        Assert.assertEquals(expected, actual);
         
         // Gộp thêm vài các test case.
        Assert.assertEquals(1, MathUtilTest.getFactorial(1));   // tui mún 1! == 1
        Assert.assertEquals(2, MathUtilTest.getFactorial(2));   // tui mún 2! == 2
        Assert.assertEquals(6, MathUtilTest.getFactorial(3));   // tui mún 3! == 6
        Assert.assertEquals(24, MathUtilTest.getFactorial(4));  // tui mún 4! == 24
        Assert.assertEquals(120, MathUtilTest.getFactorial(5)); // tui mún 5! == 120
        Assert.assertEquals(720, MathUtilTest.getFactorial(6)); // tui mún 6! == 720
         
    }
    
    // TÌnh huống Đưa data cà chớn.
    // Ngoại lệ là không thể so sánh. mà phải bằng cách xem nó có xuất hiện hay không.
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenRightArgumentThrowException() {
        MathUtilTest.getFactorial(-5); // 
    }
    
    // Xài lambda.
    // Tui muốn màu xanh với 21!
    @Test()
    public void testGetFactorialGivenRightArgumentThrowException_lambdaVesion() {
        // Assert.assertThrows( Tham số 1: Loại ngoại lệ muốn so sánh,
        //                     Tham số 2: Đoạn code chạy văng ra ngoại lệ đó)
        
        Assert.assertThrows(IllegalArgumentException.class,
                        () -> MathUtilTest.getFactorial(-5)
                        );
    }
    
    
    // Bắt ngoại lệ xem hàm có ném về ngoại lệ hay không khi n nhập cà chớn.
    // Có ném tức là đúng thiết kế nên -> xanh.
    @Test()
    public void testGetFactorialGivenRightArgumentThrowException_TryCatch() {
        // Kiểm soát ngoại lệ.
        
        try {
            MathUtilTest.getFactorial(-5);
        } catch (Exception e) {
            // Bắt TryCatch thì Junit nó sẽ ra màu xanh do đã chủ động kiểm soát ngoại lệ
            // nhưng không chắc chắn ngoại lệ  mình cần có xuất hiện hay không??
            
            Assert.assertEquals("Gia tri vuot qua < 0  || > 20",
                                e.getMessage());
        }
 
    }
}
