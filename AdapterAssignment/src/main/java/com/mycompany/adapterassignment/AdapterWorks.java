
package com.mycompany.adapterassignment;

/**
 *
 * @author User
 */
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
