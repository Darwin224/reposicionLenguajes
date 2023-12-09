package hn.unah.reposicion.reposicion.controladores;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.reposicion.reposicion.modelos.Equipos;
import hn.unah.reposicion.reposicion.servicios.impl.EquiposServiceImpl;

@RestController
@RequestMapping("api/Equipos")
public class EquipoController {
    
        @Autowired
        private EquiposServiceImpl equiposServiceImpl;

        @PostMapping("/crear")
        public Equipos crearEquipo (@RequestBody Equipos nuevoEquipo){

            return this.equiposServiceImpl.crearEquipo(nuevoEquipo);
        }

        @DeleteMapping("/eliminar/{codigoEquipo}")
        public Boolean eliminarCliente(@PathVariable(name="codigoEquipo") int codigoEquipo){
            return this.equiposServiceImpl.eliminarEquipos(codigoEquipo);
        }

        @GetMapping("/buscar/{codigo}")
        public Equipos buscarEquipos(@PathVariable(name = "codigo") int codigo){

            return this.equiposServiceImpl.buscarEquipos(codigo);
        }
    
}
