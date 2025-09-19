package upeu.edu.pe.repositorio;

import org.springframework.stereotype.Repository;
import upeu.edu.pe.enums.TipoEvento;
import upeu.edu.pe.modelo.Evento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class EventoRepository {
    private final List<Evento> eventos = new ArrayList<>();

    public List<Evento> findAll() {
        if (eventos.isEmpty()) {
            eventos.add(new Evento("1", "Seminario", TipoEvento.SEMINARIO, "2025-09-01", "Auditorio"));
            eventos.add(new Evento("2", "Campeonatos", TipoEvento.CAMPEONATO, "2025-09-10", "Cancha"));
            eventos.add(new Evento("2", "Feria Cientifica", TipoEvento.CAMPEONATO, "2025-09-10", "UpeU"));
            eventos.add(new Evento("2", "Aniversario de la universidad", TipoEvento.CAMPEONATO, "2025-09-10", "UpeU"));
            eventos.add(new Evento("2", "Asistencia a Clases", TipoEvento.CAMPEONATO, "2025-09-10", "UpeU"));
            eventos.add(new Evento("2", "Campamento", TipoEvento.CAMPEONATO, "2025-09-10", "Cusco"));

        }
        return Collections.unmodifiableList(eventos);
    }

    public void save(Evento evento) {
        eventos.add(evento);
    }

    public Evento update(Evento evento, int index) {
        return eventos.set(index, evento);
    }

    public void delete(int index) {
        eventos.remove(index);
    }

    public Evento findById(int index) {
        return eventos.get(index);
    }
}
