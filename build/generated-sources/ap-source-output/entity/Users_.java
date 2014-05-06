package entity;

import entity.Articles;
import entity.Messages;
import entity.Projects;
import entity.Roles;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-05-06T22:20:37")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, Integer> id;
    public static volatile ListAttribute<Users, Messages> messagesList;
    public static volatile SingularAttribute<Users, String> eMail;
    public static volatile SingularAttribute<Users, String> lastname;
    public static volatile SingularAttribute<Users, String> login;
    public static volatile SingularAttribute<Users, String> firstname;
    public static volatile ListAttribute<Users, Projects> projectsList;
    public static volatile SingularAttribute<Users, String> password;
    public static volatile ListAttribute<Users, Articles> articlesList;
    public static volatile SingularAttribute<Users, Roles> roleId;

}