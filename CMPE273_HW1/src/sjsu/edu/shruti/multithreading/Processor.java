package sjsu.edu.shruti.multithreading;

import java.text.SimpleDateFormat;
import java.util.Date;


class Processor implements Runnable
{
    private String name;

    public String getName() {
		return name;
	}
	Processor(String name)
    {
        this.name="Processor "+name;
    }
    @Override
    public void run()
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        String time = simpleDateFormat.format(date);
        System.out.println(this.name + " Starting : " + time);
        try
        {
        	Thread.sleep(5000);
        }
       catch (InterruptedException ignored) 
        {
    	   System.out.println("Thread interrupted.");
        }
        date = new Date();
        time = simpleDateFormat.format(date);
        System.out.println(this.name + " Completed : " + time);
    }
}