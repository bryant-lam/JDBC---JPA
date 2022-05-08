package model;

import java.time.*;
import jakarta.persistence.*;
import java.util.Set;

@Entity(name = "artpieces")
public class ArtPiece {
    
    // Bidirectional link to parent Building
    @ManyToOne
    @JoinColumn(name = "building_id")
    private Building building;

    
    private String title;
    private String artist;
    private LocalDate creationdate;

    @Id
    @Column(name = "artpiece_id")
    private int artpieceId;

    // Many-to-many junction with visitors
    @OneToMany(mappedBy = "artpiece")
    private Set<Viewing> viewings;

    public ArtPiece(){
    }

    public ArtPiece(Building building, String title, String artist, LocalDate creationDate, int artpieceId) {
        this.building = building;
        this.title = title;
        this.artist = artist;
        this.creationdate = creationDate;
        this.artpieceId = artpieceId;
    }

    @Override
    public String toString() {
        return title + " By " + artist +" in " + creationdate +" (ID " + artpieceId + ")";
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public LocalDate getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(LocalDate creationdate) {
        this.creationdate = creationdate;
    }

    public int getArtpieceId() {
        return artpieceId;
    }

    public void setArtpieceId(int artpieceId) {
        this.artpieceId = artpieceId;
    }

    
    
}
