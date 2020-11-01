import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		
		String ch = "abcdefghijklmnopqrstuvwxyz", s = "";
		int i=0, j=0, y=1;
		while(y<=x)
		{
		    if(y%27==0)
		    {
		        i++;
		        j=0;
		    }
		    
		    s = ch.charAt(i) + "" + ch.charAt(j);
		    System.out.print(s + " ");
		    j++;
		    y++;
		}
	}
}