package negocio;

public abstract class  Jogo {
	protected int[][] mat=new int[3][3];
	
	
	public abstract String getResultado();
	
	public void setP11(String p) {
        if(p.equalsIgnoreCase("X")){
            mat[0][0] =1;
        }else{
            mat[0][0] =Integer.parseInt(p);
        }
    }
    
    public void setP12(String p) {
        if(p.equalsIgnoreCase("X")){
            mat[0][1] =1;
        }else{
            mat[0][1] =Integer.parseInt(p);
        }
    }
    
      public void setP13(String p) {
        if(p.equalsIgnoreCase("X")){
            mat[0][2] =1;
        }else{
            mat[0][2] =Integer.parseInt(p);
        }
    }
      
      public void setP21(String p) {
        if(p.equalsIgnoreCase("X")){
            mat[1][0] =1;
        }else{
            mat[1][0] =Integer.parseInt(p);
        }
    }
      
       public void setP22(String p) {
        if(p.equalsIgnoreCase("X")){
            mat[1][1] =1;
        }else{
            mat[1][1] =Integer.parseInt(p);
        }
    }
      
     public void setP23(String p) {
        if(p.equalsIgnoreCase("X")){
            mat[1][2] =1;
        }else{
            mat[1][2] =Integer.parseInt(p);
        }
    }   
       
     
     public void setP31(String p) {
        if(p.equalsIgnoreCase("X")){
            mat[2][0] =1;
        }else{
            mat[2][0] =Integer.parseInt(p);
        }
    }
     
      public void setP32(String p) {
        if(p.equalsIgnoreCase("X")){
            mat[2][1] =1;
        }else{
            mat[2][1] =Integer.parseInt(p);
        }
    }
      
     public void setP33(String p) {
        if(p.equalsIgnoreCase("X")){
            mat[2][2] =1;
        }else{
            mat[2][2]=Integer.parseInt(p);
        }
    }  
}
