    import java.awt.*; //add in all awt library
    import javax.swing.*; //add in all swing library
    import java.awt.event.*;
    import java.util.*;
    import java.applet.Applet;
        import java.applet.AudioClip;
        import java.net.URL;
        import javax.swing.BorderFactory; 
        import javax.swing.border.Border;
        import javax.swing.border.TitledBorder;
        import javax.swing.border.EtchedBorder;
        import java.util.concurrent.TimeUnit;
        import java.applet.Applet;
import java.applet.AudioClip;
        /**
         * Write a description of class UFC here.
         *
         * @author (your name)
         * @version (a version number or a date)
         */
        public class UFC extends MouseAdapter implements ActionListener
        {
            // instance variables - replace the example below with your own
            
            private JTextArea textDisplay;
            ImageIcon ufcIcon;
            ImageIcon conorpic;
            ImageIcon conor1;
            ImageIcon conor2;
            ImageIcon kabibpic;
            Dimension iconsize;
            ImageIcon strikeIcon;
            ImageIcon kickIcon;
            ImageIcon net1;
            ImageIcon net2;
            ImageIcon cross;
            ImageIcon takedown;
            ImageIcon conorwin;
            ImageIcon natewin;
            ImageIcon winnerIcon;
            JLabel labeltop;
            JLabel labelmidleft;
            JLabel labelmidright;
            JTextArea textArea1;
            JTextArea textArea2;
            private int rountNum;
            Fighter f1;
            Fighter f2;
            Boolean hasWinner;
            Random ran;
            JButton Strike;
            JButton Kick ;
            JButton f2cross;
            JButton f2takedown;
            int win = 0;
            int roundNum;
            private String player;
            AudioClip pounch; //sound audio we need
    
            AudioClip pounch1;
    
            AudioClip pounch2;
            
            AudioClip cheer;
            private JMenuItem reStart;
            /**
             * Constructor for objects of class UFC extends Mous
             */
            public UFC()
            {
            // initialise instance variables
            f1 = new Fighter("conor mcgregor ");
            f2 = new Fighter("nate diaz");
            player = "f1";
            hasWinner = false;
            JFrame frame = new JFrame ("UFC");
            
            frame.setSize (1000, 800);
            ran = new Random();
            Container contentPane = frame. getContentPane();
            
            roundNum = 1;
            TitledBorder titlebotleft;
            TitledBorder titlebotright;
            titlebotleft = BorderFactory.createTitledBorder("Fighter1 Action");
            titlebotright = BorderFactory.createTitledBorder("Fighter2 Action");
            titlebotleft.setTitleJustification(titlebotleft.LEFT);
            titlebotright.setTitleJustification(titlebotright.LEFT);
            
            //All pane we need
            JPanel panetop = new JPanel();
            JPanel panetopright = new JPanel();
            JPanel panetopleft = new JPanel ();
            JPanel panecen = new JPanel();
            JPanel panebot = new JPanel();
            JPanel panecenleft = new JPanel();
            JPanel panecenmid = new JPanel();
            JPanel panecenright = new JPanel();
            JPanel panebotleft = new JPanel();
            JPanel panebotright = new JPanel();
            
            JMenuBar menubar = new JMenuBar(); 
            frame.setJMenuBar(menubar); 
            JMenu fileMenu = new JMenu("Options");
            menubar.add(fileMenu); 
            fileMenu.addMouseListener(this);
            reStart = new JMenuItem("New");
            fileMenu.add(reStart);
            reStart.addActionListener(this);
            //JButton
            kickIcon = new ImageIcon("kick.png");
            strikeIcon = new ImageIcon("jab.png");
            net1 = new ImageIcon("netgetkick.jfif");
            net2 = new ImageIcon("net3.jfif");
            conor1 = new ImageIcon("conor1.jfif");
            conor2 = new ImageIcon("conor2.jfif");
            takedown = new ImageIcon("takedown.jpg");
            cross = new ImageIcon("cross.png");
            conorwin = new ImageIcon("conorwin.jpg");
            natewin = new ImageIcon("nnwinwin.jpg");
            conorwin=new ImageIcon(conorwin.getImage().getScaledInstance(320,250,Image.SCALE_SMOOTH));
            natewin=new ImageIcon(natewin.getImage().getScaledInstance(300,200,Image.SCALE_SMOOTH));
            cross=new ImageIcon(cross.getImage().getScaledInstance(160,160,Image.SCALE_SMOOTH));
            takedown=new ImageIcon(takedown.getImage().getScaledInstance(200,200,Image.SCALE_SMOOTH));
            kickIcon=new ImageIcon(kickIcon.getImage().getScaledInstance(158,158,Image.SCALE_SMOOTH));
            strikeIcon=new ImageIcon(strikeIcon.getImage().getScaledInstance(160,160,Image.SCALE_SMOOTH));
            Strike = new JButton(strikeIcon);
            Kick = new JButton (kickIcon);
            f2cross = new JButton(cross);
            f2takedown = new JButton(takedown);
            //Strike.addActionListener(this);
            //Kick.addActionListener(this);
            Strike.setPreferredSize(new Dimension(160,160));
            Kick.setPreferredSize(new Dimension(160,160));
            f2cross.setPreferredSize(new Dimension(160,160));
            f2takedown.setPreferredSize(new Dimension(160,160));
            //Strike.setEnabled(false);
            //Kick.setEnabled(false);
            Strike.addActionListener(this);
            Kick.addActionListener(this);
            f2cross.addActionListener(this);
            f2takedown.addActionListener(this);
            
            
            
            //Panetop
            
            ufcIcon = new ImageIcon("ufcpic.png");
            iconsize = new Dimension(100,500);
            labeltop = new JLabel();
            labeltop.setIcon(ufcIcon);
            winnerIcon = new ImageIcon("ufcwin.jfif");
            
            textArea1 = new JTextArea(5,10);
            textArea1.setEditable(false);
            textArea1.setFont(new Font(null, Font.BOLD, 20));
            
            
            textArea1.setText("\n"+f1.toString());
            
            textArea2 = new JTextArea(5,15);
            textArea2.setEditable(false);
            textArea2.setFont(new Font(null, Font.BOLD, 20));
            //textArea1.setBackground(Color.ORANGE);
            textArea1.setForeground(Color.RED);
            textArea2.setForeground(Color.RED);
            
            textArea2.setText("\n"+f2.toString());
            
            //labeltop.setPreferredSize(new Dimension(800,100));
            panetop.add(textArea1);
            
            panetop.add(labeltop);
            panetop.add(textArea2);
            panetop.setPreferredSize(new Dimension(800,70));
            //Panecen
            
            conorpic = new ImageIcon("conorpic.jfif");
            kabibpic = new ImageIcon("net.jfif");
            
            textDisplay = new JTextArea(500,40);
            JScrollPane pane = new JScrollPane(textDisplay);
            textDisplay.setEditable(false);
            textDisplay.setFont(new Font(null, Font.BOLD, 15)); // bold 15pt font
            //textDisplay.setText(this.displayString());
            textDisplay.setForeground(Color.RED);
            
            textDisplay.append("\n------------------Welcome to UFC world----------------------");
            textDisplay.append("\n---------------------Pick your move!----------------------");
            //textDisplay.setForeground(Color.BLACK);
            
            textDisplay.append("\n\n-------------------------Action 1--------------------------");
            textDisplay.append("\n---------------Low damage High success-----------------");
            textDisplay.append("\n-------------------------Action 2-----------------------------");
            textDisplay.append("\n---------------High damage Low success---------------");
            textDisplay.append(displayString());
            
            textDisplay.setPreferredSize(new Dimension(50,100));
            textDisplay.setCaretPosition(textDisplay.getDocument().getLength());
            labelmidleft = new JLabel();
            labelmidright = new JLabel();
            labelmidleft.setIcon(conorpic);
            
            labelmidright.setIcon(kabibpic);
           
            panecen.setLayout(new GridLayout(1,3));
            panecen.add(labelmidleft);
            panecen.add(pane);
            panecen.add(labelmidright);
            panecen.setPreferredSize(new Dimension(800,130));
            //panebot
            
            panebotleft.setBorder(titlebotleft);
            panebotright.setBorder(titlebotright);
            panebot.setPreferredSize(new Dimension(800,50));
            panebot.add(panebotleft);
            panebot.add(panebotright);
            panebotleft.setPreferredSize(new Dimension(400,200));
            panebotright.setPreferredSize(new Dimension(400,200));
            
            panebotleft.add(Strike);
            panebotleft.add(Kick);
            panebotright.add(f2cross);
            panebotright.add(f2takedown);
            //contentPaneadd
            contentPane.add(panetop);
            contentPane.add(panecen);
            contentPane.add(panebot);
            contentPane.setLayout(new BoxLayout(contentPane,BoxLayout.Y_AXIS));
            
           
           URL urlClick = UFC.class.getResource("tong.wav"); //adding sound
            pounch = Applet.newAudioClip(urlClick);
            
            URL urlClick1 = UFC.class.getResource("ding.wav"); //adding sound
            pounch1 = Applet.newAudioClip(urlClick1);
            
            URL urlClick2 = UFC.class.getResource("kicksound.wav"); //adding sound
            pounch2 = Applet.newAudioClip(urlClick2);
            
            URL urlClick3 = UFC.class.getResource("cheer.wav"); //adding sound
            cheer = Applet.newAudioClip(urlClick3);
            
            
            
            pounch1.play();
            
            frame.setResizable(false);
            frame.setVisible(true);
            
            
            
           }
        
        public void actionPerformed(ActionEvent e)
        {
                    
                    Object o = e.getSource();
        if(o instanceof JButton)
        {
           
            String skick = "Conor big rear kick!\n----------------------------\n";
            String sstrike = "Conor did a Jab!\n----------------------------\n";
            JButton button = (JButton) o;
            if(button.equals(Kick))
            {
                Kick.setEnabled(false);
                Strike.setEnabled(false);
                if(ran.nextInt(10)>4)
                {
                
                labelmidright.setIcon(net1);
                f2.getDamage(f1.getStrik());
                textDisplay.append(displayString());
                textDisplay.append(skick);
                 f2takedown.setEnabled(true);
                f2cross.setEnabled(true);
                player = "f1";
                labelmidleft.setIcon(conorpic);
                pounch2.play();
                winner();
                
            }
            else
            {
                textDisplay.append(displayString());
                textDisplay.append("Kick missed!\n");
                textDisplay.append("----------------------------\n");
                 f2takedown.setEnabled(true);
                f2cross.setEnabled(true);
            }
            textArea1.setText("\n"+f1.toString());
            textArea2.setText("\n"+f2.toString());
            }
            
            if(button.equals(Strike))
            {
                Kick.setEnabled(false);
                Strike.setEnabled(false);
                if(ran.nextInt(10)>2)
                {
                pounch.play();
                labelmidright.setIcon(net2);
                f2.getDamage(f1.getspeed());
                textDisplay.append(displayString());
                textDisplay.append(sstrike);
                player = "f1";
                
                f2takedown.setEnabled(true);
                f2cross.setEnabled(true);
                labelmidleft.setIcon(conorpic);
                winner();
            }
            else
            {
                textDisplay.append(displayString());
                textDisplay.append("Jab missed!\n");
                textDisplay.append("----------------------------\n");
                f2takedown.setEnabled(true);
                f2cross.setEnabled(true);
            }
            
            textArea1.setText("\n"+f1.toString());
            textArea2.setText("\n"+f2.toString());
        }
        if(button.equals(f2takedown))
            {
                f2takedown.setEnabled(false);
                f2cross.setEnabled(false);
                if(ran.nextInt(10)>4)
                {
                
                labelmidright.setIcon(kabibpic);
                f1.getDamage(f2.getStrik());
                textDisplay.append(displayString());
                textDisplay.append("Nate did a takedown!\n");
                textDisplay.append("----------------------------\n");
                player = "f2";
                Kick.setEnabled(true);
                Strike.setEnabled(true);
                labelmidleft.setIcon(conor1);
                pounch2.play();
                winner();
                
            }
            else
            {
                textDisplay.append(displayString());
                textDisplay.append("Takedown failed!\n");
                textDisplay.append("----------------------------\n");
                Kick.setEnabled(true);
                Strike.setEnabled(true);
            }
            textArea1.setText("\n"+f1.toString());
            textArea2.setText("\n"+f2.toString());
             
        }
        if(button.equals(f2cross))
            {
                
                f2takedown.setEnabled(false);
                f2cross.setEnabled(false);
                if(ran.nextInt(10)>2)
                {
                    pounch.play();
                 f2takedown.setEnabled(false);
                 f2cross.setEnabled(false);
                labelmidright.setIcon(kabibpic);
                f1.getDamage(f2.getspeed());
                textDisplay.append(displayString());
                textDisplay.append("Nate! Cross to the face!\n");
                textDisplay.append("----------------------------\n");
                player = "f2";
                Kick.setEnabled(true);
                Strike.setEnabled(true);
                labelmidleft.setIcon(conor2);
                winner();
                
            }
            else
            {
                textDisplay.append(displayString());
                textDisplay.append("Nate Cross missed!\n");
                textDisplay.append("----------------------------\n");
                Kick.setEnabled(true);
                Strike.setEnabled(true);
            }
            textArea1.setText("\n"+f1.toString());
            textArea2.setText("\n"+f2.toString());
            
        }
    }
     else { // it's a JMenuItem
            
            JMenuItem item = (JMenuItem)o;
            
            if (item == reStart) { // reset
                
                f1 = new Fighter("conor mcgregor ");
                f2 = new Fighter("nate diaz");
                labelmidright.setIcon(kabibpic);
                labelmidleft.setIcon(conorpic);
                textArea1.setText("\n"+f1.toString());
                textArea2.setText("\n"+f2.toString());
                pounch1.play();
                f2cross.setEnabled(true);
                f2takedown.setEnabled(true);
            Kick.setEnabled(true);
            labeltop.setIcon(ufcIcon);
            Strike.setEnabled(true);
                textDisplay.setText("\n\n");
                textDisplay.append("\n------------------Welcome to UFC world----------------------");
            textDisplay.append("\n------------------------Start FIght!----------------------");
            } 
        }
}
   
    public String displayString()
    {
       // String s;
        //s="Conor  From the Red Corner:\n";
       // s+=f1.toString()+"\n";
       // s+="Nate From the Blue Corner:\n";
        //s+=f2.toString()+"";
       String s="\n";
        return s;
        
        
    }
    
    public Boolean winner()
    {
        if(f1.getHealth()<=0 || f2.getHealth()<=0)
        {
            if(player.equals("f1"))
            {
            hasWinner = true;
            textDisplay.append("------------------------------------------------------------------------------\n");
            textDisplay.append("Conor the new Light Weight Campion\n");
            textDisplay.append("------------------------------------------------------------------------------\n");
            f2cross.setEnabled(false);
            f2takedown.setEnabled(false);
            Kick.setEnabled(false);
            Strike.setEnabled(false);
            labelmidleft.setIcon(conorwin);
            labelmidright.setIcon(conorwin);
            labeltop.setIcon(winnerIcon);
            cheer.play();
        }
        else{
            hasWinner = true;
            textDisplay.append("------------------------------------------------------------------------------\n");
            textDisplay.append("Nate the new Light Weight Campion\n");
            textDisplay.append("------------------------------------------------------------------------------\n");
            f2cross.setEnabled(false);
            f2takedown.setEnabled(false);
            Kick.setEnabled(false);
            Strike.setEnabled(false);
            labelmidleft.setIcon(natewin);
            labelmidright.setIcon(natewin);
            labeltop.setIcon(winnerIcon);
        
        }
        textArea1.setText("\n"+f1.toString());
            textArea2.setText("\n"+f2.toString());
        return hasWinner;
    }
    return hasWinner;
}
}
