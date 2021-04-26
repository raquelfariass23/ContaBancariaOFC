package contabancaria;

public class Conta {
   double saldo = 40.0; 
   
  

   public double deposito(double money){

      if(money==0 || money<0 ){
      
        System.out.println("operacao invalida");
      }
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
