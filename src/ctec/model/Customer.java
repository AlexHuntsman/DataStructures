package ctec.model;

public class Customer
{
	private String name;
	boolean hasOrder;
	double total;
	
	
	public Customer()
	{
		name = RandomName();
		hasOrder = RandomOrder();
		total = RandomTotal();
		
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public boolean getHasOrder()
	{
		return hasOrder;
	}
	public void setHasOrder(boolean hasOrder)
	{
		this.hasOrder = hasOrder;
	}
	public double getTotal()
	{
		return total;
	}
	public void setTotal(double total)
	{
		this.total = total;
	}
	
	public String RandomName()
	{
		setName("mr" + (int) (Math.random() * 100));
		
		return name;
	}
	
	public boolean RandomOrder()
	{
		int random = (int) (Math.random() * 11);
		if(random % 2 != 0)
		{
			hasOrder = true;
		}
		else
		{
			hasOrder = false;
		}

		return hasOrder;
	}
	
	public double RandomTotal()
	{
		total = Math.random() * 100;
		total = Math.round(total * 100);
		total = total / 100;
		return total;
	}
}
