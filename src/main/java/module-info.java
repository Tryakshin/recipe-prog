module com.recipe.kosenok {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.recipe.kosenok to javafx.fxml;
    exports com.recipe.kosenok;
}