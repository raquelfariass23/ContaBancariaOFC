package contabancaria;

public class Conta {
   double saldo = 10.0; 
   
   //operação de depósito na conta bancária
   public class OperacaoInvalida extends Exception{
      private static final long serialVersionUID=1L;
    }

   public double deposito(double money) throws OperacaoInvalida{
      //condicional que evita depósitos nulos ou negativos
      if(money==0 || money<0 ){
      throw new OperacaoInvalida();
      }
            setSaldo(getSaldo() + money);
             return getSaldo();
   }

   //operação de saque na conta bancária
   public class SaldoInsuficiente extends Exception{
      private static final long serialVersionUID=1L;
    }
   public double saque(double money) throws SaldoInsuficiente {
      //condicional que impede que o valor sacado seja maior do que o saldo da conta
      if(getSaldo()<money){
         throw new SaldoInsuficiente();
      }

      else{
         setSaldo(getSaldo() - money);
      }

      return getSaldo();

   }


   //GET & SETTER DE SALDO
   public double getSaldo(){
      return this.saldo;
   }

   public void setSaldo(double money){
         this.saldo = money;
   }

}
