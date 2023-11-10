package modelo;

import gfutria.Logic;

public class DirectionChange extends Logic {

    private String world[][];
    private int beginX, beginY;
    private int endX, endY;
    private int previousMove = 0;

    public DirectionChange() {
        world = new String[30][30];
    }

    public DirectionChange(int beginX, int beginY, int endX, int endY) {
        this.beginX = beginX;
        this.beginY = beginY;
        this.endX = endX;
        this.endY = endY;
        world = new String[30][30];
        world[beginX][beginY] = "B";
        world[endX][endY] = "E";
    }

    public DirectionChange(int beginX, int beginY) {
        this.beginX = beginX;
        this.beginY = beginY;
        world = new String[30][30];
        world[beginX][beginY] = "B";
        world[endX][endY] = "E";
    }

    public String[][] getWorld() {
        return world;
    }

    public void setWorld(String[][] world) {
        this.world = world;
    }

    public int getPreviousMove() {
        return this.previousMove;
    }

    public void setPreviousMove(int previousMove) {
        this.previousMove = previousMove;
    }

    public int getBeginX() {
        return beginX;
    }

    public void setBeginX(int beginX) {
        this.beginX = beginX;
    }

    public int getBeginY() {
        return beginY;
    }

    public void setBeginY(int beginY) {
        this.beginY = beginY;
    }

    public int getEndX() {
        return endX;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public int getEndY() {
        return endY;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

    public void up() {
        if (previousMove != 1) {
            //System.out.println("    U");
            int currentX = getBeginX();
            int currentY = getBeginY();
            // Verifica si la posición actual es la fila 0
            if (currentX == 0) {
                currentX = 29; // Cambia la fila a 29
            } else {
                currentX--; // Mueve una fila hacia arriba
            }

            // Actualiza la posición de "begin" en el mundo
            world[beginX][beginY] = "U";
            world[currentX][currentY] = "B";

            // Actualiza las coordenadas de "begin"
            beginX = currentX;
            beginY = currentY;

            previousMove = 1; // Actualiza el movimiento anterior

        }
    }

    public void right() {
        if (previousMove != 2) {
            //System.out.println("    R");
            int currentX = beginX;
            int currentY = beginY;

            // Verifica si la posición actual está en la columna 29
            if (currentY == 29) {
                currentY = 0; // Cambia la columna a 0
            } else {
                currentY++; // Mueve una columna a la derecha
            }

            // Actualiza la posición de "begin" en el mundo
            world[beginX][beginY] = "R"; // Marca la casilla con "R" para indicar movimiento a la derecha
            world[currentX][currentY] = "B";

            // Actualiza las coordenadas de "begin"
            beginX = currentX;
            beginY = currentY;

            previousMove = 2; // Actualiza el movimiento anterior
        }
    }

    public void down() {
        if (previousMove != 3) {
            //System.out.println("    D");
            int currentX = beginX;
            int currentY = beginY;

            // Verifica si la posición actual está en la fila 29
            if (currentX == 29) {
                currentX = 0; // Cambia la fila a 0
            } else {
                currentX++; // Mueve una fila hacia abajo
            }

            // Actualiza la posición de "begin" en el mundo
            world[beginX][beginY] = "D";
            world[currentX][currentY] = "B"; // Marca la casilla con "D" para indicar movimiento hacia abajo

            // Actualiza las coordenadas de "begin"
            beginX = currentX;
            beginY = currentY;

            previousMove = 3; // Actualiza el movimiento anterior
        }
    }

    public void left() {
        if (previousMove != 4) {
            //System.out.println("    L");
            int currentX = beginX;
            int currentY = beginY;

            // Verifica si la posición actual está en la columna 0
            if (currentY == 0) {
                currentY = 29; // Cambia la columna a 29
            } else {
                currentY--; // Mueve una columna a la izquierda
            }

            // Actualiza la posición de "begin" en el mundo
            world[beginX][beginY] = "L";
            world[currentX][currentY] = "B"; // Marca la casilla con "L" para indicar movimiento hacia la izquierda

            // Actualiza las coordenadas de "begin"
            beginX = currentX;
            beginY = currentY;

            previousMove = 4;
        }
    }

    @Override
    public Logic cloneObject(Logic logic) {
        DirectionChange trsLogic = (DirectionChange) logic;
        DirectionChange objClone = new DirectionChange();

        objClone.setBeginX(trsLogic.getBeginX());
        objClone.setBeginY(trsLogic.getBeginY());
        objClone.previousMove = trsLogic.previousMove;
        return objClone;
    }

    @Override
    public String state() {

        return "(" + this.beginX + "," + this.beginY + ")";
    }

    @Override
    public void action(int i) {

        switch (i) {
            case 1:
                up();
                break;
            case 2:
                right();
                break;
            case 3:
                down();
                break;
            case 4:
                left();
                break;
        }
    }
}
