package br.com.buscadordecep;

import br.com.buscadordecep.model.Endereco;
import br.com.buscadordecep.service.ServicoDeCep;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Informe seu CEP: ");
        String cep = new Scanner(System.in).nextLine();
        Endereco endereco = ServicoDeCep.buscarEndereco(cep);

        System.out.println("Logradouro: " +endereco.getLogradouro());
        System.out.println("Bairro: " +endereco.getBairro());
        System.out.println("Localidade: " +endereco.getLocalidade());
        System.out.println("UF: " +endereco.getUf());
    }
}
