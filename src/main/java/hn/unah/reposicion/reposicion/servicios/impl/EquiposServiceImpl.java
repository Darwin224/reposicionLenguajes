package hn.unah.reposicion.reposicion.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.reposicion.reposicion.modelos.Equipos;
import hn.unah.reposicion.reposicion.repositorios.EquipoRepository;
import hn.unah.reposicion.reposicion.repositorios.PosicionesRepository;
import hn.unah.reposicion.reposicion.servicios.EquiposService;

@Service
public class EquiposServiceImpl implements EquiposService {

    @Autowired
    private EquipoRepository equipoRepository;


    @Autowired
private PosicionesRepository posicionesRepository;

    @Override
    public Equipos crearEquipo(Equipos equipo) {
       return this.equipoRepository.save(equipo);
    }

    @Override
    public boolean eliminarEquipos(int codigoEquipo) {
        
        if(!this.posicionesRepository.existsById(codigoEquipo)){
            this.equipoRepository.deleteById(codigoEquipo);
            return true;
        }
        return false;
    
    }

    @Override
    public Equipos buscarEquipos(int codigoEquipo) {
        Equipos equipoEncontrado= this.equipoRepository.findById(codigoEquipo).get(); 
        return equipoEncontrado;
    }

    @Override
    public Equipos simularPartido() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'simularPartido'");
    }
    

}
