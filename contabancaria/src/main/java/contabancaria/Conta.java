package contabancaria;

public class Conta {
   double saldo = 40; 
   
   public void deposito(double money){

      if(money==0 || money<0 ){
         setSaldo(getSaldo() + money);
       getSaldo();
      }
      
   }

    public double getSaldo(){
      return this.saldo;
     }


    void setSaldo(double money){
         this.saldo = money;
   }
}
