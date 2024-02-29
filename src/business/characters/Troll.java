package business.characters;

import business.managers.CollisionChecker;
import business.Direction;
import business.interfaces.Movable;
import business.Position;

public class Troll extends Enemy implements Movable{

	public Troll() {
		setDirection(Direction.DOWN);
	}
	public void setCollisionChecker(CollisionChecker collisionChecker) {
		super.setCollisionChecker(collisionChecker);
	}

	public void setPosition(Position positionExpect) {
		super.setPosition(positionExpect);
	}

	// TODO thread troll / enemigos
	// TODO actualizar para position.getFrontPosition
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