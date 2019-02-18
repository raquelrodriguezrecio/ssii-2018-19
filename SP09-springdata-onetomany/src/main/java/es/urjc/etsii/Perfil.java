package es.urjc.etsii;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "perfil")
public class Perfil {
    private int id;
    private String name;
    // Un perfil puede estar asociado a muchos usuarios.
    private Set<Usuario> usuarios;

    public Perfil(){

    }

    public Perfil(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Un perfil para muchos usuarios. Campo en clase usuario es "perfil".
    @OneToMany(mappedBy = "perfil", cascade = CascadeType.ALL)
    public Set<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        String result = String.format(
                "Perfil[id=%d, name='%s']%n",
                id, name);
        if (usuarios != null) {
            for(Usuario Usuario : usuarios) {
                result += String.format(
                        "Usuario[id=%d, userName='%s', pass='%s']%n",
                        Usuario.getId(), Usuario.getUserName(), Usuario.getPass());
            }
        }

        return result;
    }
}
