import java.util.Scanner;
class stringmani
{
public static void main(String[] args)
{
System.out.println("Enter The String");
Scanner sc = new Scanner(System.in);
StringBuffer sb=new StringBuffer("Hello");
sb.append("everyone");
String str1 = sc.nextLine();
System.out.println("Enter another string");
String s=sc.nextLine();
System.out.println("Length of String = "+str1.length());
System.out.println("Character at First position  = "+str1.charAt(0));
System.out.println("Concatenate :"+str1.concat(s));
System.out.println("LOWERCASE : "+str1.toLowerCase());
System.out.println("UPPERCASE : "+str1.toUpperCase());
System.out.println("append : "+sb);
System.out.println("replace: "+str1.replace("h","@"));
System.out.println("indexof: "+str1.indexOf("e"));
sb.insert(5,"java");
System.out.println(sb);
char[] ch = str1.toCharArray();   
System.out.println("Char Array elements: ");  
for (int i = 0; i <ch.length; i++) 
{  
  System.out.println(ch[i]);  
}  

}
}
