package models;

import javax.persistence.Entity;
import play.data.validation.MaxSize;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Story extends Model {
    @Required
    @MaxSize(100)
    public String title;

    @Override
    public String toString() {
        return this.title;
    }

}
