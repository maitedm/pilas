
import java.util.Stack;


public class Respuesta {
    
    public void met1(){
        
        Stack juegos=new Stack();
    
    juegos.push("ib");
    juegos.push("alicia");
    juegos.push("crush");
    juegos.push("moder love");
    juegos.push("cdm");
    
    
        System.out.println("tamaño pila:"+juegos.size());
        
        System.out.println("tamaño pila:"+juegos.peek());
        
        System.out.println("posicion de elemento:" + juegos.search("cdm"));
        
        System.out.println("elemestos des-apilado:"+juegos.pop());
        
        System.out.println("¿esta pila esta vacia?:"+juegos.empty()); 
    }
    
    public void met2(){
        
        Stack notas=new Stack();
          
        notas.push(6);
        notas.push(4);
        notas.push(7);
        notas.push(3);
        notas.push(5);
        
        for(int i=0; i<notas.size(); i++ ){  
        
        System.out.println(notas.get(i));
        }  
        
    }
   
    
    public void met3(){
       Stack notas=new Stack();
          
        notas.push(6);
        notas.push(4);
        notas.push(7);
        notas.push(3);
        notas.push(5);
        
        
        for(int x=0; x<notas.size(); x++ ){
          
             System.out.println(notas.get(x));
        }
        
        
        
  
        
    }
    public void met4(){
        
         Stack libros=new Stack(); 
         
         libros.push("aristoteles y dante");
         libros.push("tus ojos");
         libros.push("hechizada");
         libros.push("will grayson will grayson");
         int f =0;
         int j=libros.size();
         while (f < j){
            
            
                
                System.out.println(libros.pop());
                
            
            
            f++;
        }
        
    }
   
    
}