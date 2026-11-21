package com.example.praktikum6;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MahasiswaController {
    @FXML
    private TableView<Mahasiswa> mhsTable;

    @FXML
    private TableColumn<Mahasiswa, String> nimColumn;

    @FXML
    private TableColumn<Mahasiswa, String> namaColumn;

    private ObservableList<Mahasiswa> dataMahasiswa =
            FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        nimColumn.setCellValueFactory(
                new PropertyValueFactory<>("nim")
        );

        namaColumn.setCellValueFactory(
                new PropertyValueFactory<>("nama")
        );

        dataMahasiswa.addAll(
                new Mahasiswa(101, "Huang Renjun", "1608257001"),
                new Mahasiswa(102, "Lee Je-no", "1608257002"),
                new Mahasiswa(103, "Lee Haechan", "1608257003"),
                new Mahasiswa(104, "Na Jaemin", "1608257004"),
                new Mahasiswa(105, "Zhong Chenle", "1608257005"),
                new Mahasiswa(106, "Park Jisung", "1608257006"),
                new Mahasiswa(107, "Yu Ji-min", "1608257007"),
                new Mahasiswa(108, "Uchinaga Aeri", "1608257008"),
                new Mahasiswa(109, "Kim Min-jeong", "1608257009"),
                new Mahasiswa(110, "Ning Yizhuo", "1608257010")
        );

        mhsTable.setItems(dataMahasiswa);
    }
}