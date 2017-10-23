/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cek.sehat;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Naya
 */
public class UtamaController implements Initializable {

    @FXML
    private RadioButton L;
    @FXML
    private RadioButton P;
    @FXML
    private JFXTextField beratbadan;
    @FXML
    private JFXTextField tinggi;
    @FXML
    private JFXTextField nama;
    @FXML
    private JFXButton prosess;
    @FXML
    private JFXButton resett;
    @FXML
    private TextField ideal;
    @FXML
    private TextField analisa;
    @FXML
    private TextField saran;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    
    private void proses(ActionEvent event) {
        
        int Beratbadan,Ideal,Tinggi;
        String Nama,Jeniskelamin,Analisa,Saran;
        
        Nama = nama.getText();
        Analisa = analisa.getText();
        Saran = saran.getText();
        Beratbadan =Integer.parseInt(beratbadan.getText());
        Tinggi =Integer.parseInt(tinggi.getText());    
        
        if (L.isSelected()){
           Ideal = Tinggi-105;
           ideal.setText(""+Ideal);
            if(Beratbadan<Ideal){
                analisa.setText("Nama : "+Nama+", Anda Underweight");
                saran.setText("Tambah porsi makan anda -,-");
            }
            else if(Beratbadan==Ideal){
                analisa.setText("Nama : "+Nama+", Anda Ideal");
                saran.setText("Jaga Pola Makan Anda :)");
            }
            else{
                analisa.setText("Nama : "+Nama+", Anda Overweight");
                saran.setText("Kurangi porsi makan anda :(");
            }
            
        }
        else if (P.isSelected()){
           Ideal=Tinggi-110;
           ideal.setText(""+Ideal);
           if(Beratbadan<Ideal){
                analisa.setText("Nama : "+Nama+", Anda Underweight");
                saran.setText("Tambah porsi makan anda -,-");
            }
            else if(Beratbadan==Ideal){
                analisa.setText("Nama : "+Nama+", Anda Ideal");
                saran.setText("Jaga Pola Makan Anda :)");
            }
            else{
                analisa.setText("Nama : "+ Nama+ ", Anda Overweight");
                saran.setText("Kurangi porsi makan anda :(");
            }
        }
        else{
            analisa.setText("Mohon Pilih Jenis Kelamin Anda");
        }
    }

    @FXML
    private void reset(ActionEvent event) {
        nama.setText("");
        tinggi.setText("");
        beratbadan.setText("");
        ideal.setText("");
        analisa.setText("");
        saran.setText("");
        L.setSelected(false);
        P.setSelected(false);
    }
    
}
