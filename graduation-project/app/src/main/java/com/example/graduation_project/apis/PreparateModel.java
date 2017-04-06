package com.example.graduation_project.apis;

/**
 * Created by Dzmitry Hrashouski on 06/04/2017. groschovskiy@inside.google.com
 */

public class PreparateModel {

    String preparateName;
    String preparateManufacturer;
    Information information;

    public String getPreparateName() {
        return preparateName;
    }

    public String getPreparateManufacturer() {
        return preparateManufacturer;
    }

    public Information getComposition() {
        return information;
    }

    public class Information {
        String volume;
        Boolean receipe;
        String composition;
        String transcription;

        public String getVolume() {
            return volume;
        }

        public Boolean getReceipe() {
            return receipe;
        }

        public String getComposition() {
            return composition;
        }

        public String getTranscription() {
            return transcription;
        }

    }
}
