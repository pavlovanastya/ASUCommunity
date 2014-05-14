package entity;

import entity.Groupuser;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-05-15T00:02:56")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> login;
    public static volatile SingularAttribute<Users, String> password;
    public static volatile ListAttribute<Users, Groupuser> groupuserList;

}