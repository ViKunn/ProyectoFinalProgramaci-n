package business;

import java.util.HashMap;

public class BlockManager {

	private HashMap<Integer, Block> blocks;

	public BlockManager() {

		blocks = new HashMap<Integer, Block>();

		blocks.put(0, new Block(               "SNOW ",               false));
		blocks.put(1, new Block("\u001B[34m" + "ICE  " + "\u001B[0m", true ));
		blocks.put(2, new Block("\u001B[31m" + "BLOCK" + "\u001B[0m", true ));

	}

	public Block getBlock(int blockNumber) {
		return blocks.get(blockNumber);
	}
}