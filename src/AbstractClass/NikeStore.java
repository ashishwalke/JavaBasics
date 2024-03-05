package AbstractClass;

public class NikeStore extends ShoeStore {

	@Override
	public void sellShoes() {
		System.out.println("Selling " + brandName + " Shoes ");
	}

	@Override
	public void Founder() {
		System.out.println("The Founder of This Brand are : " + founder);

	}

	public static void main(String[] args) {

		ShoeStore store = new NikeStore();

		store.sellShoes();
		store.Founder();
		store.yearFounded();

	}

}
