import java.util.HashSet;
import java.util.Iterator;

public class RegistroDeInvitados {

    private HashSet<String> invitados;

    public HashSet<String> getInvitados() {
        return invitados;
    }

    public void setInvitados(HashSet<String> invitado) {
        this.invitados = invitado;
    }

    public RegistroDeInvitados() {
        this.invitados = new HashSet<>();
    }

    public void agregarInvitado(String invitado){
        this.invitados.add(invitado);
    }

    public void eliminarInvitado(String invitado){
        this.invitados.remove(invitado);
    }

    public void mostrarInvitados(){
        Iterator<String> itiridir = invitados.iterator();
        int cont = 1;
        while (itiridir.hasNext()) {
            System.out.println(cont + ". " + itiridir.next() + " = " + itiridir.hashCode());
            
            cont ++;
        }
    }
    

   /*  @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }
 */
    
}
