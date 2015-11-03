import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

//This class renders a Jprogressbar in a table call
class ProgressRenderer extends JProgressBar implements TableCellRenderer
{
	//Constructor for ProgressRenderer
	public ProgressRenderer(int min, int max)
	{
		super(min,max);
	}
	
	/*Returns this JrogressBAR as the renderer for the given table call */
	public Component getTableCellRendererComponent(
		JTable table,Object value, boolean isSelected,boolean hasFocus, int row, int column)
	{
		//Set JProgressBar's percent completion value
		setValue((int) ((Float) value).floatValue());
		return this;
	}
}