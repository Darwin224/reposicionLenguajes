package hn.unah.reposicion.reposicion.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import hn.unah.reposicion.reposicion.modelos.Posiciones;

public interface PosicionesRepository extends JpaRepository<Posiciones, Integer>{
    
}
