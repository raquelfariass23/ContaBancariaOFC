package contabancaria;

import org.junit.jupiter.api.Test;

import contabancaria.Conta.OperacaoInvalida;
import contabancaria.Conta.SaldoInsuficiente;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

/**
 * Unit test for simple App.
 */
class TestandoConta {
 
    Conta conta;
    @BeforeEach
    public void setUp() {
        conta = new Conta();
    }
   
    @Test
    public void TesteDeposito() throws OperacaoInvalida {

        assertEquals(conta.getSaldo() + 40,conta.deposito(40));
    }
    @Test
    public void TesteSaque() throws SaldoInsuficiente{
        assertEquals(conta.getSaldo() - (1220),conta.saque(1220) );
    }
}
