package com.mycompany.adapterassignment;

/**
 *
 * @author Jerin
 */
public class Client {
    public static void main(String[] args){
        XML xml=new XML();
        xml.convertXmlFormat();
        
        PROTO proto=new PROTO();
        proto.convertProtoFormat();
        
         System.out.println("After adapter add:");
         
         AdapterWorks aw=new AdapterWorks(xml);
        aw.convertProtoFormat();
    
    }
}

 