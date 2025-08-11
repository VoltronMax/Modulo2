package Model;

public class User {

    protected String name;
    protected int id = 0000;
    protected String username;
    protected String password;
    protected Rol rol;
    protected ActionHistorial[] historial;
    protected int registeredActions;

    public User(String name, String username, String password, Rol rol){
        this.name = name;
        this.username = username;
        this.password = password;
        this.rol = rol;
        historial = new ActionHistorial[10];
        this.id++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public Rol getRol() {
        return rol;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setAction(String description){
        if (registeredActions<historial.length) {
            historial[registeredActions++] = new ActionHistorial(description);
        }
    }

    public void showHistorial(){
        for (int i = 0; i < registeredActions; i++) {
            System.out.println(historial[i]);
        }
    }

    public boolean updatePassword(String oldPw, String newPw){
        if(this.password.equals(newPw) && !this.password.equals(newPw)){
            this.password = newPw;
            return true;
        }
        return false;
    }

    public boolean checkPassword(String pw){
        return this.password.equals(pw);
    }

}

