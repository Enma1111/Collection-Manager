package com.Bartalsky.Collection.Manager.ViewManager;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.w3c.dom.Document;

import java.io.IOException;
@Controller
public class ViewController {

    @GetMapping("/start")
    public void start() {
//        comicTableConfigurator.comicViewInitialize(tblComic,txtSearch);
//        tableIInitiator.initialize(tblComic,table, dataReadWrite.dataRead(sqlWriteQuery.readQuery(table)));
//
//        txtSearch.textProperty().addListener((observable, oldValue, newValue) -> {
//            if(!newValue.isEmpty()) {
//                logger.info(oldValue);
//                query = sqlWriteQuery.searchQuery(newValue);
//                search.performSearch(query,tblComic);
//                logger.info(newValue);
//            }
//        });
    }

    @GetMapping("/save")
    public void save() {
//        comicTableConfigurator.comicSafe(txtComicName,txtNumber,txtPackaging,txtBox,txtPublisher,tblComic);
//        String[] val = new String[5];
//        val[0] = txtComicName.getText();
//        val[1] = txtNumber.getText();
//        val[2] = txtPackaging.getText();
//        val[3] = txtBox.getText();
//        val[4] = txtPublisher.getText();
//
//        valueNullCheckHelper.comicValueChecker(val);
//        dataReadWrite.dataWrite(sqlWriteQuery.saveQuery(insertComicColumns), val);
//
//        query = sqlWriteQuery.readQuery(table);
//        Document doc = dataReadWrite.dataRead(query);
//        tableIInitiator.initialize(tblComic,table, doc);
    }

    @DeleteMapping("/delete")
    public void delete() {
//        comicTableConfigurator.comicDelete(txtDeleteID,ckBxSureDelete,tblComic);
//        String id = txtDeleteID.getText();
//        if (ckBxSureDelete.isSelected()){
//            dataReadWrite.dataDelete(sqlWriteQuery.deleteQuery(),id);
//            tableIInitiator.initialize(tblComic,table, dataReadWrite.dataRead(sqlWriteQuery.readQuery(table)));
//            ckBxSureDelete.setSelected(false);
//        }else{
//            warningHelper.deleteWarning();
//        }

    }

    @GetMapping("/search")
    public void search(@RequestParam("query") String query) {
//        if (btnSearch)
//        logger.info(oldValue);
//        query = sqlWriteQuery.searchQuery(newValue);
//        search.performSearch(query,tblComic);
//        logger.info(newValue);
    }

    @GetMapping("/back")
    public void back() throws IOException {
//        comicTableConfigurator.backToOptions(btnBackToOptions);
//        Stage stage = (Stage) btnBackToOptions.getScene().getWindow();
//        try {
//            newScene.newScene(optionFXML, stage, 200, 200, optionViewName);
//        } catch (IOException e) {
//            throw new IOException(e);
//        }
    }


    public void backToMainTable() {
//        comicTableConfigurator.backToMainTable(tblComic);
//        tableIInitiator.initialize(tblComic,table, dataReadWrite.dataRead(sqlWriteQuery.readQuery(table)));
    }
}
