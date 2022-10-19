package com.EpiExpress.demo.service;

import com.EpiExpress.demo.model.Usuario;
import com.EpiExpress.demo.repository.UsuarioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService{
    
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Override
    public Usuario salvaUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    
    @Override
    public List<Usuario> listaUsuario() {
        return usuarioRepository.findAll();
    } 
    
    @Override
    public Optional<Usuario> getByIdUsuario(Integer codUsuario) {
        return usuarioRepository.findById(codUsuario);
    }

    @Override
    public Usuario atualizaUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public void deleteByIdUsuario(Integer codUsuario) {
        usuarioRepository.deleteById(codUsuario);
    }
    
}
