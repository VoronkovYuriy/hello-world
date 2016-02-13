import javax.swing.*;

import java.awt.*;

public class Calculator {

// Объявление всех компонентов калькулятора.

    JPanel windowContent;

    JTextField displayField;

    JButton button0;

    JButton button1;

    JButton button2;

    JButton button3;

    JButton button4;

    JButton button5;

    JButton button6;

    JButton button7;


    JButton button8;

    JButton button9;

    JButton buttonPoint;

    JButton buttonEqual;

    JPanel p1;

    JButton buttonMinus;

    JButton buttonPlus;

    JButton buttonDelit;

    JButton buttonUmnoj;

    JPanel p2;




    // В конструкторе создаются все компоненты

    // и добавляются на фрейм с помощью комбинации

    // Borderlayout и Gridlayout

    Calculator(){

        windowContent= new JPanel();

// Задаём схему для этой панели

        BorderLayout bl = new BorderLayout();

        windowContent.setLayout(bl);

        // Создаём и отображаем поле

        // Добавляем его в Северную область окна

        displayField = new JTextField(30);

        windowContent.add("North",displayField);

        // Создаём кнопки, используя конструктор

        // класса JButton, который принимает текст

        // кнопки в качестве параметра

        button0=new JButton("0");

        button1=new JButton("1");

        button2=new JButton("2");

        button3=new JButton("3");

        button4=new JButton("4");

        button5=new JButton("5");

        button6=new JButton("6");

        button7=new JButton("7");

        button8=new JButton("8");

        button9=new JButton("9");

        buttonPoint = new JButton(".");

        buttonEqual=new JButton("=");

        buttonPlus=new JButton("+");

        buttonMinus=new JButton("-");

        buttonUmnoj=new JButton("*");

        buttonDelit=new JButton("/");






        // Создаём панель с GridLayout

        // которая содержит 12 кнопок - 10 кнопок с числами

        // и кнопки с точкой и знаком равно

        p1 = new JPanel();

        GridLayout gl =new GridLayout(4,3);

        p1.setLayout(gl);


        //Создаем ещё одну панель р2
        p2 = new JPanel();

        GridLayout g2 =new GridLayout(4,1);

        p2.setLayout(g2);


        // Добавляем кнопки на панель p1

        p1.add(button1);

        p1.add(button2);

        p1.add(button3);

        p1.add(button4);

        p1.add(button5);

        p1.add(button6);

        p1.add(button7);



        p1.add(button8);

        p1.add(button9);

        p1.add(button0);

        p1.add(buttonPoint);

        p1.add(buttonEqual);


        // Добавляем кнопки на панель p2

        p2.add(buttonPlus);
        p2.add(buttonMinus);
        p2.add(buttonDelit);
        p2.add(buttonUmnoj);

        // Помещаем панель p1 в центральную область окна

        windowContent.add("Center",p1);

        // Помещаем панель p1 в центральную область окна

        windowContent.add("East", p2);

        //Создаём фрейм и задаём его основную панель

        JFrame frame = new JFrame("Calculator");

        frame.setContentPane(windowContent);

        // делаем размер окна достаточным

        // для того, чтобы вместить все компоненты

        frame.pack();

        // Наконец, отображаем окно

        frame.setVisible(true);


        // Создаем экземпляр слушателя событий и

        // регистрируем его в каждой кнопке

        CalculatorEngine calcEngine = new CalculatorEngine(this);

        button0.addActionListener(calcEngine);

        button1.addActionListener(calcEngine);

        button2.addActionListener(calcEngine);

        button3.addActionListener(calcEngine);

        button4.addActionListener(calcEngine);

        button5.addActionListener(calcEngine);

        button6.addActionListener(calcEngine);

        button7.addActionListener(calcEngine);

        button8.addActionListener(calcEngine);

        button9.addActionListener(calcEngine);

        buttonPoint.addActionListener(calcEngine);

        buttonPlus.addActionListener(calcEngine);

        buttonMinus.addActionListener(calcEngine);

        buttonDelit.addActionListener(calcEngine);

        buttonUmnoj.addActionListener(calcEngine);

        buttonEqual.addActionListener(calcEngine);



    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();

    }

}
