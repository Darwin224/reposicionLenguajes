package hn.unah.reposicion.reposicion.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.reposicion.reposicion.modelos.Posiciones;
import hn.unah.reposicion.reposicion.servicios.impl.PosicionesServiceImpl;

@RestController
@RequestMapping("/api/posiciones")
public class PosicionController {
    
    @Autowired
    private PosicionesServiceImpl posicionesServiceImpl;

    @GetMapping("/obtenerPosicion")
    public List<Posiciones> obtenerTodos(){

        return this.posicionesServiceImpl.obtenerTablaPosiciones();
    }
}
