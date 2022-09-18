package com.EpiExpress.demo.repository;

import com.EpiExpress.demo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    
}
