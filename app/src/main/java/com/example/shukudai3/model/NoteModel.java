package com.example.shukudai3.model;

import java.io.Serializable;

public class NoteModel implements Serializable {
    private String txtTitle;
    public NoteModel(String txtTitle) {
        this.txtTitle = txtTitle;
    }
    public String getTxtTitle() {
        return txtTitle;
    }
    public void setTxtTitle(String txtTitle) {
        this.txtTitle = txtTitle;
    }
}
