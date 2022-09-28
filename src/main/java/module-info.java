module minhan.cc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens minhan.cc to javafx.fxml;
    exports minhan.cc;
}