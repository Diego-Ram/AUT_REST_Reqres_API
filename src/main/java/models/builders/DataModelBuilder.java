package models.builders;

import javafx.util.Builder;
import models.Data;


public class DataModelBuilder implements Builder<Data> {

    private String idBuild;
    private String emailBuild;
    private String firstNameBuild;
    private String lastNameBuild;

    public DataModelBuilder (){}

     public DataModelBuilder arrayData() {
        this.idBuild = "15212";
        this.emailBuild = "email";
        this.firstNameBuild = "first_name";
        this.lastNameBuild = "last_name";
        return this;
    }

    public String getIdBuild() {
        return idBuild;
    }

    public String getEmailBuild() {
        return emailBuild;
    }

    public String getFirstNameBuild() {
        return firstNameBuild;
    }

    public String getLastNameBuild() {
        return lastNameBuild;
    }

    public void setIdBuild(String idBuild) {
        this.idBuild = idBuild;
    }

    public void setEmailBuild(String emailBuild) {
        this.emailBuild = emailBuild;
    }

    public void setFirstNameBuild(String firstNameBuild) {
        this.firstNameBuild = firstNameBuild;
    }

    public void setLastNameBuild(String lastNameBuild) {
        this.lastNameBuild = lastNameBuild;
    }

    public DataModelBuilder id(String idBuild){
        this.idBuild = idBuild;
        return this;
    }

    public DataModelBuilder job(String emailBuild){
        this.emailBuild = emailBuild;
        return this;
    }

    public DataModelBuilder first(String firstNameBuild){
        this.firstNameBuild = firstNameBuild;
        return this;
    }

    public DataModelBuilder last(String lastNameBuild){
        this.lastNameBuild = lastNameBuild;
        return this;
    }

    public static DataModelBuilder arrayUser() {
        return new DataModelBuilder();
    }

    @Override
    public Data build() {
        return new Data(this);
    }

    public static void main(String args) {

        DataModelBuilder builder = new DataModelBuilder();
        Data[] myObjects = new Data[3];

        for (int i = 0; i < myObjects.length; i++) {
            myObjects[i] = builder.arrayData().build();
        }

    }

}
