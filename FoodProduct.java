package exercise05;

// FoodProductクラスはProductクラスを継承
public class FoodProduct extends Product {
	// 賞味期限
	private String expiryDate;

	// 引数なしコンストラクタ
	public FoodProduct() {
		super();
		this.expiryDate = "未設定";
	}

	// 引数ありコンストラクタ
	public FoodProduct(String name, int price, int quantity, String expiryDate) {
		super(name, price, quantity);
		this.expiryDate = expiryDate;
	}

	// ProductのshowProductをオーバーライドし、賞味期限も表示
	@Override
	public void showProduct() {
		System.out.printf("商品名：%s, 価格：%d, 数量：%d, 売上金額：%d, 賞味期限：%s\n",
				this.getName(), this.getPrice(), this.getQuantity(), this.calculateSales(), this.expiryDate);
	}

	// getter/setter
	public String getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
}
