package upeu.edu.pe.modelo;

import javafx.beans.property.*;
import upeu.edu.pe.enums.TipoEvento;

public class Evento {
    private final StringProperty idEvento = new SimpleStringProperty(this, "idEvento", "");
    private final StringProperty nombre = new SimpleStringProperty(this, "nombre", "");
    private final ObjectProperty<TipoEvento> tipoEvento = new SimpleObjectProperty<>(this, "tipoEvento");
    private final StringProperty fecha = new SimpleStringProperty(this, "fecha", "");
    private final StringProperty lugar = new SimpleStringProperty(this, "lugar", "");
    private final BooleanProperty activo = new SimpleBooleanProperty(this, "activo", true);

    public Evento() { }

    public Evento(String id, String nombre, TipoEvento tipo, String fecha, String lugar) {
        this.idEvento.set(id);
        this.nombre.set(nombre);
        this.tipoEvento.set(tipo);
        this.fecha.set(fecha);
        this.lugar.set(lugar);
        this.activo.set(true);
    }

    // Property getters
    public StringProperty idEventoProperty() { return idEvento; }
    public StringProperty nombreProperty() { return nombre; }
    public ObjectProperty<TipoEvento> tipoEventoProperty() { return tipoEvento; }
    public StringProperty fechaProperty() { return fecha; }
    public StringProperty lugarProperty() { return lugar; }
    public BooleanProperty activoProperty() { return activo; }

    // Standard getters (used by PropertyValueFactory)
    public String getIdEvento() { return idEvento.get(); }
    public String getNombre() { return nombre.get(); }
    public TipoEvento getTipoEvento() { return tipoEvento.get(); }
    public String getFecha() { return fecha.get(); }
    public String getLugar() { return lugar.get(); }
    public boolean isActivo() { return activo.get(); }

    // Setters
    public void setIdEvento(String id) { this.idEvento.set(id); }
    public void setNombre(String nombre) { this.nombre.set(nombre); }
    public void setTipoEvento(TipoEvento tipo) { this.tipoEvento.set(tipo); }
    public void setFecha(String fecha) { this.fecha.set(fecha); }
    public void setLugar(String lugar) { this.lugar.set(lugar); }
    public void setActivo(boolean activo) { this.activo.set(activo); }
}
