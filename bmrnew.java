import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class bmr extends JFrame
{
      JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
      JTextField  t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
      JButton b1,b2,b3,b4,b5,b6,b7,b9,b10;
      boolean male;
      char genderchar;
      boolean none=false;
      boolean light=false;
      boolean moderately=false;
      boolean intensely=false;
      boolean five;
      bmr()
      {
           setDefaultCloseOperation(EXIT_ON_CLOSE);
           setLayout(null);

           b1=new JButton("enter");
           b2=new JButton("");
           b1.setBounds(110,130,80,40);
           l1=new JLabel("weight");
           l1.setBounds(60,10,50,30);
           add(l1);
           t1=new JTextField();
           t2=new JTextField();
           t3=new JTextField();
           t4=new JTextField();
           t5=new JTextField();
           
           t1.setBounds(110,10,60,30);
           t2.setBounds(110,40,60,30);
           t3.setBounds(110,70,60,30);
           t4.setBounds(110,100,60,30);
           t5.setBounds(260,45,60,30);
           add(t1);
            add(t3);
           add(t4);
           add(t5);
           l2=new JLabel("height");
           l3=new JLabel("age");
           l4=new JLabel("gender");
           l5=new JLabel("BMI");
           l6=new JLabel("select level of excercise");
           l2.setBounds(60,40,50,30);
           l3.setBounds(60,70,50,30);
           l4.setBounds(60,100,50,30);
            l5.setBounds(200,45,60,40);
           l6.setBounds(170,220,200,70);
           

            add(b1);
            add(l2);
            add(t2);
            add(l3);
            add(l4);
            add(l5);
            add(l6);



         
           t4.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                String s1=t4.getText();
                // t5.setText(""+(66+(6.23*weight)+(12.7*height)-(6.8*age)));
               
               }} );
           male=genderchar=='M';


         

           if(male)
           {

           b1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                int weight=Integer.parseInt(t1.getText());
                int height=Integer.parseInt(t2.getText());
                int age=Integer.parseInt(t3.getText());
                double v=(66+(6.23*weight)+(12.7*height)-(6.8*age));
                 t5.setText(""+ v/*(66+(6.23*weight)+(12.7*height)-(6.8*age))*/);
               
               }} );
           
          }
          else
          {
                    b1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                int weight=Integer.parseInt(t1.getText());
                int height=Integer.parseInt(t2.getText());
                int age=Integer.parseInt(t3.getText());
                double v=(665+(4.35*weight)+(4.7*height)-(4.7*age));
                 t5.setText(""+v/*(665+(4.35*weight)+(4.7*height)-(4.7*age))*/);
               
               }} );
           
          }
     //     if(none)
       //   {
         //     double cal=(v*1.2);
         // }
      }
     
}

class bmrnew
{
      public static void main(String[]args)
      {
            bmr b=new bmr();
            b.setBounds(400,200,200,250);
            b.setVisible(true);
      }
}
