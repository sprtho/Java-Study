package javaStudy;

public class Bus implements Runnable {

    String str;
    
    public Bus(String str) {
        this.str = str;
    }
    
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.println(str);
            
            try {
                Thread.sleep((i+1) * 1000);
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }
        
    }

}


