package Test.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.*;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

    @Entity
    @Table(name = "User")
    @Builder
    @Setter
    @Getter
    @ToString
    public class User extends BaseModel {


        private String name;
        private String email;

    }



