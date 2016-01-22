package com.canis.domain;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
    
    @Column(name="KIDS")
    private boolean isSafeAroundKids;
    
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
    
    @Column(name="MAIN_FEATURES")
    private String mainFeatures;
    

    
    

    
    
    
    
	
//    @ManyToOne(fetch = FetchType.EAGER,cascade={CascadeType.REFRESH})
//    @JoinColumn(name = "DOG_SIZE_ID",referencedColumnName="ID",nullable=false)
//	private DogSize size;
//    
//    @ManyToOne(fetch = FetchType.EAGER,cascade={CascadeType.REFRESH})
//    @JoinColumn(name = "DOG_PURPOSE_ID",referencedColumnName="ID",nullable=false)
//	private DogPurpose purpose;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public boolean isAptForApartments() {
		return isAptForApartments;
	}

	public void setAptForApartments(boolean isAptForApartments) {
		this.isAptForApartments = isAptForApartments;
	}

	public boolean isSafeAroundKids() {
		return isSafeAroundKids;
	}

	public void setSafeAroundKids(boolean isSafeAroundKids) {
		this.isSafeAroundKids = isSafeAroundKids;
	}

	public int getGuardianRank() {
		return guardianRank;
	}

	public void setGuardianRank(int guardianRank) {
		this.guardianRank = guardianRank;
	}

	public String getGuardianText() {
		return guardianText;
	}

	public void setGuardianText(String guardianText) {
		this.guardianText = guardianText;
	}

	public int getFriendlyRank() {
		return friendlyRank;
	}

	public void setFriendlyRank(int friendlyRank) {
		this.friendlyRank = friendlyRank;
	}

	public String getFriendlyText() {
		return friendlyText;
	}

	public void setFriendlyText(String friendlyText) {
		this.friendlyText = friendlyText;
	}

	public int getActiveRank() {
		return activeRank;
	}

	public void setActiveRank(int activeRank) {
		this.activeRank = activeRank;
	}

	public String getActiveText() {
		return activeText;
	}

	public void setActiveText(String activeText) {
		this.activeText = activeText;
	}

	public int getTrainingRank() {
		return trainingRank;
	}

	public void setTrainingRank(int trainingRank) {
		this.trainingRank = trainingRank;
	}

	public String getTrainingText() {
		return trainingText;
	}

	public void setTrainingText(String trainingText) {
		this.trainingText = trainingText;
	}

	public int getGroomingRank() {
		return groomingRank;
	}

	public void setGroomingRank(int groomingRank) {
		this.groomingRank = groomingRank;
	}

	public String getGroomingText() {
		return groomingText;
	}

	public void setGroomingText(String groomingText) {
		this.groomingText = groomingText;
	}

	public BigDecimal getServingMin() {
		return servingMin;
	}

	public void setServingMin(BigDecimal servingMin) {
		this.servingMin = servingMin;
	}

	public BigDecimal getServingMax() {
		return servingMax;
	}

	public void setServingMax(BigDecimal servingMax) {
		this.servingMax = servingMax;
	}

	public BigDecimal getSizeMin() {
		return sizeMin;
	}

	public void setSizeMin(BigDecimal sizeMin) {
		this.sizeMin = sizeMin;
	}

	public BigDecimal getSizeMax() {
		return sizeMax;
	}

	public void setSizeMax(BigDecimal sizeMax) {
		this.sizeMax = sizeMax;
	}

	public BigDecimal getWeightMin() {
		return weightMin;
	}

	public void setWeightMin(BigDecimal weightMin) {
		this.weightMin = weightMin;
	}

	public BigDecimal getWeightMax() {
		return weightMax;
	}

	public void setWeightMax(BigDecimal weightMax) {
		this.weightMax = weightMax;
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}

	public String getMainFeatures() {
		return mainFeatures;
	}

	public void setMainFeatures(String mainFeatures) {
		this.mainFeatures = mainFeatures;
	}

//	public DogSize getSize() {
//		return size;
//	}
//
//	public void setSize(DogSize size) {
//		this.size = size;
//	}
//
//	public DogPurpose getPurpose() {
//		return purpose;
//	}
//
//	public void setPurpose(DogPurpose purpose) {
//		this.purpose = purpose;
//	}
	
	
	
	

}
