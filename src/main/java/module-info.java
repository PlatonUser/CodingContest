module coding.contest.codingcont {
    requires javafx.controls;
    requires javafx.fxml;


    opens coding.contest.codingcont to javafx.fxml;
    exports coding.contest.codingcont;
}