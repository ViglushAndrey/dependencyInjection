import dagger.Module;
import dagger.Provides;

import javax.inject.Named;

@Module
public class InjectModule {

    private String motherBoardModel = "H310M Pro-VDH";

    private String processorModel = "Intel Core i7-8700";
    private int processorCore = 6;
    private float processorFrequency = 3.20F;

    private String ramModel = "Kingston Fury DDR4-3200 16384 MB PC4-25600";
    private int ramFrequency = 3200;
    private int ramCapacity = 16;

    private String powerSupplyModel = "Aerocool VX 700 Plus";
    private String powerSupplyCapacity = "700W";

    private String ssdModel = "SSDNow A400 240GB 2.5 SATAIII 3D TLC";
    private int ssdCapacity = 240;

    public String getMotherBoardModel() {
        return motherBoardModel;
    }

    public void setMotherBoardModel(String motherBoardModel) {
        this.motherBoardModel = motherBoardModel;
    }

    public String getProcessorModel() {
        return processorModel;
    }

    public void setProcessorModel(String processorModel) {
        this.processorModel = processorModel;
    }

    public int getProcessorCore() {
        return processorCore;
    }

    public void setProcessorCore(int processorCore) {
        this.processorCore = processorCore;
    }

    public float getProcessorFrequency() {
        return processorFrequency;
    }

    public void setProcessorFrequency(float processorFrequency) {
        this.processorFrequency = processorFrequency;
    }

    public String getRamModel() {
        return ramModel;
    }

    public void setRamModel(String ramModel) {
        this.ramModel = ramModel;
    }

    public int getRamFrequency() {
        return ramFrequency;
    }

    public void setRamFrequency(int ramFrequency) {
        this.ramFrequency = ramFrequency;
    }

    public int getRamCapacity() {
        return ramCapacity;
    }

    public void setRamCapacity(int ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    public String getPowerSupplyModel() {
        return powerSupplyModel;
    }

    public void setPowerSupplyModel(String powerSupplyModel) {
        this.powerSupplyModel = powerSupplyModel;
    }

    public String getPowerSupplyCapacity() {
        return powerSupplyCapacity;
    }

    public void setPowerSupplyCapacity(String powerSupplyCapacity) {
        this.powerSupplyCapacity = powerSupplyCapacity;
    }

    public String getSsdModel() {
        return ssdModel;
    }

    public void setSsdModel(String ssdModel) {
        this.ssdModel = ssdModel;
    }

    public int getSsdCapacity() {
        return ssdCapacity;
    }

    public void setSsdCapacity(int ssdCapacity) {
        this.ssdCapacity = ssdCapacity;
    }

    @Provides
    @Named("MotherboardModel")
    public String provideMotherboard(){
        return motherBoardModel;
    }

    @Provides
    @Named("ProcessorModel")
    public String provideProcessorModel(){
        return processorModel;
    }

    @Provides
    @Named("Core")
    public int provideProcessorCore(){
        return processorCore;
    }

    @Provides
    @Named("Frequency")
    public float provideProcessorFrequency(){
        return processorFrequency;
    }

    @Provides
    @Named("RAMModel")
    public String provideRAMModel(){
        return ramModel;
    }

    @Provides
    @Named("RAMFrequency")
    public int provideRAMFrequency(){
        return ramFrequency;
    }

    @Provides
    @Named("RAMCapacity")
    public int provideRAMCapacity(){
        return ramCapacity;
    }

    @Provides
    @Named("PowerSupplyModel")
    public String providePowerSupplyModel(){
        return powerSupplyModel;
    }

    @Provides
    @Named("PowerSupplyCapacity")
    public String providePowerSupplyCapacity(){
        return powerSupplyCapacity;
    }

    @Provides
    @Named("SSDModel")
    public String provideSSDModel(){
        return ssdModel;
    }

    @Provides
    @Named("SSDCapacity")
    public int provideSSDCapacity(){
        return ssdCapacity;
    }


}
