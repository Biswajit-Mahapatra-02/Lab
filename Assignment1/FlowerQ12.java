
public class FlowerQ12 {
	String name;
	int nop;
	float price;
	FlowerQ12(){
		name = "Flower";
		nop = 5;
		price = 0.50f;
	}
	void setName(String name) {
		this.name = name;
	}
	void setNop(int nop) {
		this.nop = nop;
	}
	void setPrice(float price) {
		this.price = price;
	}
	String getName() {
		return name;
	}
	int getNop() {
		return nop;
	}
	float getPrice() {
		return price;
	}
}
