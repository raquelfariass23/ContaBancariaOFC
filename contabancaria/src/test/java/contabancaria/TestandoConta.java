package contabancaria;

import org.junit.jupiter.api.Test;

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
    public void TesteDeposito() {

        assertEquals(conta.getSaldo() + 0,conta.deposito(0));
    }
}
