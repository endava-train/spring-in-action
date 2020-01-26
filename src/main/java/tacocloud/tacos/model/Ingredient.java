package tacocloud.tacos.model;

import lombok.Value;
import tacocloud.tacos.enums.Type;

@Value
public class Ingredient {
    private String id;
    private String name;
    private Type type;
}
