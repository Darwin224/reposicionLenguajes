package hn.unah.reposicion.reposicion.servicios;

import hn.unah.reposicion.reposicion.modelos.Equipos;

public interface EquiposService {
    
    public Equipos crearEquipo(Equipos equipo);

    public boolean eliminarEquipos(int codigoEquipo);

    public Equipos buscarEquipos(int codigoEquipo);

    public Equipos simularPartido();

}
