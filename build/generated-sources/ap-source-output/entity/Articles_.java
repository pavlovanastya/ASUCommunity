package entity;

import entity.Categories;
import entity.Messages;
import entity.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-06-01T20:18:41")
@StaticMetamodel(Articles.class)
public class Articles_ { 

    public static volatile SingularAttribute<Articles, Integer> id;
    public static volatile SingularAttribute<Articles, String> title;
    public static volatile SingularAttribute<Articles, String> text;
    public static volatile ListAttribute<Articles, Messages> messagesList;
    public static volatile ListAttribute<Articles, Categories> categoriesList;
    public static volatile SingularAttribute<Articles, Date> date;
    public static volatile SingularAttribute<Articles, Users> userLogin;
    public static volatile SingularAttribute<Articles, String> section;

}