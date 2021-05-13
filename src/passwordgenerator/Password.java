/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordgenerator;

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class Password {

    private boolean lowerCase;
    private boolean upperCase;
    private boolean numbers;
    private boolean symbols;
    private int length;

    public Password(boolean lowerCase, boolean upperCase, boolean numbers, boolean symbols, int length) {
        this.lowerCase = lowerCase;
        this.upperCase = upperCase;
        this.numbers = numbers;
        this.symbols = symbols;
        this.length = length;
    }

    private String confOptions() {
        String lowerLetters = "abcdefghijklmnopqrstuvwxyz";
        String upperLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String symbols = "@#$%&/*-+()?¿[]{}";

        if (!this.lowerCase) {
            lowerLetters = "";
        }
        if (!this.upperCase) {
            upperLetters = "";
        }
        if (!this.numbers) {
            numbers = "";
        }
        if (!this.symbols) {
            symbols = "";
        }
        
        return lowerLetters + upperLetters + numbers + symbols;
    }

    public String getPassword() {
        String password = "";

        if (uncheckedCheckboxes()) {
            JOptionPane.showMessageDialog(null, "Tienes que selecionar algo!");
        } else {
            for (int i = 0; i < this.length; i++) {
                password += confOptions().charAt(getRandomNumber(0, confOptions().length()));
            }
        }
        return password;
    }
    
    private boolean uncheckedCheckboxes() {
        boolean[] checkboxes = {this.lowerCase, this.upperCase, this.numbers, this.symbols}; 
        
        for (int i = 0; i < checkboxes.length; i++) {
            if (checkboxes[i]) {
                return false;
            }
        }
        return true;
    }

    private int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

}
