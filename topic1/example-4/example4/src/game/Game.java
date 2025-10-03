package game;

import java.util.Scanner;

public class Game {
    private Integer minLimit, maxLimit;
    public Game(Integer minLimit, Integer maxLimit) {
        this.minLimit = minLimit;
        this.maxLimit = maxLimit;
    }
    private Integer generateRandomNumber() {
        double randomNumber = Math.random() * (this.maxLimit - this.minLimit) + this.minLimit;
        return (int)(randomNumber);
    }
    private void printWin() {
        System.out.println("#################################");
        System.out.println("#                               #");
        System.out.println("#   █▀▀ ▄▀█ █▄░█ ▄▀█ █▀▀ █▀▀    #");
        System.out.println("#   █▄█ █▀█ █░▀█ █▀█ █▄█ ██▄    #");
        System.out.println("#                               #");
        System.out.println("#           :)                  #");
        System.out.println("#################################");
    }
    private void printMinus() {
       System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*     El Número menor          *");
        System.out.println("*                             *");
        System.out.println("*******************************");
    }
    private void printMayor() {
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*     El Número mayor          *");
        System.out.println("*                             *");
        System.out.println("*******************************");
    }
    // start the game
    public void runGame() {
        Integer magicNumber = generateRandomNumber();
        System.out.println("Hola estoy pensando en un numero entero ");
        System.out.println("Adivinas cual es ?  ");
        Scanner read = new Scanner(System.in);
        Boolean isPlaying = true;
        while (isPlaying) {
            Integer userNumber = read.nextInt();
            if (userNumber == magicNumber) {
                this.printWin();
                isPlaying = false;
            }
            if (userNumber > magicNumber) {
                this.printMinus();
            }
            if (userNumber < magicNumber) {
                this.printMayor();
            }
        }
        read.close();
    }

}
