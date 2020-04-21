/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ResearchScientistRole;

import Business.Visitor.Phase;
import Business.Visitor.Visitor;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class LineChart_AWT extends ApplicationFrame {

    private Visitor visitor;
   public LineChart_AWT(Visitor visitor, String applicationTitle , String chartTitle ) {
      super(applicationTitle);
      this.visitor=visitor;
      JFreeChart lineChart = ChartFactory.createLineChart(
         chartTitle,
         "Phases","Antibodies",
         createDataset(),
         PlotOrientation.VERTICAL,
         true,true,false);
         
      ChartPanel chartPanel = new ChartPanel( lineChart );
      chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
      setContentPane( chartPanel );
   }

   
   private DefaultCategoryDataset createDataset( ) {
       
   Phase phase1 = visitor.searchPhase("Phase1");
   Phase phase2 = visitor.searchPhase("Phase2");
   Phase phase3 = visitor.searchPhase("Phase3");
   Phase phase4 = visitor.searchPhase("Phase4");
   String patientName=visitor.getName();
      DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
      dataset.addValue( phase1.getAntibodiesCount() , patientName  , "Phase1" );
      dataset.addValue( phase2.getAntibodiesCount() , patientName , "Phase2" );
      dataset.addValue( phase3.getAntibodiesCount() , patientName , "Phase3" );
      dataset.addValue( phase4.getAntibodiesCount() , patientName , "Phase4" );
      
      System.out.println(phase1.getAntibodiesCount());
       System.out.println(phase2.getAntibodiesCount());
        System.out.println(phase3.getAntibodiesCount());
         System.out.println(phase4.getAntibodiesCount());
      return dataset;
      
   }
   /*
   public static void main( String[ ] args ) {
      LineChart_AWT chart = new LineChart_AWT(
         "School Vs Years" ,
         "Numer of Schools vs years");

      chart.pack( );
      RefineryUtilities.centerFrameOnScreen( chart );
      chart.setVisible( true );
   }*/
}
