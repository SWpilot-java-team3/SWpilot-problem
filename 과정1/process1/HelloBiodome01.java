package 과정1.process1;

import java.io.IOException;
// commit test
public class HelloBiodome01 {
	public static void main(String[] args) throws IOException
	{
		if(args.length<1) {
			System.out.println("재입력 하세요!");
			System.exit(1);
			// test2
		}
		
		String name = args[0];
		
		System.out.println("어서오세요 "+ name +" 님!");
		System.out.println("좋은 아침입니다");
		
	}
}
