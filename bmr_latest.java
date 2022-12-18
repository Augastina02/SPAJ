import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class bmr extends JFrame
{
   JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
   JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
   JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,tcal;
   boolean male,male2;
   char genderchar,genderchar2;
   boolean none=false;
   boolean light=false;
   boolean moderately=false;
   boolean intensely=false;
   boolean five;
 
   bmr()
   {
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(null);
            //Container c=frame.getContentPane();

            b1=new JButton("Enter");
            b2=new JButton("None");
            b3=new JButton("Light");
            b4=new JButton("Moderate");
            b5=new JButton("Intense");
            b6=new JButton("Heavy");
   

           b1.setBounds(500,260,80,40);
           b2.setBounds(350,380,80,40);
           b3.setBounds(500,380,80,40);
           b4.setBounds(650,380,150,40);
           b5.setBounds(440,440,80,40);
           b6.setBounds(600,440,80,40);
       

           add(b1);
           add(b2);
           add(b3);
           add(b4);
           add(b5);
           add(b6);
         //  add(b7);
   l11 = new JLabel("CALORIE CALCULATOR");
           l1=new JLabel("Height");
           l2=new JLabel("Weight");
           l3=new JLabel("Age");
           l4=new JLabel("Gender");
           l5=new JLabel("BMR");
           l6=new JLabel("SELECT YOUR EXCERCISE:");
           l7=new JLabel("CALORIE");
   l11.setBounds(400,10,400,100);
           l1.setBounds(320,100,60,40);
           l2.setBounds(600,100,60,40);
           l3.setBounds(320,180,60,40);
           l4.setBounds(600,180,60,40);
           l5.setBounds(620,250,70,60);
           l6.setBounds(400,300,200,70);
           l7.setBounds(520,480,200,70);

            l11.setFont(new Font("Arial",Font.PLAIN,30));
           // tcal.setFont(new Font("Arial",Font.PLAIN,20));
           
            add(l1);
            add(l2);
            add(l3);
            add(l4);
            add(l5);
            add(l6);
            add(l7);
    add(l11);

           t1=new JTextField();
           t2=new JTextField();
           t3=new JTextField();
           t4=new JTextField();
           t5=new JTextField();
           t6=new JTextField();
           t7=new JTextField();
           tcal=new JTextField();

           
           t1.setBounds(400,110,60,30);
           t2.setBounds(650,110,60,30);
           t3.setBounds(400,190,60,30);
           t4.setBounds(650,190,60,30);
           t5.setBounds(650,260,150,30);
           //t6.setBounds();
           t7.setBounds(580,500,150,30);
           tcal.setBounds(450,540,400,40);

            add(t1);
            add(t2);
            add(t3);
            add(t4);
            add(t5);
            //add(t6);
            add(t7);
            add(tcal);

            t4.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                String s1=t4.getText();
               
            }});

          male=genderchar=='M';
          male2=genderchar2=='m';
           if(genderchar=='M' || genderchar2=='m')
           //if(t4.getText()=='m')
           {
                     b1.addActionListener(new ActionListener(){
                      public void actionPerformed(ActionEvent ae){
                      int weight=Integer.parseInt(t2.getText());
                      int height=Integer.parseInt(t1.getText());
                      int age=Integer.parseInt(t3.getText());
                      double v=(66+(6.23*weight)+(12.7*height)-(6.8*age));
                      t5.setText(""+v);
                      //tcal.setText("YOUR DAILY CALORIE NEEDS IS "+v);
                     }});

                              b2.addActionListener(new ActionListener(){
                      public void actionPerformed(ActionEvent ae){
                      int weight=Integer.parseInt(t2.getText());
                      int height=Integer.parseInt(t1.getText());
                      int age=Integer.parseInt(t3.getText());
                      double v=(66+(6.23*weight)+(12.7*height)-(6.8*age));
                      double cal=v*1.2;
                      t7.setText(""+cal);
                      tcal.setText("YOUR DAILY CALORIE NEEDS IS "+cal);
                     }});
       
                       
                         b3.addActionListener(new ActionListener(){
                      public void actionPerformed(ActionEvent ae){
                      int weight=Integer.parseInt(t2.getText());
                      int height=Integer.parseInt(t1.getText());
                      int age=Integer.parseInt(t3.getText());
                      double v=(66+(6.23*weight)+(12.7*height)-(6.8*age));
                      double cal=1.375*v;
                      t7.setText(""+cal);
                       tcal.setText("YOUR DAILY CALORIE NEEDS IS "+cal);
                     }});

                          b4.addActionListener(new ActionListener(){
                      public void actionPerformed(ActionEvent ae){
                      int weight=Integer.parseInt(t2.getText());
                      int height=Integer.parseInt(t1.getText());
                      int age=Integer.parseInt(t3.getText());
                      double v=(66+(6.23*weight)+(12.7*height)-(6.8*age));
                      double cal=1.55*v;
                      t7.setText(""+cal);
                      tcal.setText("YOUR DAILY CALORIE NEEDS IS "+cal);
                     }});
           
                             b5.addActionListener(new ActionListener(){
                      public void actionPerformed(ActionEvent ae){
                      int weight=Integer.parseInt(t2.getText());
                      int height=Integer.parseInt(t1.getText());
                      int age=Integer.parseInt(t3.getText());
                      double v=(66+(6.23*weight)+(12.7*height)-(6.8*age));
                      double cal=1.725*v;
                      t7.setText(""+cal);
                      tcal.setText("YOUR DAILY CALORIE NEEDS IS "+cal);
                     }});
               
                               b6.addActionListener(new ActionListener(){
                      public void actionPerformed(ActionEvent ae){
                      int weight=Integer.parseInt(t2.getText());
                      int height=Integer.parseInt(t1.getText());
                      int age=Integer.parseInt(t3.getText());
                      double v=(66+(6.23*weight)+(12.7*height)-(6.8*age));
                      double cal=1.9*v;
                      t7.setText(""+cal);
                       tcal.setText("YOUR DAILY CALORIE NEEDS IS "+cal);
                     }});

           }
           else
           {
                         b1.addActionListener(new ActionListener(){
                      public void actionPerformed(ActionEvent ae){
                      int weight=Integer.parseInt(t2.getText());
                      int height=Integer.parseInt(t1.getText());
                      int age=Integer.parseInt(t3.getText());
                      double v=(665+(4.35*weight)+(4.7*height)-(4.7*age));
                      t5.setText(""+v);
                     }});
          // }

                     
                         b2.addActionListener(new ActionListener(){
                      public void actionPerformed(ActionEvent ae){
                      int weight=Integer.parseInt(t2.getText());
                      int height=Integer.parseInt(t1.getText());
                      int age=Integer.parseInt(t3.getText());
                      double v=(665+(4.35*weight)+(4.7*height)-(4.7*age));
                      double cal=v*1.2;
                      t7.setText(""+cal);
                      tcal.setText("YOUR DAILY CALORIE NEEDS IS "+cal);
                     }});
       
                       
                         b3.addActionListener(new ActionListener(){
                      public void actionPerformed(ActionEvent ae){
                      int weight=Integer.parseInt(t2.getText());
                      int height=Integer.parseInt(t1.getText());
                      int age=Integer.parseInt(t3.getText());
                      double v=(665+(4.35*weight)+(4.7*height)-(4.7*age));
                      double cal=1.375*v;
                      t7.setText(""+cal);
                       tcal.setText("YOUR DAILY CALORIE NEEDS IS "+cal);
                     }});

                          b4.addActionListener(new ActionListener(){
                      public void actionPerformed(ActionEvent ae){
                      int weight=Integer.parseInt(t2.getText());
                      int height=Integer.parseInt(t1.getText());
                      int age=Integer.parseInt(t3.getText());
                      double v=(665+(4.35*weight)+(4.7*height)-(4.7*age));
                      double cal=1.55*v;
                      t7.setText(""+cal);
                      tcal.setText("YOUR DAILY CALORIE NEEDS IS "+cal);
                     }});
           
                             b5.addActionListener(new ActionListener(){
                      public void actionPerformed(ActionEvent ae){
                      int weight=Integer.parseInt(t2.getText());
                      int height=Integer.parseInt(t1.getText());
                      int age=Integer.parseInt(t3.getText());
                      double v=(665+(4.35*weight)+(4.7*height)-(4.7*age));
                      double cal=1.725*v;
                      t7.setText(""+cal);
                      tcal.setText("YOUR DAILY CALORIE NEEDS IS "+cal);
                     }});
               
                               b6.addActionListener(new ActionListener(){
                      public void actionPerformed(ActionEvent ae){
                      int weight=Integer.parseInt(t2.getText());
                      int height=Integer.parseInt(t1.getText());
                      int age=Integer.parseInt(t3.getText());
                      double v=(665+(4.35*weight)+(4.7*height)-(4.7*age));
                      double cal=1.9*v;
                      t7.setText(""+cal);
                      tcal.setText("YOUR DAILY CALORIE NEEDS IS "+cal);
                     }});
           }
           
}
}

class bmr_latest
{
    public static void main(String[]args)
    {
         bmr b=new bmr();
         b.setBounds(800,600,600,650);
          Container c=b.getContentPane();

         b.setTitle("CALORIE CALCULATOR");
  b.getContentPane().setBackground(Color.LIGHT_GRAY);
   b.setVisible(true);
    }
}