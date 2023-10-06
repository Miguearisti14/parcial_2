public class parcial_2 {   
    
    static int numPisos(){

    }

    public static void main(String[] args) {
        int numHoteles = (int) (Math.random()*7+1);
        
        int[] numeroPisos = new int[numHoteles];
        for (int i = 0; i < numeroPisos.length; i++) {
            numeroPisos[i] = (int) (Math.random()*12+3);
            
        }

        int[] tipoLuces = new int[numHoteles];
        for (int i = 0; i < tipoLuces.length; i++) {
            tipoLuces[i] = (int) (Math.random()*3+1);
            
        }

        int[] horasLuces = new int[numHoteles];
        for (int i = 0; i < horasLuces.length; i++) {
            horasLuces[i] = (int) (Math.random()*23+1);
            
        }

        for (int i = 0; i < horasLuces.length; i++) {
            System.out.println("Hotel " + (i+1) + ". Cantidad de horas encendidad: " + horasLuces[i]);
        }
        






    } 

        
        


        

       
    
}
