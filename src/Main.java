public class Main {
    public static void main(String[] args) {

    }

    public static int nuevaBebida(String bebida){

        if (bebida == null || bebida.isEmpty()) {
            return -1;
        }

        bebida = bebida.replace(" ", "");

        String[] info = bebida.split(",");

        if ( info.length < 1 ) { return -1; }

        bebida = info[0];

        if ( bebida.isEmpty() ) { return -1; }
        if ( bebida.length() > 15 || bebida.length() < 2 ) { return -1; }
        if ( !bebida.matches("^[a-zA-Z]*$") ) { return -1; }



        if ( info.length - 1 == 0 || info.length - 1 > 5 ) { return -1; }
        int tamano = 0;
        for (int i = 1; i < info.length; i++) {
            if ( !info[i].matches("\\d+") ) { return -1; }
            if ( Integer.parseInt(info[i]) < 1 || Integer.parseInt(info[i]) > 48) { return -1; }
            if ( tamano > Integer.parseInt(info[i] ) ) { return -1; }
            tamano = Integer.parseInt(info[i]);
        }




        return 1;
    }
}