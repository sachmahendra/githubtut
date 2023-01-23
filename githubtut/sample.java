@interface MyAnno
{
String name();
String project();
String Date()  default today;
String version() default 13;
}
public class ABtargetAnno207
{

public static void main(String[] args)
{
@MyAnno(name = Mahi,project = Bank)
int x;
}