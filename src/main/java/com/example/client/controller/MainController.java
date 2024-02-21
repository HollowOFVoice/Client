package com.example.client.controller;

import com.example.client.Entity.BookEntity;
import com.example.client.utils.HTTPUtils;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class MainController {
//    @FXML
//    void addBook(ActionEvent event) throws IOException {
//        //  Application.showPersonEditDialog();
//    }

    public static ObservableList<BookEntity> booksData = FXCollections.observableArrayList();
    HTTPUtils http = new HTTPUtils();


    @FXML
    public TableView<BookEntity> tableBooks;
    @FXML
    private TableColumn<BookEntity,String> bookAuthor;
    @FXML
    private TableColumn<BookEntity,String> bookPublisher;
    @FXML
    private TableColumn<BookEntity,String> bookYear;
    @FXML
    private TableColumn<BookEntity,String> BookChapter;

//    @FXML
//    private void  initialize() throws Exception{
//        System.out.println(http.get("http://localhost:2825/api/v1/all",""));
//    }
    }

