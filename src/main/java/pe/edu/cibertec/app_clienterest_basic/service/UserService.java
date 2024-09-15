package pe.edu.cibertec.app_clienterest_basic.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.app_clienterest_basic.client.placeholder.iclientservice.UserClient;
import pe.edu.cibertec.app_clienterest_basic.client.placeholder.model.User;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserClient userClient;

    public User obtenerUsuarioXId(Long id){
        return userClient.obtenerUsuarioXid(id);
    }

    public User crearUsuario(User usuario){
        return userClient.crearUsuario(usuario);
    }
}
