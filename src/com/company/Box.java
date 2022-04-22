package com.company;

public class Box {

    //поля класса
    int weight;
    int height;
    int tolwina;

    // метод, возращающий произведение величин
    int vol() {
        return weight * height * tolwina;
    }

    // метод, который инициализирует поля
    void setDim(int weight, int height, int tolwina) {
        int w = weight;
        int h = height;
        int t = tolwina;
    }
}

class BoxRes {
    public static void main(String[] args) {

        // Объекты класса
        Box box1 = new Box();
        Box box2 = new Box();
        int v;

        // Инициализируем поля
        box1.setDim(1, 1, 1);
        box2.setDim(2, 2, 2);

        // Выводим результат
        v = box1.vol();
        System.out.println(v);
        System.out.println(box2.vol());

    }
}

