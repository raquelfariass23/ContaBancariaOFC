package contabancaria;

public class Conta {
   double saldo = 40; 
   
   public double deposito(double money){
      setSaldo(getSaldo() + money);
      return getSaldo();

   }

    public double getSaldo(){
      return this.saldo;
     }


    void setSaldo(double money){
         this.saldo = money;
   }
}
