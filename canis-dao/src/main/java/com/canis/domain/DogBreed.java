package com.canis.domain;

import com.canis.domain.enums.*;

import java.math.BigDecimal;

import javax.persistence.*;

@Entity
@Table (name="DOG_BREEDS")
public class DogBreed {
	
	@Id
	@GeneratedValue
    @Column(name="ID")
	private Long id;
	
    @Column(name="NAME")
	private String name;
    
    @Column(name="PICTURE_URL")
	private String pictureUrl;
	
    @Column(name="VIDEO_URL")
	private String videoUrl;
    
    @Column(name="APARTMENTS")
    private boolean isAptForApartments;

    @Column(name="GUARDIAN_RANK")
    private int guardianRank;
    
    @Column(name="GUARDIAN_TEXT")
    private String guardianText;   
    
    @Column(name="FRIENDLY_RANK")
    private int friendlyRank;
    
    @Column(name="FRIENDLY_TEXT")
    private String friendlyText;    
    
    @Column(name="ACTIVE_RANK")
    private int activeRank;
    
    @Column(name="ACTIVE_TEXT")
    private String activeText;   
    
    @Column(name="TRAINING_RANK")
    private int trainingRank;
    
    @Column(name="TRAINING_TEXT")
    private String trainingText;

    @Column(name="GROOMING_RANK")
    private int groomingRank;
    
    @Column(name="GROOMING_TEXT")
    private String groomingText;

	@Column(name="SHEDDING_RANK")
	private int sheddingRank;

	@Column(name="SHEDDING_TEXT")
	private String sheddingText;
    
    @Column(name="SERVING_MIN")
    private BigDecimal servingMin;
    
    @Column(name="SERVING_MAX")
    private BigDecimal servingMax;
    
    @Column(name="SIZE_MIN")
    private BigDecimal sizeMin;

    @Column(name="SIZE_MAX")
    private BigDecimal sizeMax;
    
    @Column(name="WEIGHT_MIN")
    private BigDecimal weightMin;
    
    @Column(name="WEIGHT_MAX")
    private BigDecimal weightMax;
    
    @Column(name="COLORS")
    private String colors;

	@Column(name="LIFESPAN_MAX")
	private short lifespanMax;

	@Column(name="LIFESPAN_MIN")
	private short lifespanMin;

    @ManyToOne
    @JoinColumn(name="DOG_TYPE_ID", referencedColumnName = "ID", nullable = false)
    private DogType dogType;

    @Column(name = "DOG_SIZE_ID")
    @Convert (converter = DogSizeConverter.class)
    private com.canis.domain.enums.DogSize dogSize;


    public Long getId() {
        return id;
    }

    public DogBreed setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public DogBreed setName(String name) {
        this.name = name;
        return this;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public DogBreed setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
        return this;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public DogBreed setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }

    public boolean isAptForApartments() {
        return isAptForApartments;
    }

    public DogBreed setAptForApartments(boolean aptForApartments) {
        isAptForApartments = aptForApartments;
        return this;
    }

    public int getGuardianRank() {
        return guardianRank;
    }

    public DogBreed setGuardianRank(int guardianRank) {
        this.guardianRank = guardianRank;
        return this;
    }

    public String getGuardianText() {
        return guardianText;
    }

    public DogBreed setGuardianText(String guardianText) {
        this.guardianText = guardianText;
        return this;
    }

    public int getFriendlyRank() {
        return friendlyRank;
    }

    public DogBreed setFriendlyRank(int friendlyRank) {
        this.friendlyRank = friendlyRank;
        return this;
    }

    public String getFriendlyText() {
        return friendlyText;
    }

    public DogBreed setFriendlyText(String friendlyText) {
        this.friendlyText = friendlyText;
        return this;
    }

    public int getActiveRank() {
        return activeRank;
    }

    public DogBreed setActiveRank(int activeRank) {
        this.activeRank = activeRank;
        return this;
    }

    public String getActiveText() {
        return activeText;
    }

    public DogBreed setActiveText(String activeText) {
        this.activeText = activeText;
        return this;
    }

    public int getTrainingRank() {
        return trainingRank;
    }

    public DogBreed setTrainingRank(int trainingRank) {
        this.trainingRank = trainingRank;
        return this;
    }

    public String getTrainingText() {
        return trainingText;
    }

    public DogBreed setTrainingText(String trainingText) {
        this.trainingText = trainingText;
        return this;
    }

    public int getGroomingRank() {
        return groomingRank;
    }

    public DogBreed setGroomingRank(int groomingRank) {
        this.groomingRank = groomingRank;
        return this;
    }

    public String getGroomingText() {
        return groomingText;
    }

    public DogBreed setGroomingText(String groomingText) {
        this.groomingText = groomingText;
        return this;
    }

    public int getSheddingRank() {
        return sheddingRank;
    }

    public DogBreed setSheddingRank(int sheddingRank) {
        this.sheddingRank = sheddingRank;
        return this;
    }

    public String getSheddingText() {
        return sheddingText;
    }

    public DogBreed setSheddingText(String sheddingText) {
        this.sheddingText = sheddingText;
        return this;
    }

    public BigDecimal getServingMin() {
        return servingMin;
    }

    public DogBreed setServingMin(BigDecimal servingMin) {
        this.servingMin = servingMin;
        return this;
    }

    public BigDecimal getServingMax() {
        return servingMax;
    }

    public DogBreed setServingMax(BigDecimal servingMax) {
        this.servingMax = servingMax;
        return this;
    }

    public BigDecimal getSizeMin() {
        return sizeMin;
    }

    public DogBreed setSizeMin(BigDecimal sizeMin) {
        this.sizeMin = sizeMin;
        return this;
    }

    public BigDecimal getSizeMax() {
        return sizeMax;
    }

    public DogBreed setSizeMax(BigDecimal sizeMax) {
        this.sizeMax = sizeMax;
        return this;
    }

    public BigDecimal getWeightMin() {
        return weightMin;
    }

    public DogBreed setWeightMin(BigDecimal weightMin) {
        this.weightMin = weightMin;
        return this;
    }

    public BigDecimal getWeightMax() {
        return weightMax;
    }

    public DogBreed setWeightMax(BigDecimal weightMax) {
        this.weightMax = weightMax;
        return this;
    }

    public String getColors() {
        return colors;
    }

    public DogBreed setColors(String colors) {
        this.colors = colors;
        return this;
    }

    public short getLifespanMax() {
        return lifespanMax;
    }

    public DogBreed setLifespanMax(short lifespanMax) {
        this.lifespanMax = lifespanMax;
        return this;
    }

    public short getLifespanMin() {
        return lifespanMin;
    }

    public DogBreed setLifespanMin(short lifespanMin) {
        this.lifespanMin = lifespanMin;
        return this;
    }

    public DogType getDogType() {
        return dogType;
    }

    public DogBreed setDogType(DogType dogType) {
        this.dogType = dogType;
        return this;
    }

    public com.canis.domain.enums.DogSize getDogSize() {
        return dogSize;
    }

    public DogBreed setDogSize(com.canis.domain.enums.DogSize dogSize) {
        this.dogSize = dogSize;
        return this;
    }

}
