package com.example.client;

import com.example.client.Entity.BookEntity;
import com.example.client.controller.ApplicationController;
import com.example.client.controller.EditBookController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class ApplicationStart extends Application {
    public static void main(String[] args) {launch();}
    @Override
    public void start(Stage stage) throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(ApplicationStart.class.getResource("editBook.fxml"));
        AnchorPane mainApp =(AnchorPane) loader.load();
        Scene scene = new Scene(mainApp,800,600);
        stage.setScene(scene);

        stage.show();
    }
 /*   public static boolean showPersonEditDialog(BookEntity bookObj, int id){

        try{
            //
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(ApplicationController.class.getResource("main.fxml"));
            AnchorPane page =(AnchorPane) loader.load();
            //
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Редактирование книги");
            dialogStage.initModality(Modality.APPLICATION_MODAL);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);
            //
            EditBookController controller = loader.getController();
            controller.setDialogStage(DialogStage);
            controller.setLabels(bookObj,id);
            //
            dialogStage.showAndWait();
            return controller.isOkClicked();
        }catch (IOException e){
            e.printStackTrace();
            return false;
        }
    }*/

}