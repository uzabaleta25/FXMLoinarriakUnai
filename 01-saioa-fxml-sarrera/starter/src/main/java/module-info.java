module eus.liburutegia {
    requires javafx.controls;
    requires javafx.fxml;

    exports eus.liburutegia;

    // TODO (3. urratsa): controller paketea sortu ondoren, kendu iruzkina.
    // FXMLLoaderrek isla (reflection) bidez sartu behar du @FXML eremu pribatuetara.
    opens eus.liburutegia.controller to javafx.fxml;
}
