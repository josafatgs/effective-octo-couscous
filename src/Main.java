public class Main {

    public static int nuevaBebida(String bebida){

        // Verificar que la entrada no sea Nula o Vacia
        if (bebida == null || bebida.isEmpty()) { return -1; }

        // Remplazar espacios blancos por nada
        bebida = bebida.replace(" ", "");
        // Separar Nombre Bebida y Distintas Medidas
        String[] info = bebida.split(",");

        // Verificar que la longitud de toda la informacion sea de almenos dos valores Ex. ["Nombre", "Tamano"]
        if ( info.length < 2 ) { return -1; }

        bebida = info[0]; // Obtener Nombre de la Bebida

        // Verificar que la bebida no sea ""
        if ( bebida.isEmpty() ) { return -1; }
        // Verificar que la longitud de la bebida este entre 2 & 15
        if ( bebida.length() > 15 || bebida.length() < 2 ) { return -1; }
        // Verificar que la bebida solo tenga valores alfanumericos
        if ( !bebida.matches("^[a-zA-Z]*$") ) { return -1; }


        // Verificar que existan al menos 1 tamano ingresado y que no sean mas de 5 tamanos ingresados
        if ( info.length - 1 == 0 || info.length - 1 > 5 ) { return -1; }
        // Variable Auxiliar
        int tamano = 0;
        // Recorrer cada valor de la lista correspondiente a los tamanos
        for (int i = 1; i < info.length; i++) {
            // Verificar que el tamano sea valor numerico
            if ( !info[i].matches("\\d+") ) { return -1; }
            // Verificar que el tamano solo este en el rango de 1 a 48
            if ( Integer.parseInt(info[i]) < 1 || Integer.parseInt(info[i]) > 48) { return -1; }
            // Verificar que la entrada de los tamanos esten en orden ascendente, esto involucra tamanos repetidos
            if ( tamano >= Integer.parseInt(info[i] ) ) { return -1; }
            // Se actualiza la variable auxiliar con el ultimo valor usado
            tamano = Integer.parseInt(info[i]);
        }

        return 1; // Resultado de Exito
    }
}