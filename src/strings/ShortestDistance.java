package strings;

public class ShortestDistance {

    public static void main(String[] args){
        String path = "WNEENESENNN";

        System.out.print(shortestDistance(path));

    }
    public static float shortestDistance(String path){
        
        int x =0, y = 0;
        for(int i = 0; i< path.length(); i++){
            char direction = path.charAt(i);
            
            // South 
            if(direction == 'S'){
                y--;
            }

            //North
            else if(direction == 'N'){
                y++;
            }

            //East
            else if(direction == 'E'){
                x++;
            }

            //West
            else{
                x--;
            }

        }
        int X2 = x*x;
        int Y2 = y*y;

        return (float)Math.sqrt(X2+Y2);
    }
}
