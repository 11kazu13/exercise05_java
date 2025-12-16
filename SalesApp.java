package exercise05;

import java.util.ArrayList;

// 売上管理アプリ（オーバーライド対応版）
public class SalesApp {

    public static void main(String[] args) {
        

        System.out.println("=== 売上管理アプリ（オーバーライド対応版） ===");

        // Product と FoodProduct を追加
        ArrayList<Product> products = new ArrayList<Product>();
        
        Product product1 = new FoodProduct("リンゴ", 200, 5, "2025-12-26");
        Product product2 = new Product("ノート", 300, 3);
        
        products.add(product1);
        products.add(product2);

        // 売上一覧表示
        System.out.println("\n--- 売上一覧 ---");
        
        for (Product product : products) {
        	product.showProduct();
        }

        // 総売上計算
        System.out.println("\n--- 総売上 ---");
        
        int sum = 0;
        
        for (Product product : products) {
        	sum += product.calculateSales();
        }
        
        System.out.println(sum);
    }
}
