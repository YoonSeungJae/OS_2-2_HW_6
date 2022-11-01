//package opensource;
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//import javax.swing.event.*;
//
//class NorthPanel extends JPanel
//{
//    NorthPanel()
//    {
//        this.setBackground(Color.LIGHT_GRAY);
//        this.setLayout(new FlowLayout());
//        add(new JButton("Open"));
//        add(new JButton("Read"));
//        add(new JButton("Cancel"));
//        
//    }
//}
//
//class CenterPanel extends JPanel
//{
//    CenterPanel()
//    {
//        setLayout(null);
//        
//        JLabel a =new JLabel("Hello");
//        JLabel b =new JLabel("java");
//        JLabel c =new JLabel("love");
//        
//        a.setBounds(00,200,50,20);
//        b.setBounds(100,100,50,20);
//        c.setBounds(150,150,50,20);
//        
//        add(a);
//        add(b);
//        add(c);
//    }
//}
//
//class ExFrame extends JFrame
//{
//    ExFrame()
//    {
//        this.setTitle("Open Challenge 9");
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        
//        NorthPanel np =new NorthPanel();
//        CenterPanel cp =new CenterPanel();
//        
//        add(np, BorderLayout.NORTH);
//        add(cp, BorderLayout.CENTER);
//        
//        this.setSize(300,300);
//        this.setVisible(true);
//    }
//}
//public class OP9 
//{
//
//    public static void main(String[] args) 
//    {
//        new ExFrame();
//    }
//    
//}