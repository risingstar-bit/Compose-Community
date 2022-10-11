public class Main
{
	public static void main(String[] args) 
	{
		int a[]={3,2,4,2,6};
		int n=5;
		int index=f(a,n,0);
		System.out.print(index);
	}
	static int f(int []a,int n,int i)
	{
	    if(i==a.length)
	    return -1;
	    if(a[i]==n)
	    {
	        return i;
	    }
	    else
	    return f(a,n,i+1);
	}
}
