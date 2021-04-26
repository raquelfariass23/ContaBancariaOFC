package contabancaria;

import javax.sound.sampled.SourceDataLine;

public class Conta {
   double saldo = 40.0; 
   
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

   public class SaldoInsuficiente extends Exception{
      private static final long serialVersionUID=1L;
    }
   public double saque(double money) throws SaldoInsuficiente {

      if(money>getSaldo() || money==0 ){
         System.out.println(" saldo insuficiente");
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
