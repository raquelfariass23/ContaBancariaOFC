package contabancaria;

public  class Conta {
   double saldo = 40;

 public double deposito(double money){
      return GetSaldo();

   }


   private double GetSaldo(){
      return this.saldo;
   }

   private void SetSaldo(double valor){
         this.saldo=valor;
   }
}
