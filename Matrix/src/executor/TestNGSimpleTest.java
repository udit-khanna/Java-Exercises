package executor;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import keywords.Matrix;

public class TestNGSimpleTest {
  
    public static class CountRowsTest {
        private Matrix matrix;

        @DataProvider(name = "dataProvider1")
        public static Object[][] data() {
            return new Object[][]{
                    {"0", 1},
                    {"0 1", 1},
                    {  "0\n"
                     + "1", 2},
                    {  "0 1\n"
                     + "2 3", 2},
                    {  "0 1 2\n"
                     + "3 4 5\n"
                     + "6 7 8", 3}
            };
        }

        @Test(dataProvider = "dataProvider1")
        public void countRowsTest(String matrixAsString, int numberOfRows) {
        	this.matrix = new Matrix(matrixAsString);
            assertEquals(numberOfRows, matrix.getRowsCount());
        }
    }

    
    
    public static class CountColumnsTest {
        private Matrix matrix;

        @DataProvider(name = "dataProvider2")
        public static Object[][] data() {
            return new Object[][]{
                    {"0", 1},
                    {"0 1", 2},
                    {  "0\n"
                     + "1", 1},
                    {  "0 1\n"
                     + "2 3", 2},
                    {  "0 1 2\n"
                     + "3 4 5\n"
                     + "6 7 8", 3}
            };
        }


        @Test(dataProvider = "dataProvider2")
        public void countColumnsTest(String matrixAsString, int numberOfColumns) {
        	this.matrix = new Matrix(matrixAsString);
            assertEquals(numberOfColumns, matrix.getColumnsCount());
        }
    }

    
    
    public static class GetFirstRowTest {
        private Matrix matrix;

        @DataProvider(name = "dataProvider3")
        public static Object[][] data() {
            return new Object[][]{
                    {"0", new int[] {0}},
                    {"0 1", new int[] {0, 1}},
                    {  "0\n"
                     + "1", new int[] {0}},
                    {  "0 1\n"
                     + "2 3", new int[] {0, 1}},
                    {  "0 1 2\n"
                     + "3 4 5\n"
                     + "6 7 8", new int[] {0, 1, 2}}
            };
        }


        @Test(dataProvider = "dataProvider3")
        public void getFirstRowTest(String matrixAsString, int[] firstRow) {
        	this.matrix = new Matrix(matrixAsString);
            Assert.assertEquals(firstRow, matrix.getRow(0));
        }
    }

    
    
    public static class GetLastRowTest {
        private Matrix matrix;

	      @DataProvider(name = "dataProvider4")
	      public static Object[][] data() {
	          return new Object[][]{
	        	  {"0", new int[] {0}},
	              {"0 1", new int[] {0, 1}},
	              {  "0\n"
	               + "1", new int[] {1}},
	              {  "0 1\n"
	               + "2 3", new int[] {2, 3}},
	              {  "0 1 2\n"
	               + "3 4 5\n"
	               + "6 7 8", new int[] {6, 7, 8}}
	          };
	      }


        @Test(dataProvider = "dataProvider4")
        public void getLastRowTest(String matrixAsString, int[] lastRow) {
        	this.matrix = new Matrix(matrixAsString);
            Assert.assertEquals(lastRow, matrix.getRow(matrix.getRowsCount() - 1));
        }
    }

    
    
    public static class GetFirstColumnTest {
        private Matrix matrix;

        @DataProvider(name = "dataProvider5")
        public static Object[][] data() {
            return new Object[][]{
                    {"0", new int[] {0}},
                    {"0 1", new int[] {0}},
                    {  "0\n"
                     + "1", new int[] {0, 1}},
                    {  "0 1\n"
                     + "2 3", new int[] {0, 2}},
                    {  "0 1 2\n"
                     + "3 4 5\n"
                     + "6 7 8", new int[] {0, 3, 6}}
            };
        }


        @Test(dataProvider = "dataProvider5")
        public void getFirstColumnTest(String matrixAsString, int[] firstColumn) {
        	this.matrix = new Matrix(matrixAsString);
            Assert.assertEquals(firstColumn, matrix.getColumn(0));
        }
    }


    
    
    public static class GetLastColumnTest {
        private Matrix matrix;

        @DataProvider(name = "dataProvider6")
        public static Object[][] data() {
            return new Object[][]{
                    {"0", new int[] {0}},
                    {"0 1", new int[] {1}},
                    {  "0\n"
                     + "1", new int[] {0, 1}},
                    {  "0 1\n"
                     + "2 3", new int[] {1, 3}},
                    {  "0 1 2\n"
                     + "3 4 5\n"
                     + "6 7 8", new int[] {2, 5, 8}}
            };
        }


        @Test(dataProvider = "dataProvider6")
        public void getLastColumnTest(String matrixAsString, int[] lastColumn) {
        	this.matrix = new Matrix(matrixAsString);
            Assert.assertEquals(lastColumn, matrix.getColumn(matrix.getColumnsCount() - 1));
        }
    }
	
	
}
