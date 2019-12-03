package Icecreamordering;

public class Scoops extends Member
{
 protected int num_of_icecream;
 protected int Stype;
 private String Type;
 private double Sprice;
 private double payment;
 private double totalamountt;
 private double totalamount;
 
public Scoops (int num_of_icecream, int Stype, String Type, double Sprice, int member, String xmember)
{
super();
this.num_of_icecream = num_of_icecream;
this.Stype = Stype;
this.Type = Type;
this.Sprice = Sprice;
}

public Scoops()
{
    
}

public void setTotalamount(double totalamount)
{
    this.totalamount = totalamount;
}
public void settotalamountt(double totalamountt)
{
    this.totalamountt = totalamountt;
}

public double getTotalamount()
{   
    if (member==1)
    {
        totalamount = (Sprice+Tprice);
        totalamountt = totalamount-(totalamount*discount);
    }
    if (member==0)
    {
        
       totalamount = (Sprice+Tprice);
       totalamountt = totalamount+discount;
    }
    return totalamountt;
}

public void setNumicecream(int num_of_icecream)
{
    this.num_of_icecream = num_of_icecream;
}

public Integer getNumicecream()
{
    return num_of_icecream;
}

public void setSType(int Stype)
{
    this.Stype = Stype;
}

public Integer getSType()
{
    return Stype;
}

public String getType()
{
    
    if (Stype==1)
        Type = "SINGLE";
    
    else if (Stype==2)
        Type = "DOUBLE";
    
    else if (Stype==3)
        Type = "TRIPLE";
    
    else
        Type = "SUNDAE";
    
    return Type;
}

public void setType(String Type)
{
    this.Type = Type;
}

public void setSPrice(double Sprice)
{
    this.Sprice = Sprice;
}

public double getSPrice()
{
    if (Stype==1)
    {
        Sprice = 5.00;
    }
    else if (Stype==2)
    {
        Sprice = 8.00;
    }
    else if (Stype==3)
    {
        Sprice = 10.00;
    }
    else
    {
        Sprice = 12.00;
    }
    return Sprice;
}

public void setpayment(double payment)
{
    this.payment = payment;
}

 protected double getpayment()
 {
    if (Stype==4)
        
       payment = 0.0;
    
    return payment;
}
}

