package Characters;

import business.CollisionChecker;
import business.Direction;
import business.Movable;
import business.Position;
import business.Map;

public class Troll extends Enemy implements Movable, Runnable {

	public Troll(Position position, Direction direction, CollisionChecker collisionChecker) {
		super(position, direction, 1, collisionChecker);
	}

	// TODO thread troll / enemigos
	@Override
	public void run() {
		while (true) {
			move(direction); // Mover el troll en la dirección actual


			try {
				Thread.sleep(1000); // Esperar un segundo entre cada movimiento
			} catch (InterruptedException e) {
				// Manejar interrupciones del hilo si es necesario
				e.printStackTrace();
			}
		}
	}

	public void move(Direction direction) {

		if (!(collisionChecker.frontBlockIsSolid(direction, position))) {

			switch (direction) {
				case UP:
					position.setY(position.getY() - advance);
					break;
				case DOWN:
					position.setY(position.getY() + advance);
					break;
				case RIGHT:
					position.setX(position.getX() + advance);
					break;
				case LEFT:
					position.setX(position.getX() - advance);
					break;
			}

		} else {
			switch (direction) {
				case UP:
					this.direction = Direction.RIGHT;
					break;
				case DOWN:
					this.direction = Direction.LEFT;
					break;
				case RIGHT:
					this.direction = Direction.DOWN;
					break;
				case LEFT:
					this.direction = Direction.UP;
					break;
			}
		}
	}
}