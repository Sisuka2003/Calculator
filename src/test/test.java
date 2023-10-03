/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class test {
     static  double FirstValve,Lastvalve=0,result,calculatedSolution;
     static  String operations;
    JFrame jf;
    JPanel jp_up, jp_down;
    Font f, jtf_Font,equal,numbers;
    static JTextField jtf;
    JMenuBar mb;
    JMenu menu,menu2,menu3;
    JMenuItem mItem1,mItem2;
    static JButton percentage, root, divide, backspace, zero, one, two, three, four, five, six, seven, eight, nine, clear, decimal, answer, add, substract, multiply,mc,mr,ms,madd,msub,clearE,plusOrMinus,oneOverX,blank1,blank2;
    
    public test(){

//Frame decleration STARTS        
        jf = new JFrame();
        jf.setSize(398, 600);
        jf.getContentPane().setBackground(new Color(240, 240, 240));
        jf.setLayout(null);
        jf.setTitle("Calculator");
//Frame decleration ENDS        
        
//Font declerations START        
        f = new Font("Segoe UI Semibold", Font.PLAIN, 15);
        jtf_Font = new Font("Segoe UI Semibold", Font.PLAIN, 48);
        equal = new Font("Segoe UI", Font.PLAIN, 25);
        numbers = new Font("Segoe UI Semibold", Font.PLAIN, 18);
//Font declerations END        
        
//Menu bar starts         
         mb=new JMenuBar();
         menu=new JMenu("View");
         menu2=new JMenu("Edit");
         menu3=new JMenu("Help");
         mItem1=new JMenu("View Help F1");
         mItem2=new JMenu("About Calculator");

         mb.add(menu);
         mb.add(menu2);
         mb.add(menu3);
        menu3.add(mItem1);
        menu3.add(mItem2);
//Menu bar Ends         

        
//Panel Top STARTS        
          jp_up = new JPanel();
        jp_up.setSize(398, 100);
        jp_up.setBackground(new Color(240, 240, 240));
        jp_up.setLayout(null);
        
        
        jtf = new JTextField();
        jtf.setText("0");
        jtf.setSize(365, 60); 
        jtf.setFont(jtf_Font);
        jtf.setLocation(8,20);
        jtf.setBorder(null);
        jtf.setBackground(Color.white);
        jtf.setHorizontalAlignment(jtf.RIGHT);
        jtf.setCaretColor(Color.WHITE);
        jtf.setEditable(false);
//Panel Top ENDS
        
//Panel Bottom STARTS        
         jp_down = new JPanel();
        jp_down.setSize(370, 435);
        jp_down.setBackground(new Color(240, 240, 240));
        jp_down.setLocation(6, 100);
        jp_down.setLayout(new GridLayout(6, 5, 3, 3));
        
        //Buttons decleration STARTS
        mc = new JButton();
        mc.setText("MC");
        mc.setFocusPainted(false);
        mc.setBorder(null);
        mc.setBackground(new Color(250, 250, 250));
        
        mr = new JButton();
        mr.setText("MR");
        mr.setFocusPainted(false);
        mr.setBorder(null);
        mr.setBackground(new Color(250, 250, 250));
        
        ms = new JButton();
        ms.setText("MS");
        ms.setFocusPainted(false);
        ms.setBorder(null);
        ms.setBackground(new Color(250, 250, 250));
        
        madd = new JButton();
        madd.setText("M+");
        madd.setFocusPainted(false);
        madd.setBorder(null);
        madd.setBackground(new Color(250, 250, 250));
        
        msub = new JButton();
        msub.setText("M-");
        msub.setFocusPainted(false);
        msub.setBorder(null);
        msub.setBackground(new Color(250, 250, 250));
        
        backspace = new JButton();
        backspace.setText("<--");
        backspace.setFocusPainted(false);
        backspace.setBorder(null);
        backspace.setBackground(new Color(250, 250, 250));
        
        clearE = new JButton();
        clearE.setText("CE");
        clearE.setFocusPainted(false);
        clearE.setBorder(null);
        clearE.setBackground(new Color(250, 250, 250));
        
        clear = new JButton();
        clear.setText("C");
        clear.setFocusPainted(false);
        clear.setBorder(null);
        clear.setBackground(new Color(250, 250, 250));
        
        plusOrMinus = new JButton();
        plusOrMinus.setText("+/-");
        plusOrMinus.setFont(f);
        plusOrMinus.setFocusPainted(false);
        plusOrMinus.setBorder(null);
        plusOrMinus.setBackground(new Color(250, 250, 250));
        
        root = new JButton();
        root.setText("SQRT");
        root.setFont(f);
        root.setFocusPainted(false);
        root.setBorder(null);
        root.setBackground(new Color(250, 250, 250));
        
        seven = new JButton();
        seven.setText("7");
        seven.setFont(numbers);
        seven.setFocusPainted(false);
        seven.setBorder(null);
        seven.setBackground(new Color(250, 250, 250));
        
        eight = new JButton();
        eight.setText("8");
        eight.setFont(numbers);
        eight.setFocusPainted(false);
        eight.setBorder(null);
        eight.setBackground(new Color(250, 250, 250));
        
        nine = new JButton();
        nine.setText("9");
        nine.setFont(numbers);
        nine.setFocusPainted(false);
        nine.setBorder(null);
        nine.setBackground(new Color(250, 250, 250));
        
        divide = new JButton();
        divide.setText("/");
        divide.setFont(numbers);
        divide.setFocusPainted(false);
        divide.setBorder(null);
        divide.setBackground(new Color(250, 250, 250));
        
         percentage = new JButton();
         percentage.setText("%");
        percentage.setFont(f);
        percentage.setFocusPainted(false);
        percentage.setBorder(null);
        percentage.setBackground(new Color(250, 250, 250));
         
        four = new JButton();
        four.setText("4");
        four.setFont(numbers);
        four.setFocusPainted(false);
        four.setBorder(null);
        four.setBackground(new Color(250, 250, 250));
        
        five = new JButton();
        five.setText("5");
        five.setFont(numbers);
        five.setFocusPainted(false);
        five.setBorder(null);
        five.setBackground(new Color(250, 250, 250));
        
        six = new JButton();
        six.setText("6");
        six.setFont(numbers);
        six.setFocusPainted(false);
        six.setBorder(null);
        six.setBackground(new Color(250, 250, 250));
        
        multiply = new JButton();
        multiply.setText("X");
        multiply.setFocusPainted(false);
        multiply.setBorder(null);
        multiply.setBackground(new Color(250, 250, 250));
        
        oneOverX = new JButton();
        oneOverX.setText("1/X");
        oneOverX.setFocusPainted(false);
        oneOverX.setBorder(null);
        oneOverX.setBackground(new Color(250, 250, 250));
        
        one = new JButton();
        one.setText("1");
        one.setFont(numbers);
        one.setFocusPainted(false);
        one.setBorder(null);
        one.setBackground(new Color(250, 250, 250));
        
        two = new JButton();
        two.setText("2");
        two.setFont(numbers);
        two.setFocusPainted(false);
        two.setBorder(null);
        two.setBackground(new Color(250, 250, 250));
        
        three = new JButton();
        three.setText("3");
        three.setFont(numbers);
        three.setFocusPainted(false);
        three.setBorder(null);
        three.setBackground(new Color(250, 250, 250));
        
        substract = new JButton();
        substract.setText("-");
        substract.setFont(numbers);
        substract.setFocusPainted(false);
        substract.setBorder(null);
        substract.setBackground(new Color(250, 250, 250));
        
        answer = new JButton();
        answer.setText("=");
        answer.setFont(equal);
        answer.setFocusPainted(false);
        answer.setBorder(null);
        answer.setBackground(new Color(250, 250, 250));
        
        zero = new JButton();
        zero.setText("0");
        zero.setFont(numbers);
        zero.setFocusPainted(false);
        zero.setBorder(null);
        zero.setBackground(new Color(250, 250, 250));
        
        blank1 = new JButton();
        blank1.setFocusPainted(false);
        blank1.setBorder(null);
        blank1.setBackground(new Color(250, 250, 250));
        
        
        
        decimal = new JButton();
        decimal.setText(".");
        decimal.setFont(equal);
        decimal.setBackground(new Color(250, 250, 250));
        decimal.setFocusPainted(false);
        decimal.setBorder(null);
        
        add = new JButton();
        add.setText("+");
        add.setFont(numbers);
        add.setFocusPainted(false);
        add.setBorder(null);
        add.setBackground(new Color(250, 250, 250));
        
        blank2 = new JButton();
        blank2.setFocusPainted(false);
        blank2.setBorder(null);
        blank2.setBackground(new Color(250, 250, 250));
        //Button declerations ENDS
//Panel Bottom ENDS        
        
        
        Button0 b0 = new Button0();
        Button1 b1 = new Button1();
        Button2 b2 = new Button2();
        Button3 b3 = new Button3();
        Button4 b4 = new Button4();
        Button5 b5 = new Button5();
        Button6 b6 = new Button6();
        Button7 b7 = new Button7();
        Button8 b8 = new Button8();
        Button9 b9 = new Button9();
        Clear c = new Clear();
        backSpace bs = new backSpace();
        Decimal d=new Decimal();
        addition addition=new addition();
        substraction substraction=new substraction();
        division division=new division();
        multiplication multiplication=new multiplication();
        root sqroot=new root();
        percentage percent=new percentage();
        solution solve=new solution();

//Adding ActionListeners STARTS        
        zero.addActionListener(b0);
        one.addActionListener(b1);
        two.addActionListener(b2);
        three.addActionListener(b3);
        four.addActionListener(b4);
        five.addActionListener(b5);
        six.addActionListener(b6);
        seven.addActionListener(b7);
        eight.addActionListener(b8);
        nine.addActionListener(b9);
        clear.addActionListener(c);
        root.addActionListener(sqroot);
        backspace.addActionListener(bs);
        decimal.addActionListener(d);
        add.addActionListener(addition);
      substract.addActionListener(substraction);
        divide.addActionListener(division);
        multiply.addActionListener(multiplication);
        percentage.addActionListener(percent);
        answer.addActionListener(solve);
 //adding ActionListeneers ENDS
 
//Components adding STARTS
        jf.add(jp_up);
        jf.add(jp_down);
        jf.setJMenuBar(mb);
        jp_up.add(jtf);
        
        jp_down.add(mc);
        jp_down.add(mr);
        jp_down.add(ms);
        jp_down.add(madd);
        jp_down.add(msub);
        jp_down.add(backspace);
        jp_down.add(clearE);
        jp_down.add(clear);
        jp_down.add(plusOrMinus);
        jp_down.add(root);
        jp_down.add(seven);
        jp_down.add(eight);
        jp_down.add(nine);
        jp_down.add(divide);
        jp_down.add(percentage);
        jp_down.add(four);
        jp_down.add(five);
        jp_down.add(six);
        jp_down.add(multiply);
        jp_down.add(oneOverX);
        jp_down.add(one);
        jp_down.add(two);
        jp_down.add(three);
        jp_down.add(substract);
        jp_down.add(answer);
        jp_down.add(zero);
        jp_down.add(blank1);
        jp_down.add(decimal);
        jp_down.add(add);
        jp_down.add(blank2);
//Components Adding ENDS

//Frame visibiliy STARTS
        jf.setVisible(true);
//Frame visibility ENDS        
    }
   
    
    
    public static void main(String[] args) {
        test t=new test();
    }

 
//operations start
    public static void setTextZero() {
        if (jtf.getText().equals("0")) {
            jtf.setText("");
            jtf.setText("0");
        } else {
            String EnterNum = jtf.getText() + zero.getText();
            jtf.setText(EnterNum);
        }
    }

    public static void setTextOne() {
        if (jtf.getText().equals("0")) {
            String EnterNum = one.getText();
            jtf.setText(EnterNum);
        } else {
            String EnterNum = jtf.getText() + one.getText();
            jtf.setText(EnterNum);
        }
    }

    public static void setTextTwo() {
        if (jtf.getText().equals("0")) {
            String EnterNum = two.getText();
            jtf.setText(EnterNum);
        } else {
            String EnterNum = jtf.getText() + two.getText();
            jtf.setText(EnterNum);
        }
    }

    public static void setTextThree() {
        if (jtf.getText().equals("0")) {
            String EnterNum = three.getText();
            jtf.setText(EnterNum);
        } else {
            String EnterNum = jtf.getText() + three.getText();
            jtf.setText(EnterNum);
        }
    }

    public static void setTextFour() {
        if (jtf.getText().equals("0")) {
            String EnterNum = four.getText();
            jtf.setText(EnterNum);
        } else {
            String EnterNum = jtf.getText() + four.getText();
            jtf.setText(EnterNum);
        }
    }

    public static void setTextFive() {
        if (jtf.getText().equals("0")) {
            String EnterNum = five.getText();
            jtf.setText(EnterNum);
        } else {
            String EnterNum = jtf.getText() + five.getText();
            jtf.setText(EnterNum);
        }
    }

    public static void setTextSix() {
        if (jtf.getText().equals("0")) {
            String EnterNum = six.getText();
            jtf.setText(EnterNum);
        } else {
            String EnterNum = jtf.getText() + six.getText();
            jtf.setText(EnterNum);
        }
    }

    public static void setTextSeven() {
        if (jtf.getText().equals("0")) {
            String EnterNum = seven.getText();
            jtf.setText(EnterNum);
        } else {
            String EnterNum = jtf.getText() + seven.getText();
            jtf.setText(EnterNum);
        }
    }

    public static void setTextEight() {
        if (jtf.getText().equals("0")) {
            String EnterNum = eight.getText();
            jtf.setText(EnterNum);
        } else {
            String EnterNum = jtf.getText() + eight.getText();
            jtf.setText(EnterNum);
        }
    }

    public static void setTextNine() {
        if (jtf.getText().equals("0")) {
            String EnterNum = nine.getText();
            jtf.setText(EnterNum);
        } else {
            String EnterNum = jtf.getText() + nine.getText();
            jtf.setText(EnterNum);
        }
    }

    public static void clearText() {
        jtf.setText("0");
        result=0.0;
        calculatedSolution=0.0;
        FirstValve=0.0;
        Lastvalve=0.0;
    }
    
    
    public static void decimalText() {
                String EnterNum =jtf.getText()+ decimal.getText();
                jtf.setText(EnterNum);
            }
    
    
    public static void AddValue() {
                FirstValve=Double.parseDouble(jtf.getText());
                jtf.setText("0");
                operations="+";
              
            }
    
    
    public static void SubstractValue() {
                FirstValve=Double.parseDouble(jtf.getText());
                jtf.setText("0");
                operations="-";
            }
    
    
    public static void DivideValue() {
                FirstValve=Double.parseDouble(jtf.getText());
                jtf.setText("0");
                operations="/";
            }
    
    
    public static void MultiplyValue() {
                FirstValve=Double.parseDouble(jtf.getText());
                jtf.setText("0");
                operations="*";
            }
    
    
    public static void percentageValue() {
                String percentagedsolution = null;
                FirstValve=Double.parseDouble(jtf.getText());
//                jtf.setText("0");
//                operations="%";
                        result=FirstValve/100;
                        percentagedsolution= String.valueOf(result);
                        jtf.setText(percentagedsolution);
                         calculatedSolution=result;
            }
    
    
    public static void rootValue() {
        String String_root;
         
        if(calculatedSolution != 0.0){
        
                calculatedSolution=Double.parseDouble(jtf.getText());
                 double squareRoot=Math.sqrt(calculatedSolution);
                 String_root=String.valueOf(squareRoot);
                 jtf.setText(String_root);
        }else{
        
                FirstValve=Double.parseDouble(jtf.getText());
                 double squareRoot=Math.sqrt(FirstValve);
                 String_root=String.valueOf(squareRoot);
                 jtf.setText(String_root);
    
    } 
}
    
    
    public static void solutionProvided() {
                String solution = null;
                Lastvalve=Double.parseDouble(jtf.getText());
                
                if(operations=="+"){
                         result=FirstValve + Lastvalve;
                         solution= String.valueOf(result);
                         jtf.setText(solution);
                         calculatedSolution=result;
                    
                }else if(operations=="-"){
                    
                         result=FirstValve - Lastvalve;
                         solution= String.valueOf(result);
                         jtf.setText(solution);
                         calculatedSolution=result;
                         
                }else if(operations=="/"){
                    
                        result=FirstValve / Lastvalve;
                        solution= String.valueOf(result);
                         jtf.setText(solution);
                         calculatedSolution=result;
                         
                }else if(operations=="*"){
                    
                        result=FirstValve * Lastvalve;
                        solution= String.valueOf(result);
                        jtf.setText(solution);
                         calculatedSolution=result;
                        
               }//else if(operations=="%"){
//                    
//                        result=(FirstNumber * LastNumber)/100;
//                        solution= String.valueOf(result);
//                        jtf.setText(solution);
//                         calculatedSolution=result;
//                }
                
            }
//operations end
}



//actionListener classes start
class Button0 implements ActionListener {

    public void actionPerformed(ActionEvent ae) {
        test.setTextZero();
    }
}

class Button1 implements ActionListener {

    public void actionPerformed(ActionEvent ae) {
        test.setTextOne();
    }
}

class Button2 implements ActionListener {

    public void actionPerformed(ActionEvent ae) {
        test.setTextTwo();
    }
}

class Button3 implements ActionListener {

    public void actionPerformed(ActionEvent ae) {
        test.setTextThree();
    }
}

class Button4 implements ActionListener {

    public void actionPerformed(ActionEvent ae) {
        test.setTextFour();
    }
}

class Button5 implements ActionListener {

    public void actionPerformed(ActionEvent ae) {
        test.setTextFive();
    }
}

class Button6 implements ActionListener {

    public void actionPerformed(ActionEvent ae) {
        test.setTextSix();

    }
}

class Button7 implements ActionListener {

    public void actionPerformed(ActionEvent ae) {
        test.setTextSeven();
    }
}

class Button8 implements ActionListener {

    public void actionPerformed(ActionEvent ae) {
        test.setTextEight();
    }
}

class Button9 implements ActionListener {

    public void actionPerformed(ActionEvent ae) {
        test.setTextNine();
    }
}

class Clear implements ActionListener {

    public void actionPerformed(ActionEvent ae) {
        test.clearText();
    }
}

class backspace implements ActionListener {

    public void actionPerformed(ActionEvent ae) {
        test.clearText();
    }
}


class backSpace implements ActionListener {

    public void actionPerformed(ActionEvent ae) {
        test.clearText();
    }
}


class Decimal implements ActionListener {

    public void actionPerformed(ActionEvent ae) {
        test.decimalText();
    }
}


class addition implements ActionListener {

    public void actionPerformed(ActionEvent ae) {
        test.AddValue();
    }
}


class substraction implements ActionListener {

    public void actionPerformed(ActionEvent ae) {
        test.SubstractValue();
    }
}


class multiplication implements ActionListener {

    public void actionPerformed(ActionEvent ae) {
        test.MultiplyValue();
    }
}


class division implements ActionListener {

    public void actionPerformed(ActionEvent ae) {
        test.DivideValue();
    }
}


class percentage implements ActionListener {

    public void actionPerformed(ActionEvent ae) {
        test.percentageValue();
    }
}

class solution implements ActionListener {

    public void actionPerformed(ActionEvent ae) {
        test.solutionProvided();
    }
}

class root implements ActionListener {

    public void actionPerformed(ActionEvent ae) {
        test.rootValue();
    }
}
//actionListener classes end
