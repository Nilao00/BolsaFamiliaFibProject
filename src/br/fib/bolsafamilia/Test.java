package br.fib.bolsafamilia;

import java.util.List;
import static java.util.stream.Collectors.toList;

import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        ReadCsv read = new ReadCsv();
        List<BolsaFamilia> dados = read.getData();

        Double maiorValorPago = dados.stream().mapToDouble(BolsaFamilia::getValor).max().getAsDouble();
        Double menorValorPago = dados.stream().mapToDouble(BolsaFamilia::getValor).min().getAsDouble();
        Double mediaValorPago = dados.stream().mapToDouble(BolsaFamilia::getValor).average().getAsDouble();
        List<BolsaFamilia> maioresSalarios = dados.stream()
                .sorted(Comparator.comparing(BolsaFamilia::getValor).reversed()).limit(5).collect(toList());

        System.out.println("Maior valor pago: " + maiorValorPago + '\n' + "Menor valor pago: " + menorValorPago + '\n'
                + "Média: " + mediaValorPago + '\n');

        System.out.println("Maiores salários: " + '\n');
        maioresSalarios.forEach(u -> System.out.println(u.getValor()));

        // dados.forEach(u -> System.out.println(u.getCpf() + " : " + u.getValor()));

    }
}
