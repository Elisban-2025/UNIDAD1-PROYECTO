package upeu.edu.pe.servicios;

import upeu.edu.pe.modelo.Evento;

import java.util.List;

public interface EventoServicioI {
    void save(Evento evento);
    List<Evento> findAll();
    Evento update(Evento evento, int index);
    void delete(int index);
    Evento findById(int index);
}
