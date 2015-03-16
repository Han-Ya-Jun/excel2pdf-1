package com.potapov;

import com.aspose.cells.SaveFormat;
import com.aspose.cells.Workbook;

public class Excel2Pdf {

    public static void main(String[] ars){
        try {

        //Instantiate a new workbook with Excel file path
        Workbook workbook = new Workbook("d:\\workSpaces\\excel2pdf\\src\\main\\resources\\demo - Copy.xlsx");

        //Save the document in PDF format
        workbook.save("d:\\workSpaces\\excel2pdf\\src\\main\\resources\\demo - Copy.pdf", SaveFormat.PDF);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
