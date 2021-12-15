public class Roomba implements iRobot{
    int x = 0;
    int y = 0;
    int[][] direction = {{0,1},{0,-1},{-1,0},{1,0}};
    Direction dir = Direction.DOWN;
    int[][] room;

    public Roomba(int[][] room) {
        this.room = room;
    }

    @Override
    public boolean move() {
        int num = -1;

        if(dir == Direction.LEFT) num = 0;
        else if(dir == Direction.RIGHT) num = 1;
        else if(dir == Direction.UP) num = 2;
        else if(dir == Direction.DOWN) num = 3;

        int x2 = x +direction[num][0];
        int y2 = y + direction[num][1];

        if(x2 < room.length && x2 >= 0
                && y2 < room[0].length && y2 >= 0
                && room[x2][y2] != -1) {
            x = x2;
            y = y2;
            return true;
        }
        return false;
    }

    @Override
    public void turnLeft() {
        if(dir == Direction.DOWN) {
            dir = Direction.RIGHT;
        }
        else if(dir == Direction.UP) {
            dir = Direction.LEFT;
        }
        else if(dir == Direction.RIGHT) {
            dir = Direction.UP;
        }
        else if(dir == Direction.LEFT) {
            dir = Direction.DOWN;
        }
    }

    @Override
    public void turnRight() {
        if(dir == Direction.DOWN) {
            dir = Direction.LEFT;
        }
        else if(dir == Direction.LEFT) {
            dir = Direction.UP;
        }
        else if(dir == Direction.UP) {
            dir = Direction.RIGHT;
        }
        else if(dir == Direction.RIGHT) {
            dir = Direction.DOWN;
        }
    }

    @Override
    public void clean() {
        room[x][y] = 1;
        System.out.println("I've cleaned spot("+x+", "+y+")");
    }
}