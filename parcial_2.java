public class parcial_2 {   
    

    public static void main(String[] args) {

        //*Cantidad de hoteles */
        int numHoteles = (int) (Math.random()*7+1);
        
        //*Arrays de numero de pisos, tipo de luces y horas que estuvieron encendidas */
        //*Ciclos para llenar con randoms */
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


        //*Ciclo para imprimir tiempo que estuvieron encendidas */
        for (int i = 0; i < horasLuces.length; i++) {
            System.out.println("Hotel " + (i+1) + ". Cantidad de horas encendidas: " + horasLuces[i]);
        }


        //*Ciclo para definir el gasto total de cada hotel y para imprimir el resultado */
        for (int i = 0; i < numHoteles; i++) {

            if (tipoLuces[i]==1) {

                //*Calculo precio de 1 hora */
                double precioHora = numeroPisos[i]*(3)*(0.25);

                //*Calculo precio de todas las horas */
                double precioTotal = precioHora*horasLuces[i];

                System.out.println("Hotel " + (i+1) + ". Gasto total: $" + precioTotal);
                
            } else if(tipoLuces[i]==2) {

                //*Calculo precio de 1 hora */
                double precioHora =  numeroPisos[i]*(3)*(0.5);

                //*Calculo precio de todas las horas */
                double precioTotal = precioHora*horasLuces[i];

                System.out.println("Hotel " + (i+1) + ". Gasto total: $" + precioTotal);
                
            }

            else if(tipoLuces[i]==3) {

                //*Calculo precio de 1 hora */
                double precioHora = numeroPisos[i]*(3)*(1);

                //*Calculo precio de todas las horas */
                double precioTotal = precioHora*horasLuces[i];

                System.out.println("Hotel " + (i+1) + ". Gasto total: $" + precioTotal);
                
            }
            
            
        }       






    } 

        
        


        

       
    
}
