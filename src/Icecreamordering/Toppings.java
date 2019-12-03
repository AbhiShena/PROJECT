package Icecreamordering;

public class Toppings extends Member{
    
    private char Ttype;
    private double Tprice;
    
public Toppings ()
{
    super();
    this.Ttype=Ttype;
    this.Tprice=Tprice;
}

public void setTtype(char Ttype)
{
   this.Ttype = Ttype;
}

public char getTtype()
{
    return Ttype;
}

public void setTprice(double Tprice)
{
    this. Tprice = Tprice;
}

public double getTprice ()
{
    if (Ttype == 'L')
    {
        Tprice = 2.00;
    }
    else if (Ttype == 'H')
    {
       Tprice = 3.50;
    }
    else
    {
        Tprice = 0.00;
    }
    return Tprice;
}
}

