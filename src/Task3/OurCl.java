package Task3;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class OurCl {

    private String name;
    public int articul;
    private boolean isExist;

    public OurCl(String aName, int aArticul){

        this.articul = aArticul;
        this.name = aName;
        this.isExist = true;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsExist() {
        return isExist;
    }

    public void setExist(boolean exist) {
        isExist = exist;
    }


}
