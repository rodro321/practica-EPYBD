
public class laberinto
{
    private String [][] maze ={{"S","*","?","?","?"},
                               {"?","*","*","*","*"},
                               {"?","?","*","?","*"},
                               {"?","?","*","?","*"},
                               {"?","?","*","*","E"}};
    private int x,y;
    // Norte = X-1, y
    //Sur = x+1 , y
    //Este = x, y-1
    //Oeste = x, y+1
    public  boolean puedoSalir(){
        x = 0;
        y = 0;
        return puedoSalir(x,y,maze);
    }
    
    private boolean puedoSalir(int x ,int y,String [][] maze){
        boolean res;
        if(validar(x,y)){
            if(maze[x][y].equals("?")|| maze[x][y].equals("C")){
                res = false;
            }else{
                // C es mi marca por donde pasa el raton
                if(maze[x][y].equals("E")){
                    res = true;
                }else{
                    maze[x][y] = "C";
                    //camino al norte
                    res = true;
                    if(!puedoSalir(x-1,y,maze)){
                        //camino al este
                        if(!puedoSalir(x,y-1, maze)){
                            //camino al sur
                            if(!puedoSalir(x+1,y,maze)){
                                //camino al oeste
                                if(!puedoSalir(x,y+1,maze)){
                                    res = false;
                                }
                            }
                        }
                    }
                }
            }
        }else{
            res = false;
        }
        return res;
    }
    
    //verifica que el raton no se salga del laberinto
    boolean validar(int x, int y){
        boolean res;
        if(x < 0 || y < 0 || x > maze.length - 1 || y > maze[x].length-1){
            res = false;
        }else{
            res = true;
        }
        return res;
    }
}
