
/**
 * Write a description of class PuedoGenerar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PuedoGenerar
{
    
    public boolean puedoGenerar(String [] a,String x){
        int i = 0;
        int j = 0;
        return puedoGenerar(a,x,i, j);
    }
    
    private boolean puedoGenerar(String [] a,String x,int i , int j){
        boolean res;
        if(a.length > x.length()){
            if(j < x.length()-1 && a[i].charAt(0) == x.charAt(j)){
                res = puedoGenerar(a,x,i+1,j+1);
            }else{
                if(a[i].charAt(0) == x.charAt(j)){
                    res = true;
                }else{
                    res = false;
                }
            }
        }else{
            res = false;
        }
        return res;
    }
    
}
