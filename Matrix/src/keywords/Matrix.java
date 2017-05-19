package keywords;

public class Matrix {
	private static String[] rowsString;
	private static int[] rowInteger;
	private static int[] colInteger;

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

	public int[] getRow(int rowNum) {
		try {
			return convertStringRowToIntRow(rowsString[rowNum]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public int[] getColumn(int colNum) {
		try {
			return convertStringColToIntCol(colNum);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private int[] convertStringRowToIntRow(String string) {
		try {

			String[] rowStringSplit = string.trim().split(" ");
			rowInteger = new int[rowStringSplit.length];

			for (int i = 0; i < rowStringSplit.length; i++) {
				rowInteger[i] = Integer.parseInt(rowStringSplit[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowInteger;
	}

	private int[] convertStringColToIntCol(int colNum) {
		try {
			String[] splitColString;
			colInteger = new int[rowsString.length];
			for (int count = 0; count < rowsString.length; count++) {
				splitColString = rowsString[count].trim().split(" ");
				colInteger[count] = Integer.parseInt(splitColString[colNum]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return colInteger;
	}

}
