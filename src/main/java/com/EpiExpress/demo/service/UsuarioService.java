package com.EpiExpress.demo.service;

import com.EpiExpress.demo.model.Usuario;
import java.util.List;
import java.util.Optional;
public interface UsuarioService {
    
    public Usuario salvaUsuario(Usuario usuario);
    
    public List<Usuario> listaUsuario();
    
    public Optional<Usuario> getByIdUsuario(Integer codUsuario);
    
    public Usuario atualizaUsuario(Usuario usuario);
    
    public void deleteByIdUsuario(Integer codUsuario);
}
