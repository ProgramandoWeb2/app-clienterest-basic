package pe.edu.cibertec.app_clienterest_basic.client.placeholder.iclientservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pe.edu.cibertec.app_clienterest_basic.client.placeholder.model.User;

@FeignClient(name = "userClient",
        url = "https://jsonplaceholder.typicode.com")
public interface UserClient {

    @GetMapping("/users/{id}")
    User obtenerUsuarioXid(@PathVariable("id") Long id);

    @PostMapping("/users")
    User crearUsuario(@RequestBody User usuario);

}
