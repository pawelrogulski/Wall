import java.util.ArrayList;
import java.util.List;

public class CompositeBrick implements CompositeBlock{
    public String color;
    public String material;
    public List<Block> blocks;

    public CompositeBrick(String color, String material, List<Block> blocks) {
        this.color = color;
        this.material = material;
        this.blocks = blocks;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public List<Block> getBlocks() {
        return blocks;
    }
}


