package contabancaria;

public class Conta {
   double saldo = 40.0; 
   
   public class OperacaoInvalida extends Exception{
      private static final long serialVersionUID=1L;
    }

   public double deposito(double money) throws OperacaoInvalida{

      if(money==0 || money<0 ){
      throw new OperacaoInvalida();
      }
            setSaldo(getSaldo() + money);
             return getSaldo();
   }

   public double getSaldo(){
      return this.saldo;
   }

   public void setSaldo(double money){
         this.saldo = money;
   }

}
