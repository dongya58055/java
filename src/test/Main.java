package test;

public class Main {

	public static void main(String[] args) {
//		for (int i = 0; i < 20; i++) {
//			System.out.println(i+1);
//		}
		// System.out.println('a'+1);
//		System.out.println((double) 6/4);
//		int a = 1, b = 2;
//		System.out.println(a<b);
//		int i=10,j=45,k=34;
//		int max=i>j?i>k?i:k:j>k?j:k;
//		System.out.println(max);
//		Scanner sc = new Scanner(System.in);
//		String name = sc.next("fd");
//		System.out.println(name);

//		Random random = new Random();
//		Random r = new Random();
		// 3到17的随机数
		// 1 --40 从0开始s
//		int i=r.nextInt(40)+1;
//		System.out.println(i);
//		int[] faceScore = {15,9000,10000,20000,9500,-5};
//		int max = faceScore[0];
//		for (int i = 0; i < faceScore.length; i++) {
//			if (max<faceScore[i]) {
//				max=faceScore[i];
//			}
//		}
//		System.out.println(max);
		// 翻转数组
//		int[] arr= {10,20,30,40,50};
//		for(int i =0,j=arr.length-1;i<j;i++,j--) {
//			int temp=arr[j];
//			arr[j]=arr[i];
//			arr[i]=temp;
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

		// 随机排名
//		int[] codes = new int[5];
//
//		for (int i = 0; i < codes.length; i++) {
//			System.out.println("输入员工编号");
//			Scanner sc = new Scanner(System.in);
//			codes[i] = sc.nextInt();
//		}
//		for (int i = 0; i < codes.length; i++) {
//			System.out.print(codes[i] + " ");
//		}
//		Random r = new Random();
//		for (int i = 0; i < codes.length; i++) {
//			int random = r.nextInt(codes.length);
//			int temp = codes[i];
//			codes[i] = codes[random];
//			codes[random] = temp;
//		}
//		for (int i = 0; i < codes.length; i++) {
//			System.out.print(codes[i] + " ");
//		}
//		
		//方法
		//作用域
		int a=10;
		change(a);
		System.out.println(a);
	}
//	public int sum(int a,int b) {
//		int a1;int b1;
//		
//		return 0;
//		
//	}

	private static void change(int a) {
		System.out.println(a);
		a=20;
		System.out.println(a);
		
		
	}

}
