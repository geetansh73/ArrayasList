import java.util.*;
class arraysaslist1
{
public static void main(String g[])
{
String str[]={"Rakesh","Utkarsh","Shubham","Neelam"};
List <String>al=new ArrayList<String>(Arrays.asList(str));
System.out.println(al);
}
}