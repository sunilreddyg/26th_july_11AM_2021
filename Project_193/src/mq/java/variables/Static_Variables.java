package mq.java.variables;

public class Static_Variables 
{
	//Instant Variables [Global Variable]
		static int num=100;
		static String username="darshan";
		static boolean status=true;

	public static void main(String[] args) {
		
		int v1=Static_Variables.num;
		System.out.println(v1);
		
		String v2=Static_Variables.username;
		System.out.println(v2);
		
		boolean v3=Static_Variables.status;
		System.out.println(v3);
	}

}
