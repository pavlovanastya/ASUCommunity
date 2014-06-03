package entity;

import entity.Articles;
import entity.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-06-01T20:18:41")
@StaticMetamodel(Messages.class)
public class Messages_ { 

    public static volatile SingularAttribute<Messages, Integer> id;
    public static volatile SingularAttribute<Messages, String> text;
    public static volatile SingularAttribute<Messages, Articles> articlesId;
    public static volatile SingularAttribute<Messages, Date> date;
    public static volatile SingularAttribute<Messages, Users> userLogin;

}