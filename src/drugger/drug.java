
package drugger;

public class drug 
{
    private int code;
    private String type,effect,name;
    
    drug()
    {
        code=0;
        type="";
        effect="";
        name="";
    }
    
    drug(int code,String name,String type,String effect)
    {
        this.code=code;
        this.name=name;
        this.type=type;
        this.effect=effect;
    }
    
    public int getCode()
    {
        return this.code;
    }
    
    public String getType()
    {
        return this.type;
    }
    
    public String getEffect()
    {
        return this.effect;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setType(String type)
    {
        this.type=type;
    }
    
    public void setEffect(String effect)
    {
        this.effect=effect;
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
    
    public void setCode(int code)
    {
        this.code=code;
    }
    
}
