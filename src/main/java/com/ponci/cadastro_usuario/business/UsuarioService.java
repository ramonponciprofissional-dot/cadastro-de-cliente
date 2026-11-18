package com.ponci.cadastro_usuario.business;

import org.springframework.stereotype.Service;

import com.ponci.cadastro_usuario.infrastructure.entitys.Usuario;
import com.ponci.cadastro_usuario.infrastructure.repository.UsuarioRepository;

@Service

public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public void salvarUsuario(Usuario usuario) {
        repository.saveAndFlush(usuario);

    }

    public Usuario buscarUsuarioPorEmail(String email) {

        return repository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Email não encontrado: " + email));

    }

    public void deletarUsuarioPorEmail(String email) {
        repository.deleteByEmail(email);

    }

    public void atualizarUsuarioPorId(Integer id, Usuario usuario) {
        Usuario usuarioEntity = repository.findById(id).orElseThrow(
                () -> new RuntimeException("Id não encontrado: " + id));
        Usuario usuarioAtualizado = Usuario.builder()
                .email(usuario.getEmail() != null ? usuario.getEmail() : usuarioEntity.getEmail())
                .nome(usuario.getNome() != null ? usuario.getNome() : usuarioEntity.getNome())
                .id(usuarioEntity.getId())
                .build();

        repository.saveAndFlush(usuarioAtualizado);

    }

}