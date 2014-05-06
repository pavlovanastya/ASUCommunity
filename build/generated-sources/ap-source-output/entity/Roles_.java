package entity;

import entity.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-05-06T22:20:37")
@StaticMetamodel(Roles.class)
public class Roles_ { 

    public static volatile SingularAttribute<Roles, Integer> id;
    public static volatile SingularAttribute<Roles, String> name;
    public static volatile ListAttribute<Roles, Users> usersList;

}