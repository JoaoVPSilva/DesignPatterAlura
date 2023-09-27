package br.com.alura.loja.descontos;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new DescParaOrcMaisCincoItens(
                new DescParaOrcMaisQuinhentos(
                        new SemDesconto()
                )
        );

        return desconto.calcular(orcamento);
    }
}
