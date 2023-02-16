import java.util.ArrayList;
import java.util.List;

public class WallApplication {
    public static void main(String[] args){
        List<Block> blocks = new ArrayList<>();
        blocks.add(new Brick("black","sand"));
        blocks.add(new Brick("gold","gold"));
        Wall wall = new Wall(blocks);
        System.out.println(wall.findBlockByColor("black"));
        List<Block> foundBlocks = wall.findBlocksByMaterial("gold");
        for(Block block : foundBlocks){
            System.out.println(block.getColor());
        }
        System.out.println(wall.count());

        System.out.println();

        List<Block> compositeBlocks = new ArrayList<>();
        compositeBlocks.add(new CompositeBrick("darkyellow","sandgold",blocks));
        Wall compositeWall = new Wall(compositeBlocks);
        System.out.println(compositeWall.findBlockByColor("darkyellow"));
        List<Block> foundCompositeBlocks = compositeWall.findBlocksByMaterial("sandgold");
        for(Block compositeBlock : foundCompositeBlocks){
            System.out.println(compositeBlock.getColor());
        }
        System.out.println(compositeWall.count());
    }
}