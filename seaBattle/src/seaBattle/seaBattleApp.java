package seaBattle;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.custom.TableCursor;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class seaBattleApp {

	protected Shell shell;
	private Table table;
	private Table table_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			seaBattleApp window = new seaBattleApp();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION));
		shell.setSize(497, 300);
		shell.setText("SWT Application");
		
		table = new Table(shell, SWT.BORDER | SWT.FULL_SELECTION);
		table.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		table.setBounds(10, 10, 204, 199);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableItem tableItem1 = new TableItem(table, SWT.NONE);
		tableItem1.setText("1");
		
		TableItem tableItem2 = new TableItem(table, SWT.NONE);
		tableItem2.setText("2");
		
		TableColumn tblclmnNumCoord = new TableColumn(table, SWT.NONE);
		tblclmnNumCoord.setWidth(20);
		
		TableColumn tblclmnA = new TableColumn(table, SWT.NONE);
		tblclmnA.setWidth(20);
		tblclmnA.setText("A");
		
		TableColumn tblclmnB = new TableColumn(table, SWT.CENTER);
		tblclmnB.setWidth(20);
		tblclmnB.setText("B");
		
		TableColumn tblclmnC = new TableColumn(table, SWT.NONE);
		tblclmnC.setWidth(20);
		tblclmnC.setText("C");
		
		TableColumn tblclmnD = new TableColumn(table, SWT.NONE);
		tblclmnD.setWidth(20);
		tblclmnD.setText("D");
		
		TableColumn tblclmnE = new TableColumn(table, SWT.NONE);
		tblclmnE.setWidth(20);
		tblclmnE.setText("E");
		
		TableColumn tblclmnF = new TableColumn(table, SWT.NONE);
		tblclmnF.setWidth(20);
		tblclmnF.setText("F");
		
		TableColumn tblclmnG = new TableColumn(table, SWT.NONE);
		tblclmnG.setWidth(20);
		tblclmnG.setText("G");
		
		TableColumn tblclmnH = new TableColumn(table, SWT.NONE);
		tblclmnH.setWidth(20);
		tblclmnH.setText("H");
		
		TableColumn tblclmnI = new TableColumn(table, SWT.NONE);
		tblclmnI.setWidth(20);
		tblclmnI.setText("I");
		
		TableItem tableItem3 = new TableItem(table, SWT.NONE);
		tableItem3.setText("3");
		
		TableItem tableItem4 = new TableItem(table, SWT.NONE);
		tableItem4.setText("4");
		
		TableItem tableItem5 = new TableItem(table, SWT.NONE);
		tableItem5.setText("5");
		
		TableItem tableItem6 = new TableItem(table, SWT.NONE);
		tableItem6.setText("6");
		
		TableItem tableItem7 = new TableItem(table, SWT.NONE);
		tableItem7.setText("7");
		
		TableItem tableItem8 = new TableItem(table, SWT.NONE);
		tableItem8.setText("8");
		
		TableItem tableItem9 = new TableItem(table, SWT.NONE);
		tableItem9.setText("9");
		
		TableCursor tableCursor = new TableCursor(table, SWT.NONE);
		
		table_1 = new Table(shell, SWT.BORDER | SWT.FULL_SELECTION);
		table_1.setLinesVisible(true);
		table_1.setHeaderVisible(true);
		table_1.setBounds(267, 10, 204, 199);
		
		TableColumn tableColumn = new TableColumn(table_1, SWT.NONE);
		tableColumn.setWidth(20);
		
		TableColumn tableColumnA = new TableColumn(table_1, SWT.NONE);
		tableColumnA.setWidth(20);
		tableColumnA.setText("A");
		
		TableColumn tableColumnB = new TableColumn(table_1, SWT.CENTER);
		tableColumnB.setWidth(20);
		tableColumnB.setText("B");
		
		TableColumn tableColumnC = new TableColumn(table_1, SWT.NONE);
		tableColumnC.setWidth(20);
		tableColumnC.setText("C");
		
		TableColumn tableColumnD = new TableColumn(table_1, SWT.NONE);
		tableColumnD.setWidth(20);
		tableColumnD.setText("D");
		
		TableColumn tableColumnE = new TableColumn(table_1, SWT.NONE);
		tableColumnE.setWidth(20);
		tableColumnE.setText("E");
		
		TableColumn tableColumnF = new TableColumn(table_1, SWT.NONE);
		tableColumnF.setWidth(20);
		tableColumnF.setText("F");
		
		TableColumn tableColumnG = new TableColumn(table_1, SWT.NONE);
		tableColumnG.setWidth(20);
		tableColumnG.setText("G");
		
		TableColumn tableColumnH = new TableColumn(table_1, SWT.NONE);
		tableColumnH.setWidth(20);
		tableColumnH.setText("H");
		
		TableColumn tableColumnI = new TableColumn(table_1, SWT.NONE);
		tableColumnI.setWidth(20);
		tableColumnI.setText("I");
		
		TableItem tableItem_1 = new TableItem(table_1, SWT.NONE);
		tableItem_1.setText("1");
		
		TableItem tableItem_2 = new TableItem(table_1, SWT.NONE);
		tableItem_2.setText("2");
		
		TableItem tableItem_3 = new TableItem(table_1, SWT.NONE);
		tableItem_3.setText("3");
		
		TableItem tableItem_4 = new TableItem(table_1, SWT.NONE);
		tableItem_4.setText("4");
		
		TableItem tableItem_5 = new TableItem(table_1, SWT.NONE);
		tableItem_5.setText("5");
		
		TableItem tableItem_6 = new TableItem(table_1, SWT.NONE);
		tableItem_6.setText("6");
		
		TableItem tableItem_7 = new TableItem(table_1, SWT.NONE);
		tableItem_7.setText("7");
		
		TableItem tableItem_8 = new TableItem(table_1, SWT.NONE);
		tableItem_8.setText("8");
		
		TableItem tableItem_9 = new TableItem(table_1, SWT.NONE);
		tableItem_9.setText("9");
		
		TableCursor tableCursor_1 = new TableCursor(table_1, SWT.NONE);

	}
}
