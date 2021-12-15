package com.company;

public class Q1 {
    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT;
    }

    public static void main(String[] args) {
	int[][] room = {
            {0,0,0,0},
            {0,0,0,0},
            {-1,0,0,0},
            {0,0,0,-1},

    };
    Roomba Roomba= new Roomba(room);
    }
}

interface iRobot {
    boolean move();
    void turnLeft();
    void turnRight();
    void clean();
}


class Roomba implements iRobot{
    int[][] room;
    Q1.Direction dir;
    int x;
    int y;
    Roomba(int[][] room){
        this.room=room;
        dir=Q1.Direction.DOWN;
        x=0;
        y=0;
    }
    final public boolean move(){
        int addx,addy;
        if(dir==Q1.Direction.DOWN){
            addx=0;
            addy=1;
        }
        else if(dir==Q1.Direction.UP){
            addx=0;
            addy=-1;
        }
        else if(dir==Q1.Direction.LEFT){
            addx=-1;
            addy=0;
        }
        else{
            addx=1;
            addy=0;
        }
        if(x+addx>=0&&x+addx<room[0].length&&y+addy>=0&&y+addy<room.length&&room[y+addy][x+addx]!=-1){
            x+=addx;
            y+=addy;
            return true;
        }
        return false;
    }
    final public void turnLeft(){
        if(dir==Q1.Direction.DOWN){
            dir=Q1.Direction.RIGHT;
        }
        else if(dir==Q1.Direction.UP){
            dir=Q1.Direction.LEFT;
        }
        else if(dir==Q1.Direction.LEFT){
            dir=Q1.Direction.DOWN;
        }
        else{
            dir=Q1.Direction.UP;
        }
    }
    final public void turnRight(){

        if(dir==Q1.Direction.DOWN){
            dir=Q1.Direction.LEFT;
        }
        else if(dir==Q1.Direction.UP){
            dir=Q1.Direction.RIGHT;
        }
        else if(dir==Q1.Direction.LEFT){
            dir=Q1.Direction.UP;
        }
        else{
            dir=Q1.Direction.DOWN;
        }
    }
    final public void clean(){
        if(room[y][x]==0){
            room[y][x]=1;
        }
    }


}