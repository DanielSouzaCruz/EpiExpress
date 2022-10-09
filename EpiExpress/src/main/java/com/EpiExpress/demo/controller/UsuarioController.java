package com.EpiExpress.demo.controller;

import com.EpiExpress.demo.model.Usuario;
import com.EpiExpress.demo.service.UsuarioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Api("Api Usuarios")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;
    
    @GetMapping("/usuarios")
    @ApiOperation("Obter detalhes de um Usuario")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Usuario Encontrado"),
        @ApiResponse(code = 404, message = "Usuario não encontrado")
    })
    public ResponseEntity<List<Usuario>> listaUsuario(){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.listaUsuario());
    }
    
    @GetMapping("usuario/{codusuario}")
    @ApiOperation("Procurar um Usuario pelo Codigo")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Usuario Encontrado"),
        @ApiResponse(code = 404, message = "Usuario não encontrado")
    })
    public ResponseEntity<Optional<Usuario>> getByIdUsuario(@PathVariable Integer codusuario){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.getByIdUsuario(codusuario));
    }

    @PostMapping("usuario")
    @ApiOperation("Salvar um Usuario")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Usuario Salvo"),
        @ApiResponse(code = 404, message = "Usuario Não Salvo")
    })
    public ResponseEntity<Usuario> salvaUsuario(@RequestBody Usuario usuario){
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.salvaUsuario(usuario));
    }

    @PutMapping("usuario")
    @ApiOperation("Atualizar um Usuario")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Usuario Atualizado"),
        @ApiResponse(code = 404, message = "Usuario Não Atualizado")
    })
    public ResponseEntity<Usuario> atualizaUsuario(@RequestBody Usuario usuario){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.atualizaUsuario(usuario));
    }
    
    @DeleteMapping("usuario/{codusuario}")
    @ApiOperation("Deletar um Usuario pelo Codigo")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Usuario Deletado"),
        @ApiResponse(code = 404, message = "Usuario Não Deletado")
    })
    public ResponseEntity<String> deleteByIdUsuario(@PathVariable Integer codusuario){
        usuarioService.deleteByIdUsuario(codusuario);
        return ResponseEntity.status(HttpStatus.OK).body("Usuario removido com sucesso");
    }
}
