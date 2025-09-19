# UPEU - Gestión de Eventos (JavaFX + Spring Boot)

Proyecto listo para ejecutar en Windows con `mvn javafx:run`.

## Pasos rápidos
1. Tener JDK 17 y Maven instalados.
2. Desde la carpeta del proyecto (donde está pom.xml) ejecutar:
   ```
   mvn clean javafx:run
   ```

Si ejecutas desde IDE (IntelliJ):
- Importa como proyecto Maven.
- Ejecuta la clase `upeu.edu.pe.MainApp`.

Problemas comunes:
- Si JavaFX falla, revisa que la propiedad `<javafx.platform>` en `pom.xml` sea `win`.
- Si el TableView aparece vacío, verifica que el controlador se haya creado por Spring (no por FXMLLoader directamente). Esto está solucionado mediante `fxmlLoader.setControllerFactory(springContext::getBean)` en `MainApp`.
