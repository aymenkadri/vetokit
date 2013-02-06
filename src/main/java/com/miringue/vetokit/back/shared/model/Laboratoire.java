package com.miringue.vetokit.back.shared.model;

import com.google.common.base.Objects;
import com.google.gwt.user.client.rpc.IsSerializable;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

import java.util.Date;

@Entity
public class Laboratoire implements IsSerializable, HasId {

    @Id
    private Long id;
    private String nom = "";

    private Date dateAjout = new Date();

//	@Ignore
//	private List<Paragraph> paragraphs = Lists.newArrayList();

    @Override
    public Long getId() {
        return id;
    }
    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Date getDateAjout() {
        return dateAjout;
    }
    public void setDateAjout(Date dateAjout) {
        this.dateAjout = dateAjout;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Laboratoire) {
            final Laboratoire that = (Laboratoire) obj;
            return Objects.equal(id, that.id);
        }
        return false;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(Laboratoire.class) //
                .add("id", id) //
                .add("nom", nom) //
                .add("dateAjout", dateAjout ) //
                .toString();
    }
}
