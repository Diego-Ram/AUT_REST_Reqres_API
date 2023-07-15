package models;

import models.builders.DataModelBuilder;
import models.builders.UserModelBuilder;

public class Data {

    private String id;
    private String email;
    private String firstName;
    private String lastName;

    public Data(DataModelBuilder builder){
        this.id = builder.getIdBuild();
        this.email = builder.getEmailBuild();
        this.firstName = builder.getFirstNameBuild();
        this.lastName = builder.getLastNameBuild();

    }


    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFirst_name() {
        return firstName;
    }

    public String getLast_name() {
        return lastName;
    }




}
