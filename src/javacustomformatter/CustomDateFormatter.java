/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacustomformatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author mesut
 */
public class CustomDateFormatter {
//    private final String _inputFormat = "dd/MM/yyyy";
    private final String _shortFormat = "yyyyMM";
    private final String _longFormat = "ddMMyyyy";
    
    private final String _outShortDate;
    private final String _outLongDate;
    //"20/08/2018"
    public CustomDateFormatter(String yourFormat, String yourDateWithFormat){
        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern(yourFormat);
        DateTimeFormatter detailFormat = DateTimeFormatter.ofPattern(this._longFormat);
        DateTimeFormatter firstFormat = DateTimeFormatter.ofPattern(this._shortFormat);
        
        LocalDate date = LocalDate.parse(yourDateWithFormat, inputFormat);
        this._outShortDate = date.format(firstFormat);
        this._outLongDate = date.format(detailFormat);
    }

    /**
     * @return the _outFirstData
     */
    public String getOutShortDate() {
        return _outShortDate;
    }

    /**
     * @return the _outDetailData
     */
    public String getOutLongDate() {
        return _outLongDate;
    }
    
    @Override
    public String toString(){
        return String.format("Short Date: %1s Long Date: %2s", this._outShortDate, this._outLongDate);
    }
    
}
