/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginclient;

import client.LoginWS;
import client.LoginWS_Service;

/**
 *
 * @author Marcos
 */
public class LoginClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String user = "user111";
        String pass = "pass111";
        LoginWS_Service service = new LoginWS_Service();
        LoginWS port = service.getLoginWSPort();
//        System.out.println(port.hello(user, pass));
        System.out.println(port.adicionar(user, pass));

        
        
        
        
    }
    
}
