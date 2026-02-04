package br.com.cotiinformatica.api_clientes.dtos;

/*
    Registro para definir os ddos que a API irá
    receber para cadastrar ou atualizar um cliente
 */

public record ClienteRequest(
        String nome, //Nome do cliente
        String email, //Email do cliente
        String telefone //Telefone do cliente
) {
}
