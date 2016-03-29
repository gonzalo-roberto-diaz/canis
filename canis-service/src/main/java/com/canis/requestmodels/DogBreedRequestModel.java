package com.canis.requestmodels;

import com.canis.domain.DogSize;
import com.canis.domain.DogType;

import javax.persistence.*;
import java.math.BigDecimal;


public class DogBreedRequestModel {
	

	private Long id;
	

	private String name;
    

	private String pictureUrl;
	

	private String videoUrl;
    

    private boolean isAptForApartments;
    

    private boolean isSafeAroundKids;
    

    private int guardianRank;
    

    private String guardianText;   
    

    private int friendlyRank;
    

    private String friendlyText;    
    

    private int activeRank;
    

    private String activeText;   
    

    private int trainingRank;
    

    private String trainingText;


    private int groomingRank;
    

    private String groomingText;


	private int sheddingRank;


	private String sheddingText;
    

    private BigDecimal servingMin;
    

    private BigDecimal servingMax;

    private BigDecimal sizeMin;


    private BigDecimal sizeMax;
    

    private BigDecimal weightMin;
    

    private BigDecimal weightMax;
    

    private String colors;


	private short lifespanMax;


	private short lifespanMin;


    private DogTypeRequestModel dogType;

    public DogSizeRequestModel getDogSize() {
        return dogSize;
    }

    public DogBreedRequestModel setDogSize(DogSizeRequestModel dogSize) {
        this.dogSize = dogSize;
        return this;
    }

    private DogSizeRequestModel dogSize;


    public Long getId() {
        return id;
    }

    public DogBreedRequestModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public DogBreedRequestModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public DogBreedRequestModel setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
        return this;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public DogBreedRequestModel setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }

    public boolean isAptForApartments() {
        return isAptForApartments;
    }

    public DogBreedRequestModel setAptForApartments(boolean aptForApartments) {
        isAptForApartments = aptForApartments;
        return this;
    }

    public boolean isSafeAroundKids() {
        return isSafeAroundKids;
    }

    public DogBreedRequestModel setSafeAroundKids(boolean safeAroundKids) {
        isSafeAroundKids = safeAroundKids;
        return this;
    }

    public int getGuardianRank() {
        return guardianRank;
    }

    public DogBreedRequestModel setGuardianRank(int guardianRank) {
        this.guardianRank = guardianRank;
        return this;
    }

    public String getGuardianText() {
        return guardianText;
    }

    public DogBreedRequestModel setGuardianText(String guardianText) {
        this.guardianText = guardianText;
        return this;
    }

    public int getFriendlyRank() {
        return friendlyRank;
    }

    public DogBreedRequestModel setFriendlyRank(int friendlyRank) {
        this.friendlyRank = friendlyRank;
        return this;
    }

    public String getFriendlyText() {
        return friendlyText;
    }

    public DogBreedRequestModel setFriendlyText(String friendlyText) {
        this.friendlyText = friendlyText;
        return this;
    }

    public int getActiveRank() {
        return activeRank;
    }

    public DogBreedRequestModel setActiveRank(int activeRank) {
        this.activeRank = activeRank;
        return this;
    }

    public String getActiveText() {
        return activeText;
    }

    public DogBreedRequestModel setActiveText(String activeText) {
        this.activeText = activeText;
        return this;
    }

    public int getTrainingRank() {
        return trainingRank;
    }

    public DogBreedRequestModel setTrainingRank(int trainingRank) {
        this.trainingRank = trainingRank;
        return this;
    }

    public String getTrainingText() {
        return trainingText;
    }

    public DogBreedRequestModel setTrainingText(String trainingText) {
        this.trainingText = trainingText;
        return this;
    }

    public int getGroomingRank() {
        return groomingRank;
    }

    public DogBreedRequestModel setGroomingRank(int groomingRank) {
        this.groomingRank = groomingRank;
        return this;
    }

    public String getGroomingText() {
        return groomingText;
    }

    public DogBreedRequestModel setGroomingText(String groomingText) {
        this.groomingText = groomingText;
        return this;
    }

    public int getSheddingRank() {
        return sheddingRank;
    }

    public DogBreedRequestModel setSheddingRank(int sheddingRank) {
        this.sheddingRank = sheddingRank;
        return this;
    }

    public String getSheddingText() {
        return sheddingText;
    }

    public DogBreedRequestModel setSheddingText(String sheddingText) {
        this.sheddingText = sheddingText;
        return this;
    }

    public BigDecimal getServingMin() {
        return servingMin;
    }

    public DogBreedRequestModel setServingMin(BigDecimal servingMin) {
        this.servingMin = servingMin;
        return this;
    }

    public BigDecimal getServingMax() {
        return servingMax;
    }

    public DogBreedRequestModel setServingMax(BigDecimal servingMax) {
        this.servingMax = servingMax;
        return this;
    }

    public BigDecimal getSizeMin() {
        return sizeMin;
    }

    public DogBreedRequestModel setSizeMin(BigDecimal sizeMin) {
        this.sizeMin = sizeMin;
        return this;
    }

    public BigDecimal getSizeMax() {
        return sizeMax;
    }

    public DogBreedRequestModel setSizeMax(BigDecimal sizeMax) {
        this.sizeMax = sizeMax;
        return this;
    }

    public BigDecimal getWeightMin() {
        return weightMin;
    }

    public DogBreedRequestModel setWeightMin(BigDecimal weightMin) {
        this.weightMin = weightMin;
        return this;
    }

    public BigDecimal getWeightMax() {
        return weightMax;
    }

    public DogBreedRequestModel setWeightMax(BigDecimal weightMax) {
        this.weightMax = weightMax;
        return this;
    }

    public String getColors() {
        return colors;
    }

    public DogBreedRequestModel setColors(String colors) {
        this.colors = colors;
        return this;
    }

    public short getLifespanMax() {
        return lifespanMax;
    }

    public DogBreedRequestModel setLifespanMax(short lifespanMax) {
        this.lifespanMax = lifespanMax;
        return this;
    }

    public short getLifespanMin() {
        return lifespanMin;
    }

    public DogBreedRequestModel setLifespanMin(short lifespanMin) {
        this.lifespanMin = lifespanMin;
        return this;
    }

    public DogTypeRequestModel getDogType() {
        return dogType;
    }

    public DogBreedRequestModel setDogType(DogTypeRequestModel dogType) {
        this.dogType = dogType;
        return this;
    }
}
