package test_p41;

public class Sample4_13 
{
	public static void main(String[] args) 
	{
		Car car1 = new Car(1234,20.5);
		car1.vshow();
		car1.mshow();
	}
}

interface iVehicle
{
	 void vshow();
}

interface iMaterial
{
	 void mshow();
}

class Car implements iVehicle,iMaterial
{
	protected int num;
	protected double gas;
	
    public Car(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+",�T�o�q�]��"+gas);
	}
    
	public void vshow()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
	
	public void mshow()
	{
		System.out.println("���l������O�K");
	}
}