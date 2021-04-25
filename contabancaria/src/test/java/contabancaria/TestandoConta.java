package contabancaria;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class TestandoConta {
    /**
     * Rigorous Test.
     */
    ContaB conta;
    @Test
    void TesteDeposito() {
        assertEquals(50,conta.deposito(50));
    }
}
