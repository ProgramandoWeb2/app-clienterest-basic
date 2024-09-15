package pe.edu.cibertec.app_clienterest_basic.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.app_clienterest_basic.client.placeholder.model.User;
import pe.edu.cibertec.app_clienterest_basic.service.UserService;

@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserService userService;

    @GetMapping("/usuario/{id}")
    public User obtenerUsuarioXid(@PathVariable("id") Long id){
        return userService.obtenerUsuarioXId(id);
    }

    @PostMapping("/usuario")
    public User crearUsuario(@RequestBody User usuario){
        return userService.crearUsuario(usuario);
    }


}
