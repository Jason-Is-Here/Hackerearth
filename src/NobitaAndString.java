import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NobitaAndString {
    public static void main(String... args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0)
        {
            String f[] = br.readLine().split(" ");
            StringBuilder b = new StringBuilder();
            for(int i = f.length-1;i>=0;i--)
                b.append(f[i]+" ");
            System.out.println(b.toString());
        }


    }
}
