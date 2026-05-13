public class Pizza1
{
    private int price;
    private boolean veg;
    private int extrachees=100;
   private int  extratooping=150;
   private int backpack=20;
   private int Basepizza ;
  private boolean isextrachess=false;
  private boolean isextratooping=false;
  private boolean isopted=false;

    public Pizza1(boolean veg)
    {
        this.veg = veg;
        if(this.veg)
        {
            this.price=300;
        }
        else
        {
            this.price=400;
        }
        Basepizza=this.price;

    }

    public void Addextrachees()
    {
        isextrachess=true;

        this.price+=extrachees;
    }
    public void Addextratooping()
    {
        isextratooping=true;

        this.price+=extratooping;
    }
    public void Addtakeway()
    {
        isopted=true;

        this.price+=backpack;
    }
    public void  getPizzaprice()
    {
        String Bill="";
        System.out.println("Price of pizza: "+Basepizza);

        if(isextrachess)
        {
            Bill+="Extra chees Added:"+extrachees+"\n";
        }
        if(isextratooping)
        {
            Bill+="Extra tooping Added: "+extratooping+"\n";
        }
        if(isopted)
        {
            Bill+="Isextrachess Added: "+backpack+"\n";
        }
        Bill+="Bill:"+this.price;
        System.out.println(Bill);
    }
}
