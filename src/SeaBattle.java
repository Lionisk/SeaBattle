/*
ОБЪЯВЛЯЕМ целочисленный массив для хранения адреса ячеек.
Даем ему имя locationCells.

ОБЪЯВЛЯЕМ переменную тип int для хранения количества попаданий. Называем ее numOfHits и ПРИСВАЕВАЕМ ей 0.

---------------------------------------------------------

ОБЪЯВЛЯЕМ метод checkYouSelf(), который принимае ход пользователя в качестве параметра String (1,2,3 и т.д.),
проверяет его и возвращает результат: "Попал", "Мимо" или "Потопил".

ОБЪЯВЛЯЕМ сеттер setLocationCells(), который принимает целочисленный массив (хранящий адрес трёх ячеек
в виде переменных типа int - 2,3,4 и т.д.).

МЕТОД: String checkYouSelf(String userGuess)
    ПОЛУЧАЕМ ход пользователя в виде строкового параметра.
    ПРЕОБРАЗУЕМ полученные данны в тип int.
    ПОВТОРЯЕМ это с каждой ячейкой массива.
        //СРАВНИВАЕМ ход пользователя с местоположением клетки
        ЕСЛИ пользователь угадал,
            ИНКРЕМЕНТИРУЕМ количество попаданий.
            //ВЫЯСНЯЕМ, была ли это последняя ячейка.
            ЕСЛИ количество попаданий равно 3, ВОЗВРАЩАЕМ "Потопил"
        ИНАЧЕ потопление не произошло, значит ВОЗВРАЩАЕМ "Попал".
        КОНЕЦ ВЕТВЛЕНИЯ
    КОНЕЦ ПОВТОРЕНИЯ
КОНЕЦ МЕТОДА

МЕТОД void setLocationCells(int[] cellLocations
    ПОЛУЧАЕМ адреса ячеек в виде параметра с целочисленным смассивом
    ПРИСВАИВАЕМ) полученный параметр полю, хранящему адреса ячеек.
КОНЕЦ МЕТОДА



 */


public class SeaBattle {
    int[] locationCells;
    int numOfHits;

    public static void main(String[] args) {
        int numOfGuesses = 0;
        SeaBattle seaBattle = new SeaBattle();
        GameHelper helper = new GameHelper();
        int randomNum = (int) (Math.random()*5);
        int[] locations = {randomNum, randomNum+1, randomNum+2};

        seaBattle.setLocationCells(locations);


        boolean isAlive = true;

        while (isAlive = true ) {
            String guess = helper.getUserInput("Введите число");
            String result = seaBattle.checkYouself(guess);
            numOfGuesses++;
            if (result.equals("Потопил")){
                isAlive = false;
                System.out.println("Вам потребовалось - " + numOfGuesses +" попыток(и)");
            }
        }
    }

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYouself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }


}
