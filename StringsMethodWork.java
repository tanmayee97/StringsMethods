
public class StringsMethodWork 
{
	public static void main(String[] args)
	{
		String a=new String("ABC");
		String b="ABC";
		String c="ABC";
		String d=" HELLO ";
		String e="tanmayee";
		String f="pa d maja";
		String g="ABC DEF GHI JKL";
		
		
		
		if(a==b)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		if(a.equals(b))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		
		

		if(a==c)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		if(a.equals(c))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}


		
		if(b==c)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		if(b.equals(c))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		
	//StringMethods
		
		
		int len=a.length();
		System.out.println(len);
		
		String res=a.toLowerCase();
		System.out.println(res);
		
		String res1=e.toUpperCase();
		System.out.println(res1);
		
		String res2=e.replace('a', 'k');
		System.out.println(res2);
		
		String res3=e.replaceAll("tanmayee", "kiranmai");
		System.out.println(res3);
		
		String res4=e.replaceAll("tan", "kiran");
		System.out.println(res4);
		
		System.out.println(d);
		
		String res5=d.trim();
		System.out.println(res5);
		/*
		String[] res6=f.split("d");
		System.out.println(res5);
		*/
		
		boolean res7=g.contains("ABC");
		System.out.println(res7);
		
		boolean res8=g.contains("CDE");
		System.out.println(res8);
		
		boolean res9=g.contains("XYZ");
		System.out.println(res9);
		
		
	}
}
