
public class Array_Sum {
public static void sum(int[] x)
{
	int Total=0;
	for (int x1:x)
	{
		Total=Total+x1;
	}
	System.out.println("The Sum is:"+Total);
}
public static void main (String[]args)
{
sum(new int[] {10,20,30,40,50});

}

}
