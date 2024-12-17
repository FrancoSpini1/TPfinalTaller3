package franco.tp.usuarioNuevo;

public class UserAndPasswordAlreadyExistException extends Exception{
    public UserAndPasswordAlreadyExistException(){
        System.out.println("UserAndPasswordAlreadyExistException. usuario o contraseña ya existentes");
    }
    
    public UserAndPasswordAlreadyExistException(String m){
        super(m);
    }
}
