package com.senai.apivsconnect.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;


public record UsuarioDto(
        @NotBlank String nome,
        @NotBlank @Email(message = "o email deve estar no formato valodo")String email,
        @NotBlank String senha,
        String endereco,
        String cep,
        String topo_usuario,
        MultipartFile imagem

) {

}
