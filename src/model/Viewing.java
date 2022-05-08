package model;

import java.time.*;
import jakarta.persistence.*;

@Entity(name = "viewings")
public class Viewing {
    @Id
    @JoinColumn(name = "artpiece_id")
    @ManyToOne
    private ArtPiece artpiece;

    @Id
    @JoinColumn(name = "visitor_id")
    @ManyToOne
    private Visitor visitor;

    @Id
    @Column(name = "view_date")
    private LocalDate viewDate;

    private int score;

    public Viewing(){
    }

    public Viewing(ArtPiece artpiece, Visitor visitor, LocalDate viewDate, int score) {
        this.artpiece = artpiece;
        this.visitor = visitor;
        this.viewDate = viewDate;
        this.score = score;
    }

    @Override
    public String toString(){
        return artpiece.getTitle() + " | Score: " + score;
    }

    public ArtPiece getArtpiece() {
        return artpiece;
    }

    public void setArtpiece(ArtPiece artpiece) {
        this.artpiece = artpiece;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public LocalDate getViewDate() {
        return viewDate;
    }

    public void setViewDate(LocalDate viewDate) {
        this.viewDate = viewDate;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    
}
