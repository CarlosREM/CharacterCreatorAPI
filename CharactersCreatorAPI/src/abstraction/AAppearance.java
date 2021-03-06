package abstraction;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import java.util.ArrayList;
import java.util.List;

/** 
 * Abstract class used to implements the appearance of characters and weapons
 * @author Fabricio Ceciliano
 * @author Carlos Esquivel
 * @author Marco Gamboa
 * @author Diego Murillo
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.CLASS,
        include = JsonTypeInfo.As.PROPERTY,
        property = "@class"
)
public abstract class AAppearance implements IPrototype<AAppearance>{
    /**
     * String list of images, one for each scenario listed in the corresponding enum implementation
     */
    private List<String> looks = new ArrayList<>(); 

    /**
     * Gets the string list of images.
     * @return A list of strings of images of the corresponding implementation.
     */
    public List<String> getLooks() {
        return looks;
    }
    /**
     * Sets the string list of images
     * @param looks A string list containing the path of images of the corresponding implementation
     */
    public void setLooks(List<String> looks) {
        this.looks = looks;
    }
    
    /**
     * Gets the string of a specific enum code.
     * @param code the enum code of the desired image.
     * @return A string containing the image path.
     */
    public String getLook(Enum code) {
        return looks.get(code.ordinal());
    }
    
}
