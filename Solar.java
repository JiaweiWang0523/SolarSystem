package solar;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
/**
 * @author Jiacheng Gao, Jiawei Wang
 */
public class Solar {
public static void Solarsystem() throws Exception{
        FileReader fr = new FileReader("solarsystem.dat");
        BufferedReader br = new BufferedReader(fr);
        String line;
        ArrayList<Double> a = new ArrayList<>();
        int i = 1;
        while((line = br.readLine()) != null){
            String[] data = line.split("\\s+");
            if(i == 2||i == 4||i == 5||i == 6){
                a.add(Double.parseDouble(data[4]));
                a.add(Double.parseDouble(data[5]));
                double mean = 0 ;
                double sum = 0;
                for(int x=0;x<a.size();x++){
                    sum += a.get(x);
                    mean = sum/2;
                }
            System.out.println("Name of the body: " + data[0] + "; What it orbits: " + data[1] + "; Mass: " 
            + data[2] + "kg" +  "; Diameter: " + data[3] + "m" + "; Mean distance from what it orbits: " + mean + "m");    
            } 
            i++;
        }
        br.close();
    }
    public static void main(String[] args) throws Exception {
       Solarsystem();
    }
    
}
