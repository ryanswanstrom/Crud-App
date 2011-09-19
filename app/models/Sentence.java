
package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import play.data.validation.MaxSize;
import play.data.validation.MinSize;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Sentence extends Model {
    @Required
    @MinSize(2)
    @MaxSize(500)
    public String text;

    @Required
    @ManyToOne
    public Story story;

    @Override
    public String toString() {
        return this.text;
    }
}
