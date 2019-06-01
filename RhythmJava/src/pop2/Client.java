package pop2;
import java.io.*;
import java.net.*;
import java.util.*;
//Author :- Ram Ghimire
class Client 
{
public Socket serv;
//This is a client which takes all the datas from clent details from server 
    public void request(Vector info) throws IOException, ClassNotFoundException
    {
    System.out.println("Connecting to the server");
    Socket serv = new Socket("127.0.0.1",3306);
    System.out.println("Connected to the server");
        
        ObjectOutputStream Request = new ObjectOutputStream(serv.getOutputStream());
        ObjectInputStream  Response = new ObjectInputStream(serv.getInputStream());
        Request.writeObject(info);
    }
    public void response() throws IOException, ClassNotFoundException
    {
        ObjectOutputStream Request = new ObjectOutputStream(serv.getOutputStream());
        ObjectInputStream  Response = new ObjectInputStream(serv.getInputStream());      
        
        Vector<String> Resp = new Vector<String>();
        Resp = (Vector<String>) Response.readObject();
        
        System.out.println(Resp.get(0));
        
    }
    
    
    
       
    }