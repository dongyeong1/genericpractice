package parkjava0326;

public class BoxTest {

	public static void main(String[] args) {

		//제네릭을 써서 중복을제거하자!!!!!!!
		Box box = new Box();
		box.setValue("홍길동");
		String vString = box.getValue();
		System.out.println(vString);
		
		
	}

}
