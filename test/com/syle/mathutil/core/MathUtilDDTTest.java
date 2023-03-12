
package com.syle.mathutil.core;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


// Câu lênh này là câu lênh của junit báo hiệu răng sẽ loop qua cặp data để
// lấy ra cặp data input/expected nhồi vào hàm test.
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    // Trả về mảng hai chiều gồm nhiều cặp expected input.
    @Parameterized.Parameters // Junit xẽ chạy qua từng dòng của mảng để lấy ra cặp data.
    public static Object[][] initData() {
        return new Integer[][] {
                                {0, 1},
                                {1, 1},
                                {2, 2},
                                {3, 6},
                                {4, 24},
                                {6, 720},
        };
    }
    
    @Parameterized.Parameter(value = 0) // Map với mảng data.
    public int n; // Biến map với cột 0 của mảng.
    
    @Parameterized.Parameter(value = 1)
    public long expected; 
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(expected, MathUtilTest.getFactorial(n));   
    }
    
}
