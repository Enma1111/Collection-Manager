package com.Bartalsky.Collection.Manager.MainController;



import com.Bartalsky.Collection.Manager.SQLService.SQLQueryWriter;
import com.Bartalsky.Collection.Manager.tables.ComicTable;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.SelectConditionStep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.jooq.Record;
import org.w3c.dom.Document;

import java.io.IOException;
@Component
public class ViewController {

//    private final DatabaseConnection databaseConnection;

//    @Autowired
//    public ViewController(DatabaseConnection databaseConnection) {
//        this.databaseConnection = databaseConnection;
//    }
//
//    public String load(String tableName) throws JsonProcessingException {
//        return databaseConnection.dataRead(tableName);
//    }
    private final DSLContext dslContext;

    @Autowired
    public ViewController(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    @GetMapping("/comics")
    public String getComics(Model model) {

        Result<Record> comics = dslContext.select().from(ComicTable.COMIC_TABLE).fetch();

        model.addAttribute("comics", comics);

        return "Comic";
    }


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
