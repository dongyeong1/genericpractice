package parkjava0326;

import java.util.List;

public class Utill {
	//���׸��޼ҵ��� ����
		public static <T extends Comparable<T>>T getmax(T[] arr) {
			T max=arr[0];
			for(int i=1; i<arr.length; i++) {
//				if(max<arr[i]) max=arr[i];
				//���ڿ��̿����� �ȵǴϱ� ����������
				if(max.compareTo(arr[i])<0) max=arr[i];
				
			}
			return max;
		}
		
		
		public static <T> void println(T[] arr) {
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+" ,");
			}
		}
		
		
		
		
		public static<T extends Number> void printValueof5times(T value) {
			Double result =value.doubleValue()*5;
			System.out.println(result);
		}
		
		public static <T extends Number>void printsum(List<T> list) {
//					T sum = 0;
					Double sum = 0.0;
					for(T val :list) sum+=val.doubleValue();
					//T�� student�̸� 0�� �������ϱ� ����
					
					System.out.println("sum: "+ sum);
		}
		
		public static void printsum2(List<? extends Number> list) {
//			T sum = 0;
			Double sum = 0.0;
			for(Number val :list) sum+=val.doubleValue();
			//T�� student�̸� 0�� �������ϱ� ����
			
			System.out.println("sum: "+ sum);
}
		
		
}
