package br.edu.imepac.dtos;

import lombok.Data;

@Data
public class MedicoCreateRequest {
    private String nome;
    private String crm;
    private String senha;
}
