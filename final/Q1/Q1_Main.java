public class Q1_Main {

    public static void main(String[] args){
        int[][] room = {
                {0,0,0,0},
                {0,0,0,0},
                {-1,0,0,0},
                {0,0,-1,0}
        };
        Roomba robot = new Roomba(room);
        robot.turnRight();
        robot.move();
        robot.clean();
    }
}
