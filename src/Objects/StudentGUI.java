//package Objects;
//
//import org.eclipse.swt.SWT;
//import org.eclipse.swt.widgets.Display;
//import org.eclipse.swt.widgets.Shell;
//import org.eclipse.swt.widgets.Label;
//import org.eclipse.swt.widgets.Text;
//import org.eclipse.swt.widgets.Button;
//import org.eclipse.swt.events.SelectionAdapter;
//import org.eclipse.swt.events.SelectionEvent;
//
//public class StudentGUI {
//	private Text nametxt;
//	private Text testtxt1;
//	private Text testtxt2;
//	private Text testtxt3;
//	private Text Jtxtavg;
//	private Text countxt;
//	private Text text;
//
//	/**
//	 * Launch the application.
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		try {
//			StudentGUI window = new StudentGUI();
//			window.open();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	/**
//	 * Open the window.
//	 */
//	public void open() {
//		Display display = Display.getDefault();
//		Shell shlStudentGui = new Shell();
//		shlStudentGui.setSize(450, 350);
//		shlStudentGui.setText("Student GUI");
//		
//		Label lblName = new Label(shlStudentGui, SWT.NONE);
//		lblName.setBounds(10, 10, 55, 15);
//		lblName.setText("Name");
//		
//		nametxt = new Text(shlStudentGui, SWT.BORDER);
//		nametxt.setBounds(71, 10, 248, 21);
//		
//		Label lblTest = new Label(shlStudentGui, SWT.NONE);
//		lblTest.setBounds(10, 53, 55, 15);
//		lblTest.setText("Test 1");
//		
//		testtxt1 = new Text(shlStudentGui, SWT.BORDER);
//		testtxt1.setBounds(71, 50, 76, 21);
//		
//		Label lblTest_1 = new Label(shlStudentGui, SWT.NONE);
//		lblTest_1.setBounds(10, 94, 55, 15);
//		lblTest_1.setText("Test 2");
//		
//		testtxt2 = new Text(shlStudentGui, SWT.BORDER);
//		testtxt2.setBounds(71, 91, 76, 21);
//		
//		Label lblTest_2 = new Label(shlStudentGui, SWT.NONE);
//		lblTest_2.setBounds(10, 131, 55, 15);
//		lblTest_2.setText("Test 3");
//		
//		testtxt3 = new Text(shlStudentGui, SWT.BORDER);
//		testtxt3.setBounds(71, 128, 76, 21);
//		
//		Label lblAverage = new Label(shlStudentGui, SWT.NONE);
//		lblAverage.setBounds(10, 176, 55, 15);
//		lblAverage.setText("Average");
//		
//		Jtxtavg = new Text(shlStudentGui, SWT.BORDER);
//		Jtxtavg.setBounds(71, 176, 76, 21);
//		
//		Button dblback = new Button(shlStudentGui, SWT.NONE);
//		dblback.setBounds(29, 235, 75, 25);
//		dblback.setText("<<");
//		
//		Button oneback = new Button(shlStudentGui, SWT.NONE);
//		oneback.setBounds(110, 235, 75, 25);
//		oneback.setText("<");
//		
//		Button onefore = new Button(shlStudentGui, SWT.NONE);
//		onefore.setBounds(254, 235, 75, 25);
//		onefore.setText(">");
//		
//		Button dblfore = new Button(shlStudentGui, SWT.NONE);
//		dblfore.setBounds(335, 235, 75, 25);
//		dblfore.setText(">>");
//		
//		Button btnAdd = new Button(shlStudentGui, SWT.NONE);
//		btnAdd.setBounds(299, 66, 75, 25);
//		btnAdd.setText("ADD");
//		
//		Button btnModify = new Button(shlStudentGui, SWT.NONE);
//		btnModify.setBounds(299, 121, 75, 25);
//		btnModify.setText("MODIFY");
//		
//		Label lblCount = new Label(shlStudentGui, SWT.NONE);
//		lblCount.setBounds(29, 283, 55, 15);
//		lblCount.setText("Count");
//		
//		countxt = new Text(shlStudentGui, SWT.BORDER);
//		countxt.setBounds(108, 280, 76, 21);
//		
//		Label lblCurrentIndex = new Label(shlStudentGui, SWT.NONE);
//		lblCurrentIndex.setBounds(216, 283, 76, 15);
//		lblCurrentIndex.setText("Current Index");
//		
//		text = new Text(shlStudentGui, SWT.BORDER);
//		text.setBounds(310, 280, 76, 21);
//
//		shlStudentGui.open();
//		shlStudentGui.layout();
//		while (!shlStudentGui.isDisposed()) {
//			if (!display.readAndDispatch()) {
//				display.sleep();
//			}
//		}
//	}
//}
