
package com.leidos.ode.data;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net 
// Any modifications to this file will be lost upon recompilation of the source ASN.1. 
//

import org.bn.*;
import org.bn.annotations.*;
import org.bn.annotations.constraints.*;
import org.bn.coders.*;
import org.bn.types.*;




    @ASN1PreparedElement
    @ASN1Sequence ( name = "PodeSpatMap", isSet = false )
    public class PodeSpatMap implements IASN1PreparedElement {
            @ASN1OctetString( name = "" )
    
            @ASN1SizeConstraint ( max = 1400L )
        
        @ASN1Element ( name = "fhwaSpat", isOptional =  false , hasTag =  true, tag = 0 , hasDefaultValue =  false  )
    
	private byte[] fhwaSpat = null;
                
  @ASN1OctetString( name = "" )
    
            @ASN1SizeConstraint ( max = 1400L )
        
        @ASN1Element ( name = "fhwaMap", isOptional =  false , hasTag =  true, tag = 1 , hasDefaultValue =  false  )
    
	private byte[] fhwaMap = null;
                
  
        
        public byte[] getFhwaSpat () {
            return this.fhwaSpat;
        }

        

        public void setFhwaSpat (byte[] value) {
            this.fhwaSpat = value;
        }
        
  
        
        public byte[] getFhwaMap () {
            return this.fhwaMap;
        }

        

        public void setFhwaMap (byte[] value) {
            this.fhwaMap = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(PodeSpatMap.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            