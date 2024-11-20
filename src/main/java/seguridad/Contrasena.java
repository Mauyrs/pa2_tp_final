package seguridad;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class Contrasena {
    
    private static final BCryptPasswordEncoder codificador = new BCryptPasswordEncoder();
    
    public static String encriptar(String contra){
        return codificador.encode(contra);
    }
    
    public static boolean combrobar(String contra, String hash){
        return codificador.matches(contra, hash);
    }
    
}
