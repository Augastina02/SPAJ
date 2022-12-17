import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class bmrcc extends JFrame
{
      JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
      JTextField  t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
      JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
      boolean male;
      char genderchar;
      boolean none=false;
      boolean light=false;
      boolean moderately=false;
      boolean intensely=false;
      boolean five;
      bmrcc()
      {
           setDefaultCloseOperation(EXIT_ON_CLOSE);
           setLayout(null);

           b1=new JButton("enter");
           b2=new JButton("");
           b1.setBounds(310,300,80,40);
           l1=new JLabel("weight");
           l1.setBounds(320,100,60,40);
           add(l1);
           t1=new JTextField();
           t2=new JTextField();
           t3=new JTextField();
           t4=new JTextField();
           t5=new JTextField();
           t1.setBounds(400,110,60,30);
           
  t2.setBounds(400,150,60,30);
           
  t3.setBounds(400,190,60,30);
           
  t4.setBounds(400,230,60,30);
           
  t5.setBounds(660,180,60,30);

           
           add(t1);
            add(t3);
           add(t4);
           add(t5);
           l2=new JLabel("height");
           l3=new JLabel("age");
           l4=new JLabel("gender");
           l5=new JLabel("BMI");
           l6=new JLabel("select level of excercise");
           l2.setBounds(320,140,60,40);
           
  l3.setBounds(320,180,60,40);
           
  l4.setBounds(320,220,60,40);
           
  l5.setBounds(600,160,70,60);
           l6.setBounds(370,400,200,70);
           

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

class bmr
{
      public static void main(String[] args)
      {
            bmrcc b=new bmrcc();
            b.setBounds(400,200,200,250);
            b.setVisible(true);
   b.getContentPane().setBackground(Color.LIGHT_GRAY);
   
      }
}