PrinterJob pjob=PrintJob.getPrinterJob();
PageFormat preformat = pjob.defaultPage();
preformat.setOrientation(PageFormat.LANDSCAPE);
PageFormat postformat =pjob.pageDialog(preformat);
if(preformat!=postformat)
{
  pjob.setPrintable(new Printer(printPanel),postformat);
  if(pjob.printDialog())
  {
    try
	{
	 pjob.print();
	}
	catch(PrinterException e)
	{
	   e.printStackTrace();
	}
	
  }
}