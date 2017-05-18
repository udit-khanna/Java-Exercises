package keywords;

public class Matrix {
	private static String[] rowsString;
	private static int[] rowInterger;

	public Matrix(String matrixAsString) {
		Matrix.rowsString = matrixAsString.split("\n");
	}

	public int getRowsCount() {
		int rowCount = 0;
		try {
			rowCount = rowsString.length;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}

	public int getColumnsCount() {
		int colCount = 0;
		String colNum1 = rowsString[0].replaceAll("\\s", "");
		try {
			colCount = colNum1.length();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return colCount;
	}

	public int[] getRow(int i) {
		try {
			return convertStringRowToIntRow(rowsString[i]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}



	public int getColumn(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	private int[] convertStringRowToIntRow(String string) {
		try {
			String[] splitRowString = string.split("\\s");
			for(int count=0;count<splitRowString.length;count++){
				System.out.println("value: "+splitRowString[count]);
				rowInterger[count] = Integer.parseInt(splitRowString[count]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(rowInterger);
		return rowInterger;
	}
	

}
