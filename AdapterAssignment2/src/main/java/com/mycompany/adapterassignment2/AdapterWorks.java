package com.mycompany.adapterassignment2;

public class AdapterWorks implements ProtoAdapter {
     XML convertXml;
    
     public AdapterWorks( XML convertXml)
     {
         this.convertXml=convertXml;
     }
    @Override
     public void convertProtoFormat(){
         convertXml.convertXmlFormat();
     }
}
  
