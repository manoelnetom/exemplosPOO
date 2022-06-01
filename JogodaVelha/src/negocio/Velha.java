package negocio;

public class Velha extends Jogo{
    
    
    
    
    public String getResultado(){
        String result="Houve empate!!!!";
        int diagonalPrincipal=0;
        int diagonalSecundaria=0;
        for(int i=0;i<3;i++){
            int linha=0;
            int coluna=0;
            for(int j=0;j<3;j++){
                linha+=mat[i][j];
                coluna+=mat[j][i];
                if(i==j){
                    diagonalPrincipal+=mat[i][j];
                }else if((i+j)==2){
                    diagonalSecundaria+=mat[i][j];
                }
            }
            if((linha==0)||(coluna==0)){
                return "O zero ganhou";
            }else if((linha==3)||(coluna==3)){
                return "O X ganhou";
            }
        }
        
        if((diagonalPrincipal==0)||(diagonalSecundaria==0)){
            return "O zero ganhou";
        }else if((diagonalPrincipal==3)||(diagonalSecundaria==3)){
            return "O X ganhou";
        }
        return result;
    }
    
    
    
}
