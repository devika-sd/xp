package promain;
import biopack.*;
import java.util.*;
class projectpackmain
{
static double ini,frst2,secd1,secd2,trid1,trid2,fin1,fin2,cgpa,prev;
static double gpa1,gpa2,gpa3,gpa4,gpa5,gpa6,gpa7,gpa8,gpa9;
public static void main(String args[])
{
int c,n;
String y;
projectpackmain p=new projectpackmain();
biotech bio=new biotech();
Scanner s=new Scanner(System.in);
System.out.println("enter the department");
System.out.println("1.biotech"+"\n");
c=s.nextInt();
switch(c)
{
case 1:
	System.out.println("enter the semester");
	n=s.nextInt();
	switch(n)
	{
	case 1:
		gpa1=bio.sem1();
		System.out.println("if you want to calculate cgpa");
		y=s.next();
		System.out.println(gpa1);
		if(y.equals("yes"))
		{
			p.cgpa(gpa1);
		}
		break;
	case 2:
		gpa2=bio.sem2();
		System.out.println("if you want to calculate cgpa");
		y=s.next();
		System.out.println(gpa2);
		if(y.equals("yes"))
		{
			p.cgpa(gpa2);
		}
		break;
	case 3:
		gpa3=bio.sem3();
		System.out.println("if you want to calculate cgpa");
		y=s.next();
		System.out.println(gpa3);
		if(y.equals("yes"))
		{
			p.cgpa(gpa3);
		}
		break;
	case 4:
		gpa4=bio.sem4();
		System.out.println("if you want to calculate cgpa");
		y=s.next();
		System.out.println(gpa4);
		if(y.equals("yes"))
		{
			p.cgpa(gpa4);
		}
		break;
	case 5:
		gpa5=bio.sem5();
		System.out.println("if you want to calculate cgpa");
		y=s.next();
		System.out.println(gpa5);
		if(y.equals("yes"))
		{
			p.cgpa(gpa5);
		}
		break;
	case 6:
		gpa6=bio.sem6();
		System.out.println("if you want to calculate cgpa");
		y=s.next();
		System.out.println(gpa6);
		if(y.equals("yes"))
		{
			p.cgpa(gpa6);
		}
		break;
	case 7:
		gpa7=bio.sem7();
		System.out.println("if you want to calculate cgpa");
		y=s.next();
		System.out.println(gpa7);
		if(y.equals("yes"))
		{
			p.cgpa(gpa7);
		}
		break;
	case 8:
		gpa8=bio.sem8();
		System.out.println("if you want to calculate cgpa");
		y=s.next();
		System.out.println(gpa8);
		if(y.equals("yes"))
		{
			p.cgpa(gpa8);
		}
		break;
	}
}
}
public void cgpa(double gpa)
{
biotech bio=new biotech();
Scanner sc=new Scanner(System.in);
String no;
System.out.println("do you know the previous cgpa");
no=sc.next();
	if(no.equals("yes"))
	{
		System.out.println("enter the previous cgpa");
		prev=sc.nextDouble();
		cgpa=(gpa+prev)/2;
		System.out.println(cgpa);
	}
	else
	{
		System.out.println("1.1st sem cgpa"+"\n"+"2.2nd sem cgpa"+"\n"+"3.3rd sem cgpa"+"\n"+"4.4th sem cgpa"+"\n"+"5.5st sem cgpa"+"\n"+"6.6th sem cgpa"+"\n"+"7.7th sem cgpa"+"\n"+"8.8th sem cgpa"+"\n");
	int t=sc.nextInt();
	switch(t)
	{
	case 1: cal();
		System.out.println(ini);
		break;
	case 2: 
		gpa1=bio.sem1();
		cal();
		System.out.println(frst2);
		break;
	case 3: 
		gpa1=bio.sem1();
		gpa2=bio.sem2();
		cal();
		System.out.println(secd1);
		break;
	case 4: 
		gpa1=bio.sem1();
		gpa2=bio.sem2();
		gpa3=bio.sem3();
		cal();
		System.out.println(secd2);
		break;
	case 5: 
		gpa1=bio.sem1();
		gpa2=bio.sem2();
		gpa3=bio.sem3();
		gpa4=bio.sem4();
		cal();
		System.out.println(trid1);
		break;
	case 6: 
		gpa1=bio.sem1();
		gpa2=bio.sem2();
		gpa3=bio.sem3();
		gpa4=bio.sem4();
		gpa5=bio.sem5();
		cal();
		System.out.println(trid2);
		break;
	case 7: 
		gpa1=bio.sem1();
		gpa2=bio.sem2();
		gpa3=bio.sem3();
		gpa4=bio.sem4();
		gpa5=bio.sem5();
		gpa6=bio.sem6();
		cal();
		System.out.println(fin1);
		break;
	case 8:
		gpa1=bio.sem1();
		gpa2=bio.sem2();
		gpa3=bio.sem3();
		gpa4=bio.sem4();
		gpa5=bio.sem5();
		gpa6=bio.sem6();
		gpa7=bio.sem7();
		cal();
		System.out.println(fin2);
		break;
	}

	}
}
public void cal()
{
	
	ini=gpa1;
	frst2=(gpa1+gpa2)/2;
	secd1=(frst2+gpa3)/2;
	secd2=(secd1+gpa4)/2;
	trid1=(secd2+gpa5)/2;
	trid2=(trid1+gpa6)/2;
	fin1=(trid2+gpa7)/2;
	fin2=(fin1+gpa8)/2;
}
}
	