package com.example.javaproject.week1.d5;

public class SpaceInvader {
    private void moveLeft() {
        int location = 0;
        location = -1;
        System.out.printf("moveLeft:, %d\n", location);
    }
    private void moveRight() {
        int location = 0;
        location = 1;
        System.out.printf("moveright: %d\n", location);
    }

    public static void main(String[] args) {

        SpaceInvader si = new SpaceInvader();
        si.moveLeft(); // 키보드 왼쪽 키 누르면 실행되는 메소드
        si.moveRight(); // 키보드 오른쪽 키 누르면 실행되는 메소드
        si.moveRight(); // 키보드 오른쪽 키 누르면 실행되는 메소드
        si.moveRight(); // 키보드 오른쪽 키 누르면 실행되는 메소드
        si.moveRight(); // 키보드 오른쪽 키 누르면 실행되는 메소드
        si.moveRight(); // 키보드 오른쪽 키 누르면 실행되는 메소드

    }
}
