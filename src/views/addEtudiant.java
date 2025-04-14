package views;
import java.awt.*;
import javax.swing.*;
import modules.GestionEtudiants;
import modules.etudiant;
import modules.tableModele;
public class addEtudiant extends JFrame{
    public addEtudiant() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLocationRelativeTo(null);
        setSize(600, 400);
        setTitle("Ajouter un étudiant");


    //Header:
        JPanel header = new JPanel();
        header.setBorder(BorderFactory.createTitledBorder("information d'etudiants"));
        header.setLayout(new GridLayout(2,2));

        JLabel lname = new JLabel("Nom");
        JTextField name = new JTextField(15);
        JPanel grid00= new JPanel();
        grid00.add(lname);
        grid00.add(name);

        JLabel lprenom = new JLabel("preom");
        JTextField prenom = new JTextField(15);
        JPanel grid01 = new JPanel();
        grid01.add(lprenom);
        grid01.add(prenom);

        JPanel grid10 = new JPanel();
        JLabel fl = new JLabel("filiaire");
        String[] items = {"item1", "item2", "item3", "item4", "item5"};
        JComboBox<String> select = new JComboBox<>(items);
        grid10.add(fl);
        grid10.add(select);
        
        JPanel grid11 = new JPanel();
        JLabel sexe = new JLabel("sexe");
        JRadioButton r1 = new JRadioButton("h");
        JRadioButton r2 = new JRadioButton("f");
        ButtonGroup bg = new ButtonGroup();
        r1.setSelected(true);
        bg.add(r1);
        bg.add(r2);
        grid11.add(sexe);
        grid11.add(r1);
        grid11.add(r2);

        header.add(grid00);
        header.add(grid01);
        header.add(grid10);
        header.add(grid11);
        add(header, BorderLayout.NORTH);
    //body:
        tableModele tm = new tableModele();
        JTable table = new JTable(tm);
        GestionEtudiants ge = new GestionEtudiants();
        JScrollPane body = new JScrollPane(table);
        tm.setEtudiants(ge.listeDesEtudiants());
        add(body, BorderLayout.CENTER);
        
       
        


    //footer:
        JPanel footer = new JPanel();
        footer.setLayout(new BorderLayout());
        JPanel buttons = new JPanel();
        JButton ajouter = new JButton("ajouter");
        JButton annuler = new JButton("anuuler");
        JButton suppButton = new JButton("supprimer");
        buttons.add(ajouter);
        buttons.add(annuler);
        buttons.add(suppButton);
        footer.add(buttons, BorderLayout.SOUTH);
        add(footer, BorderLayout.SOUTH);
        ajouter.addActionListener(e -> {
            String nom = name.getText();
            String prenom1 = prenom.getText();
            String filiere = (String) select.getSelectedItem();
            String sexe1 = r1.isSelected() ? "h" : "f";
            etudiant e1 = new etudiant(nom, prenom1, filiere, sexe1);
            ge.ajouterEtudiant(e1);
            tm.setEtudiants(ge.listeDesEtudiants());
        });

        annuler.addActionListener(e -> {
            name.setText("");
            prenom.setText("");
            select.setSelectedIndex(0);
            r1.setSelected(true);
        });

        buttons.add(suppButton);
        suppButton.addActionListener(e -> {
            String id = JOptionPane.showInputDialog("id de l'etudiant a supprimer");
            if (id != null) {
                ge.supprimerEtudiant(Integer.parseInt(id));
            }
            tm.setEtudiants(ge.listeDesEtudiants());
        });
    }

}
