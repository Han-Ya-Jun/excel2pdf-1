package com.potapov;

import com.aspose.cells.SaveFormat;
import com.aspose.cells.Workbook;

public class Excel2Pdf {

    public static void main(String[] args){
        try {

        //Instantiate a new workbook with Excel file path
        Workbook workbook = new Workbook(args[0]);

        //Save the document in PDF format
        workbook.save(args[1], SaveFormat.PDF);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
