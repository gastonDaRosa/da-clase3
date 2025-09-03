package com.example.controlaccesos.controlador;


import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.controlaccesos.modelo.Usuario;
import com.example.controlaccesos.servicios.ServiciosUsuario;

@RestController
public class ControladorAccesos {

    ServiciosUsuario serviciosUsuario = ServiciosUsuario.getInstancia();
    
    @GetMapping("/todos")
    public List<Usuario> todosLosUsuarios() {
        return serviciosUsuario.getUsuarios();
    }

    @GetMapping("/lista")
    public List<Usuario> usuariosHabilitadosConAccesoMayorA(@RequestParam int minutos) {
        return null; // Implementación pendiente
    }

}
