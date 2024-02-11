
public class Rotator {
    
    public Object[] rotate(Object[] number, int value){ 

        Object arrayHolder[]=number;
        int arrayLength=number.length;
        Object tempHolder[]= new Object[arrayHolder.length];

        while (value!=0) {

            if(value>0){
                tempHolder[0]=arrayHolder[arrayLength-1];
                for(int index=1; index<arrayLength; index++){
                    tempHolder[index]=arrayHolder[index-1];
                }
                value--;
            }
            else if(value<0){
                tempHolder[arrayLength-1]=arrayHolder[0];
                for(int index=0; index+1<arrayLength; index++){
                    tempHolder[index]=arrayHolder[index+1];
                }
                value++;
            }
            for (int index=0;index<arrayLength; index++) {
                arrayHolder[index]=tempHolder[index];
                
            }
            
        }
        return arrayHolder;
    }
}
