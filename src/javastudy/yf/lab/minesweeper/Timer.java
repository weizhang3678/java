package javastudy.yf.lab.minesweeper;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Timer implements Runnable							
{
    private int time;													

    JPanel panel1;												
    JTextField TimerField;										
    Thread TimerThread;											

    public Timer(JFrame frame)									
    {
        time = 0;
        this.panel1 = (JPanel)frame.getContentPane();			

        JLabel labelTime = new JLabel("用 时:");					
        labelTime.setHorizontalAlignment(JLabel.CENTER);
        labelTime.setFocusable(false);
        panel1.add(labelTime);									

        TimerField = new JTextField("0");						
        TimerField.setHorizontalAlignment(JTextField.CENTER);
        TimerField.setEditable(false);
        TimerField.setFocusable(false);
        panel1.add(TimerField);									

        TimerThread = new Thread(this,"TimerThread");			
        TimerThread.start();									
    }

    public void ResetTimer()									
    {
        time = 0;
        TimerField.setText(String.valueOf(time));
    }

    public int getTime()
    {
        return time;
    }

    @Override
    public void run()											
    {
        // TODO 自动生成的方法存根
        while(true)
        {
            try
            {
                Thread.sleep(1000);								
                time += 1;										
                TimerField.setText(String.valueOf(time));		
            }
            catch (InterruptedException e)
            {
                TimerField.setText("interrupted.");				
            }
        }
    }
}
