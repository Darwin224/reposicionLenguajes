package hn.unah.reposicion.reposicion.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.reposicion.reposicion.modelos.Equipos;

public interface EquipoRepository extends JpaRepository<Equipos,Integer>{
    
}
