package hn.unah.reposicion.reposicion.servicios.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.reposicion.reposicion.modelos.Posiciones;
import hn.unah.reposicion.reposicion.repositorios.PosicionesRepository;
import hn.unah.reposicion.reposicion.servicios.PosicionesService;


@Service
public class PosicionesServiceImpl implements PosicionesService {

    @Autowired
    private PosicionesRepository posicionesRepository;

    @Override
    public java.util.List<Posiciones> obtenerTablaPosiciones() {
        return this.posicionesRepository.findAll();
    }
    
}
