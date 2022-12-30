package Inheritance;
class Bike
{
	void speed()
	{
		System.out.println("150KMH");
	}
	}
public class Finaldemo extends Bike { //final class can not be extended
	//void speed() //we can not override the final method
	//{
		//System.out.println("160KMH");
	//}
int a=100;
public static void main(String[]args) 
{
	Finaldemo demo = new Finaldemo();
	//demo.a=40;//we can not assign value to final variable
	System.out.println(demo.a);
}
}
