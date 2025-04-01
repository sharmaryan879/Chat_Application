/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverr;

/**
 *
 * @author lenovo
 */
public class MainServer 
{
    public static void main(String[] args) 
    {
       Server s= new Server();//it will invoke the GUI part
       s.waitingForClient();//it will wait for the client
       s.setIoStreams();//it will set the streams through which we will transfer the data
       
    }
}
