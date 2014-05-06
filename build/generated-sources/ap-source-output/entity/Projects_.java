package entity;

import entity.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-05-06T22:20:37")
@StaticMetamodel(Projects.class)
public class Projects_ { 

    public static volatile SingularAttribute<Projects, Integer> id;
    public static volatile SingularAttribute<Projects, String> title;
    public static volatile SingularAttribute<Projects, String> description;
    public static volatile SingularAttribute<Projects, Users> userId;
    public static volatile SingularAttribute<Projects, Integer> mark;

}