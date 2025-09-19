package upeu.edu.pe.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upeu.edu.pe.modelo.Evento;
import upeu.edu.pe.repositorio.EventoRepository;

import java.util.List;

@Service
public class EventoServicioImp implements EventoServicioI {

    private final EventoRepository repo;

    @Autowired
    public EventoServicioImp(EventoRepository repo) {
        this.repo = repo;
    }

    @Override
    public void save(Evento evento) {
        repo.save(evento);
    }

    @Override
    public List<Evento> findAll() {
        return repo.findAll();
    }

    @Override
    public Evento update(Evento evento, int index) {
        return repo.update(evento, index);
    }

    @Override
    public void delete(int index) {
        repo.delete(index);
    }

    @Override
    public Evento findById(int index) {
        return repo.findById(index);
    }
}
