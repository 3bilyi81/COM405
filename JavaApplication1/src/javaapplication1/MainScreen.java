/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author cunninghad
 */
public class MainScreen extends JFrame implements ActionListener
{
    private JLabel lblReg, 
                   lblColour, 
                    lblStatus;
    
    private JTextField txtReg, txtColour;
    
    private JButton btnAdd, btnRemove;
    
    private GridBagConstraints constraints;
    
    private Carpark cp;
    
    public MainScreen()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        constraints = new GridBagConstraints();
        cp = new Carpark();
        initComponents();
        layoutComponents();
    }
    
    public void initComponents()
    {
        lblReg = new JLabel("Reg No:");
        lblColour = new JLabel("Colour:");
        lblStatus = new JLabel("There are 15 spaces");
        
        txtReg = new JTextField();
        txtColour = new JTextField();
        
        btnAdd = new JButton("Add Car");
        btnAdd.addActionListener(this);
        btnRemove = new JButton("Remove Car");
        btnRemove.addActionListener(this);
    }
    
    public void layoutComponents()
    {
        constraints.gridy = 0;
        constraints.gridx = 0;
        this.add(lblReg, constraints);
        
        constraints.gridx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txtReg, constraints);
        
        constraints.gridy = 1;
        constraints.gridx = 0;
        constraints.fill = GridBagConstraints.NONE;
        this.add(lblColour, constraints);
        
        constraints.gridx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txtColour, constraints);
        
        constraints.gridy = 2;
        constraints.gridx = 0;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.NONE;
        this.add(lblStatus, constraints);
        
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        this.add(btnAdd, constraints);
        
        constraints.gridx = 1;
        this.add(btnRemove, constraints);
    }

    @Override
    public void actionPerformed(ActionEvent ev) 
    {
        if(ev.getSource().equals(btnAdd))
        {
            String reg = txtReg.getText();
            String colour = txtColour.getText();
            
            if(cp.addCar(new Car(reg, colour)))
            {
                lblStatus.setText("There are " + cp.calcEmptySpaces() + " spaces");
                txtReg.setText("");
                JOptionPane.showMessageDialog(null, "Added");
            }
            else
            {
                
                JOptionPane.showMessageDialog(null, "Car park is full!");
            }

        }
        else if(ev.getSource().equals(btnRemove))
        {
            String reg = txtReg.getText();
            
            if(cp.removeCar(reg))
            {
                lblStatus.setText("There are " + cp.calcEmptySpaces() + " spaces");
                JOptionPane.showMessageDialog(null, "Removed");
            }
            else
            {
                
                JOptionPane.showMessageDialog(null, "Car does not exist!");
            }
        }
    }
}
