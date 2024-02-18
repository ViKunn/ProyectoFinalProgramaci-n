import business.Position;

import java.util.Vector;

public class Map {

	private Block[][] blocks;

	private final int mapSizeX;
	private final int mapSizeY;

	public Map(Vector<Vector<Integer>> numbers, int mapSizeX, int mapSizeY) {

		this.mapSizeX = mapSizeX;
		this.mapSizeY = mapSizeY;

		blocks = loadBlocks(numbers);

		System.out.println(":)");
	}

	// TODO
	public Block getBlock(Position position){
		return blocks[position.getX()][position.getY()];
	}

	// TODO para poner hielo se actualiza el mapa
	public void putIce(int direction, int x, int y){
		// TODO
	}







	private Block[][] loadBlocks(Vector<Vector<Integer>> numbers) {

		Block[][] loadedBlocks = new Block[mapSizeY][mapSizeX];

		BlockManager blockManager = new BlockManager();
		int blockNumber;

		for (int i = 0; i < numbers.size(); i++) {

			for (int j = 0; j < numbers.get(i).size(); j++) {

				blockNumber = numbers.get(i).get(j);

				try {

					loadedBlocks[i][j] = blockManager.getBlock(blockNumber);

				} catch (ArrayIndexOutOfBoundsException e){

					System.out.println("Error en el tamaño de la matriz en los archivos de mapa");
					break;
				}

			}
		}

		return loadedBlocks;

	}

}