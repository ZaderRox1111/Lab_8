package package_8;

public class TimesTable {

   // contains the dimensions of the times table
   private int rows = 0;
   private int cols = 0;
   
   // helper variables to be able to traverse through the array elements
   private int index_rows, index_cols;
   
   // this variable holds the 2-dim array data
   int [][] timesTableData = null;
   
   /**
    * Initialization constructor
    * @param rows
    * @param cols
    */
   public TimesTable(int rows, int cols)
   {
      // set the dimensions
      this.rows = rows;
      this.cols = cols;
      // create new 2-dim integer object
      timesTableData = new int[rows][cols];
      
      // fill times table with data
      fillTimesTable();
   }
   
   /**
    * Default constructor - creates a times table object of 10x10
    */
   public TimesTable()
   {
      // TODO
      //To set the times table of 10x10, rows and columns need to be 10 each
      this.rows = 10;
      this.cols = 10;
      //create the 2-dim 10x10 table
      timesTableData = new int[rows][cols];
      
      //fill the times table with data
      fillTimesTable();
   }
   
   
   /**
    * Fills a times table with multiplication data
    */
   private void fillTimesTable()
   {
      // TODO
      //will loop through each row and column
      //moving across the row, then move to the next
      for (index_rows = 0; index_rows < rows; index_rows++)
         {
            for (index_cols = 0; index_cols < cols; index_cols++)
            {
               //set each location as its respective times table data
               //for example, row 3, col 5 --> 4 * 6 = 24
               timesTableData[index_rows][index_cols] = (index_rows + 1) * (index_cols + 1);
            }
         }
   }
   
   
   /**
    * Print out times table
    */
   void printTimesTable()
   {
      // TODO
      //instantiate the necessary conIO class
      Console_IO_Class conIO = new Console_IO_Class(); 
      
      //nested for loop, used to loop through each col, as it loops through each row
      for (index_rows = 0; index_rows < rows; index_rows++)
      {
         for (index_cols = 0; index_cols < cols; index_cols++)
         {
            //print the data at the point, followed by a space
            conIO.printInt(timesTableData[index_rows][index_cols]);
            conIO.printChar(' ');
         }
         
         //print an endline at the end of each row
         conIO.printEndline();
      }
   }
   
   
   /**
    * Look up a specific result from the times table and return it
    * 
    * @param a
    * @param b
    * @return
    */
   int getResult(int a, int b)
   {
      // TODO
      //create variables necessary
      int dataPoint;
      
      //access the data at the location a-1,b-1 because of indexing
      dataPoint = timesTableData[a - 1][b - 1];
      
      //return the data at that location
      return dataPoint;
   }
   
   
   /**
    * Driver
    * 
    * @param args
    */
   public static void main(String [] args)
   {
      // create times table
      TimesTable tt = new TimesTable();
      
      // create variables for two factors
      int a = 5, b = 7;
      
      // create the IO object
      Console_IO_Class conIO = new Console_IO_Class(); 
      
      // print out whole table
      tt.printTimesTable();
      
      // print out a specific result
      conIO.printString("Result is: " + tt.getResult(a, b));
   }
}