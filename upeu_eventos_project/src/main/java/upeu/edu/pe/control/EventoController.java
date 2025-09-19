package upeu.edu.pe.control;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.springframework.stereotype.Component;
import upeu.edu.pe.modelo.Evento;
import upeu.edu.pe.servicios.EventoServicioI;

@Component
public class EventoController {

    @FXML private TableView<Evento> tableEventos;
    @FXML private TableColumn<Evento, String> idCol;
    @FXML private TableColumn<Evento, String> nombreCol;
    @FXML private TableColumn<Evento, String> fechaCol;
    @FXML private TableColumn<Evento, String> lugarCol;

    private final EventoServicioI eventoServicio;

    private ObservableList<Evento> eventos = FXCollections.observableArrayList();

    // Constructor injection (Spring)
    public EventoController(EventoServicioI eventoServicio) {
        this.eventoServicio = eventoServicio;
    }

    @FXML
    public void initialize() {
        idCol.setCellValueFactory(new PropertyValueFactory<>("idEvento"));
        nombreCol.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        fechaCol.setCellValueFactory(new PropertyValueFactory<>("fecha"));
        lugarCol.setCellValueFactory(new PropertyValueFactory<>("lugar"));

        eventos.setAll(eventoServicio.findAll());
        tableEventos.setItems(eventos);
    }
}
