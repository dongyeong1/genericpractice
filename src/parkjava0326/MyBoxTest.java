package parkjava0326;

public class MyBoxTest {
		public static void main(String[] args) {
			
			
			MyBox box1 = new MyBox();
			box1.setValue(22.3);
			openBox(box1);
		}
		
		private static void openBox(MyBox box) {
//			Object obj = box.getValue();
			Double d = (Double)box.getValue();
			System.out.println(d);
			
		}
}
