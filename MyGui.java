import java.awt.*
import java.awt.event.*
class MyGui extends frame
{
private frame frm;
private label lbl;
private textfield txt;
private button btn,exbtn;
}
MyGui()
{
frm= new Frame ("my gui");
lbl=new label ("see here")
btn=new button ("click Me")
exbtn=new button("exit)";
txt= new textfield(20);
frm.setlayout (new flowlayout());
frm.add(txt);
frm.add(lbl);
frm.add(btn);
frm.add (exbtn);
frm.setsize(400,300);
frm.SetLocationRelativeTO(null);
frm.SetVisible(true);
exbtn.addActionListener(new ActionListener())
{
public void ActionPerformed(ActionEvent ae);
{
	system exit(1);
}	
});
}
btn.add ActionListener(new ActionListener())
{
	public void actionPerformed (ActionEvent ae)
	{
		lbl.set Text(txt.get Text());
	}
});
pyblic static void main (string a[])
{
	new MyGui();
}
}
}
	}
}
