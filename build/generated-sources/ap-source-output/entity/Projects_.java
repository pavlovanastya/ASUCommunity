package entity;

import entity.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-06-01T20:18:41")
@StaticMetamodel(Projects.class)
public class Projects_ { 

    public static volatile SingularAttribute<Projects, Integer> id;
    public static volatile SingularAttribute<Projects, String> title;
    public static volatile SingularAttribute<Projects, String> description;
    public static volatile SingularAttribute<Projects, Integer> mark;
    public static volatile SingularAttribute<Projects, Users> userLogin;

}