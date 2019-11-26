
class CurrentAccount(var accno: Int,var name: String,var balance: Double,var minbal: Int ) 
{
        
        def viewbalance()
        {
            println("CURRENT BALANCE:"+balance);
        }
        def withdraw()
        {
            println("HOW MUCH AMOUNT YOU WANT TO WITHDRAW");
            var rmv : Int = Console.readInt;
            if(rmv > balance)
            {
                println("AMOUNT IS MORE THAN YOUR BALANCE.\n PLS ENTER VALID AMOUNT");
            }
            else
            {
            balance = balance-rmv;
            println("AMOUNT WITHDRAWED :" +rmv);
            println("REMAINING BALANCE: "+balance);
            } 
        }
        def deposit()
        {
            println("ENTER AMOUNT TO BE DEPOSITED");
            var amt : Int = Console.readInt;
            balance = balance+amt;
            println("AMOUNT DEPOSITED :" +amt);
            println("CURRENT BALANCE: "+balance); 
        }
}

object slip17
{
            def main(args: Array[String])
            {   
                var ch: Int = 0;
                println("enter your bank Details");
                println("ENTER ACCOUNT NO:")
                val acc: Int= Console.readInt;
                println("ENTER ACCOUNT HOLDER NAME:")
                var name: String= Console.readLine;
                println("ENTER CURRENT BALANCE");
                var bal: Double = Console.readDouble;
                var min: Int = 2000; 
                var obj= new CurrentAccount(acc,name,bal,min);
                do
                {
                    print("1.VIEW BALANCE \n 2.WITHDRAW \n 3.DEPOSIT \n 4.EXIT\n");
                    println("enter your choice");
                    ch= Console.readInt;
                    ch match{
                        case 1=> obj.viewbalance();
                        case 2=> obj.withdraw();
                        case 3=> obj.deposit();
                        case 4=> "";
                    }
                }while(ch!=4)
                
            }

}

