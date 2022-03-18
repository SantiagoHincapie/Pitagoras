import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame{
    private JLabel Teaorema_de_pitagoras;
    private JButton Calcular;
    private JButton BorrarCampos;
    private JButton Salir;
    private JTextField Ingrese_el_valor_A;
    private JTextField IngreseElValorB;
    private JLabel LaHipotenusaEs;
    private JLabel LadoA;
    private JLabel LadoB;
    private JLabel Hipotenusa;
    private JPanel Principal;


    public Form() {

        Calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ladoA=Ingrese_el_valor_A.getText();
                String ladoB=IngreseElValorB.getText();
                /*int a=Integer.parseInt(ladoA);
                int b=Integer.parseInt(ladoB);
                double h=Math.sqrt((Math.pow(a,2)+(Math.pow(b,2))));
                String hipotenusa=String.valueOf(h);
                LaHipotenusaEs.setText("La hipotenusa es de "+hipotenusa);*/
                LaHipotenusaEs.setText("El lado a es de "+ladoA+"El lado b es de "+ladoB);
            }
        });
        Salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(WIDTH);
            }
        });
        BorrarCampos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ingrese_el_valor_A.setText("");
                IngreseElValorB.setText("");
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }

    public static void main(String[] args) {

        /*Locale.setDefault(Locale.FRANCE);
        System.out.println(Locale.getDefault());*/

        System.out.println();
        JFrame frame = new JFrame("Form");
        frame.setContentPane(new Form().Principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
