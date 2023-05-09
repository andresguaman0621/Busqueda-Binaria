import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Interfaz extends JFrame{
    private JTabbedPane tabbedPane1;
    private JButton btnEjecutar;
    private JTextArea textArea;
    private JPanel mainPanel;
    private Busqueda b = new Busqueda();
    private int target = -1;
    public Interfaz() {
    btnEjecutar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            int nums_uno[] = Busqueda.generarArreglos(1001,0,1000);
            int nums_dos[] =Busqueda.generarArreglos(1000001,0,1000);
            int nums_tres[] = Busqueda.generarArreglos(10000001,0,1000);

            //PRIMER ARREGLO DE 1000
            long tInicio1= System.nanoTime();
            b.busquedaLineal(nums_uno,target);
            long tFinal1 = System.nanoTime();
            long total1 = tFinal1-tInicio1;

            textArea.append("Arreglo de 1000; busqueda lineal : ");


            long tInicio2 = System.nanoTime();
            b.busquedaBinaria(nums_uno,target);
            long tFinal2 = System.nanoTime();
            long total2 = tFinal2-tInicio2;
            textArea.append("Arreglo de 1000; busqueda binaria : "+ total2+"\n\n");

            //SEGUNDO ARREGLO DE 1000000
            long tInicio3 = System.nanoTime();
            b.busquedaLineal(nums_dos,target);
            long tFinal3 = System.nanoTime();
            long total3 = tFinal3-tInicio3;
            textArea.append("Arreglo de 1000000; busqueda lineal: "+total3+"\n");

            long tInicio4 = System.nanoTime();
            b.busquedaBinaria(nums_dos,target);
            long tFinal4 = System.nanoTime();
            long total4 = tFinal4-tInicio4;
            textArea.append("Arreglo de 1000000; busqueda lineal: "+total4+"\n\n");

            //TERCER ARREGLO DE 10000000
            long tInicio5 = System.nanoTime();
            b.busquedaLineal(nums_tres,target);
            long tFinal5 = System.nanoTime();
            long total5 = tFinal5-tInicio5;
            textArea.append("Arreglo de 10000000; busqueda lineal: "+total5+"\n");

            long tInicio6 = System.nanoTime();
            b.busquedaBinaria(nums_tres,target);
            long tFinal6 = System.nanoTime();
            long total6 = tFinal6-tInicio6;
            textArea.append("Arreglo de 10000000; busqueda lineal: "+total6+"\n");

        }
    });


    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
