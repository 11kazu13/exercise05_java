package exercise05.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exercise05.FoodProduct;

// FoodProduct クラスのテストクラス
public class FoodProductTest {

    private FoodProduct foodProduct;

    @Before
    public void setUp() {
        // テスト用FoodProductの生成
        foodProduct = new FoodProduct("りんご", 100, 10, "2025-09-01");
    }

    @Test
    public void testConstructor() {
        assertEquals("りんご", foodProduct.getName());
        assertEquals(100, foodProduct.getPrice());
        assertEquals(10, foodProduct.getQuantity());
        assertEquals("2025-09-01", foodProduct.getExpiryDate());
    }

    @Test
    public void testCalculateSales() {
        assertEquals(1000, foodProduct.calculateSales());
    }

    @Test
    public void testSetters() {
        foodProduct.setName("バナナ");
        foodProduct.setPrice(120);
        foodProduct.setQuantity(5);
        foodProduct.setExpiryDate("2025-08-30");

        assertEquals("バナナ", foodProduct.getName());
        assertEquals(120, foodProduct.getPrice());
        assertEquals(5, foodProduct.getQuantity());
        assertEquals("2025-08-30", foodProduct.getExpiryDate());
        assertEquals(600, foodProduct.calculateSales());
    }
}
