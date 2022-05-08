package model;

import java.util.*;
import jakarta.persistence.*;

@Entity(name = "buildings")
public class Building {
    @Id
    @Column(name = "building_id")
    private int buildingId;

    @Column(name = "building_name")
    private String name;

    // The bidirectional link back to the parent Museum.
    @ManyToOne
    @JoinColumn(name = "museum_id")
    private Museum museum;

    // Bidirectional link to child ArtPiece
    @OneToMany(mappedBy = "building")
    private List<ArtPiece> artpieces;

    public Building() {
    }

    public Building(int buildingId, String name, Museum museum) {
        this.buildingId = buildingId;
        this.name = name;
        this.museum = museum;
    }

    @Override
    public String toString() {
        return "Building " + name + " (ID " + buildingId + ")";
    }

    public int getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(int buildingId) {
        this.buildingId = buildingId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Museum getMuseum() {
        return museum;
    }

    public void setMuseum(Museum museum) {
        this.museum = museum;
    }

    public List<ArtPiece> getArtpieces() {
        return artpieces;
    }

    public void setArtpieces(List<ArtPiece> artpieces) {
        this.artpieces = artpieces;
    }

    
}
