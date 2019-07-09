import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelacess {
  public static void main(String[] args) throws IOException {

    FileInputStream fis = new FileInputStream("//Users//veljason//Desktop//1002_BQ_Testdata.csv");
    XSSFWorkbook workbook = new XSSFWorkbook(fis);

    int sheets = workbook.getNumberOfSheets();
    for(int i=0;i<sheets;i++){
      if(workbook.getSheetName(i).equalsIgnoreCase("1002_BQ_Testdata"));
      {
        XSSFSheet sheet = workbook.getSheetAt(i);
        Iterator<Row> rows = sheet.iterator();
        Row firstRow = rows.next();
        Iterator<Cell> cell = firstRow.cellIterator();
        int k=0;
        int column = 0 ;
        while(cell.hasNext()){
          Cell value = cell.next();
          if(value.getStringCellValue().equalsIgnoreCase("Q3")){
            column=k;
            }
            k++;
        }
        System.out.println(column);

      }
    }



  }
}
