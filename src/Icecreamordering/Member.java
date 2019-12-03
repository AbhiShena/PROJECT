package Icecreamordering;

public class Member
{
   
protected double discount;
protected int member;
protected double price;
protected String xmember;
protected int num_of_icecream;
protected int Stype;
protected String Type;
protected double Sprice;
protected double payment;
protected double totalamount;
protected char Ttype;
protected double Tprice;
        
public Member()
{

}
        
public void setxmember(String xmember)
{
    this.xmember = xmember;
}

public void setmember(int member)
{
    this.member = member;
}

public int getMember()
{
    return member;
}

public void setdiscount(double discount)
{
    this.discount = discount;
}

public String getxmember()
{
    if (member == 1) 
    {
        
       xmember = "Member";
    }
    
   if (member==0)
    {
            xmember = "Non-member";
    }

return xmember;

}

protected double getpayment()
{
    if (member==1)
    {
        discount = 0.9;
    }
    
    else
    {
        discount = 1;
    }
    
    return discount;
}

}

