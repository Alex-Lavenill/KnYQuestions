import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KnYQSwing extends JFrame{
    private Arvore knyArvore = new Arvore();
    private JLabel lblPreFixa;
    private JLabel lblMutavel;
    private JButton simButton;
    private JButton naoButton;
    private JPanel rootPanel;
    private JLabel lblFinal;
    boolean achou = false;

    KnYQSwing(){

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        lblFinal.setVisible(false);
        add(rootPanel);
        setTitle("Kimetsu no Yaiba Questions");

        setLblPreFixa("Seu personagem....");
        setLblMutavel(knyArvore.getPergunta());

        simButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                knyArvore.sim();
                if (!achou) {
                    int conteudo = knyArvore.conteudo();
                    if (conteudo == 0) {
                        setLblPreFixa("Seu personagem....");
                        setLblMutavel(knyArvore.getPergunta());
                    } else {
                        setLblPreFixa("Você pensou em...");
                        setLblMutavel(knyArvore.getPersonagem());
                        setLblFinal("Acertei?");
                        lblFinal.setVisible(true);
                        achou = true;
                    }
                }
                else{
                    lblFinal.setVisible(false);
                    simButton.setVisible(false);
                    naoButton.setVisible(false);
                    setLblPreFixa("Yeah!");
                    setLblMutavel("Eu sempre acerto!");
                }

            }
        });
        naoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                knyArvore.nao();
                if (!achou) {
                    int conteudo = knyArvore.conteudo();
                    if (conteudo == 0) {
                        setLblPreFixa("Seu personagem....");
                        setLblMutavel(knyArvore.getPergunta());
                    } else {
                        setLblPreFixa("Você pensou em...");
                        setLblMutavel(knyArvore.getPersonagem());
                        setLblFinal("Acertei?");
                        lblFinal.setVisible(true);
                        achou = true;
                    }
                }
                else{
                    lblFinal.setVisible(false);
                    simButton.setVisible(false);
                    naoButton.setVisible(false);
                    setLblPreFixa("Puts!");
                    setLblMutavel("Errei então...");
                }

            }
        });
    }

    public void setLblMutavel(String texto) {
        this.lblMutavel.setText(texto);
    }

    public void setLblPreFixa(String texto) {
        this.lblPreFixa.setText(texto);
    }

    public void setLblFinal(String texto){
        this.lblFinal.setText(texto);
    }

}
