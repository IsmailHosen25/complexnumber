package com.example.complexnumber;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ComplexViewControler {

    @FXML private TextField firstimgcom;

    @FXML private TextField firstrealcomp;

    @FXML private TextField secimgcom;

    @FXML private TextField secrealcom;

    @FXML private Label showresult;

    ComplexNo c1,c2,c3;

    @FXML
    void addcomplex(ActionEvent event) {
     c1=new ComplexNo(Integer.parseInt(firstrealcomp.getText()),Integer.parseInt(firstimgcom.getText()));
     c2=new ComplexNo(Integer.parseInt(secrealcom.getText()), Integer.parseInt(secimgcom.getText()));
     c3=c1.add(c2);
     showresult.setText(c3.toString());

    }

    @FXML
    void subcomplex(ActionEvent event) {
        c3=c1.Sub(c2);
        showresult.setText(c3.toString());
    }

}
