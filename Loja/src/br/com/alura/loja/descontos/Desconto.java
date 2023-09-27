package br.com.alura.loja.descontos;

import java.math.BigDecimal;
import br.com.alura.loja.orcamento.Orcamento;

public abstract class Desconto {

    protected Desconto proximo;

    protected Desconto(Desconto proximo) {
        this.proximo = proximo;
    }
     public abstract BigDecimal calcular (Orcamento orcamento);

}
