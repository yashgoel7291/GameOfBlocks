import java.security.MessageDigest;
import java.util.Scanner;
class SHA256InJava
 {
public static void main(String[] args)
{
 long start=System.nanoTime();
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the String");
 String str = sc.nextLine();
 try{
    int i=0;
    MessageDigest digest = MessageDigest.getInstance("SHA-256");  // creating object of Class MessageDigest to use SHA256 function and calculate hash 
    while(true)                                                   // of the data in bytes
    {
    String data=str+i;
    byte[] hash = digest.digest(data.getBytes("UTF-8"));          // Storing Hash of the data in the byte [] hash array
    boolean b = check(bytesToHex(hash),5);                        // calling bytesToHex function to get the hexadecimal String value of the hash
    if(b)                                                         // calling the check function to know whether or not the hash corresponding to the data(str+i)
    {                                                             // starts with 5 zero's or not
    System.out.println("The Required number is = " + i );         // if yes then we found the required number, then print the required value and break the loop
    break;
    }
    else
    i++;                                                          // if no, then increment the value of i
 }
 }
catch(Exception e)                                                // catch block to print the exception if any from the try block and avoid unexpectable termination of code
{
    System.out.println(e);
}
long end = System.nanoTime();
long time = end - start;
System.out.println("Time Of Execution = " + time + " Nanoseconds"); // prints the time for the execution of the entire code
 }



 public static String bytesToHex(byte[] bytes) 
 {
StringBuffer hexChars = new StringBuffer();
for( byte b : bytes)
{
    int decimal = (int) b & 0xff;
    String hex = Integer.toHexString(decimal);
    if(hex.length()==1)
    {
        hex = '0' + hex;
    }
    hexChars.append(hex);
}
return (hexChars.toString());
}
public static boolean check(String st, int n)
{
    boolean b = true;
        for(int i=0;i<n;i++)
        {
            if(st.charAt(i)!='0')
            {
                b = false;
                break;
            }
        }
        return b;
    }
 }
