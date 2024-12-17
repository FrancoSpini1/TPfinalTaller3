package franco.tp.usuarioNuevo;

public class WrongDataTypeException extends Exception{
    public WrongDataTypeException(){
        super("ingresaste mal el/los dato/s");
    }
    public WrongDataTypeException(String m){
        super(m);
    }
}
