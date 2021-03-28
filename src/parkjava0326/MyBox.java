package parkjava0326;

import org.omg.CORBA.PUBLIC_MEMBER;

public class MyBox<T> {
		T value;
		
		public void setValue(T value) {
			this.value=value;
		}
		
		public T getValue() {
			return value;
		}
	
	

}
