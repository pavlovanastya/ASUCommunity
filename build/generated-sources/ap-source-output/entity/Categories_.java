package entity;

import entity.Articles;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-05-15T00:02:56")
@StaticMetamodel(Categories.class)
public class Categories_ { 

    public static volatile SingularAttribute<Categories, Integer> id;
    public static volatile SingularAttribute<Categories, String> name;
    public static volatile ListAttribute<Categories, Articles> articlesList;

}