package br.com.alura.loja.descontos;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto{

    protected SemDesconto() {
        super(null);
    }

    public BigDecimal calcular(Orcamento orcamento){

        return BigDecimal.ZERO;
    }

}
