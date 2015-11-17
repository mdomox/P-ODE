
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
    @ASN1Sequence ( name = "DataSubscriptionCancel", isSet = false )
    public class DataSubscriptionCancel implements IASN1PreparedElement {
            
        @ASN1Element ( name = "dialogID", isOptional =  false , hasTag =  true, tag = 0 , hasDefaultValue =  false  )
    
	private PodeDialogID dialogID = null;
                
  
        @ASN1Element ( name = "seqID", isOptional =  false , hasTag =  true, tag = 1 , hasDefaultValue =  false  )
    
	private SemiSequenceID seqID = null;
                
  
        @ASN1Element ( name = "groupID", isOptional =  false , hasTag =  true, tag = 2 , hasDefaultValue =  false  )
    
	private GroupID groupID = null;
                
  @ASN1OctetString( name = "" )
    
            @ASN1SizeConstraint ( max = 4L )
        
        @ASN1Element ( name = "requestID", isOptional =  false , hasTag =  true, tag = 3 , hasDefaultValue =  false  )
    
	private byte[] requestID = null;
                
  @ASN1OctetString( name = "" )
    
            @ASN1SizeConstraint ( max = 4L )
        
        @ASN1Element ( name = "subID", isOptional =  false , hasTag =  true, tag = 4 , hasDefaultValue =  false  )
    
	private byte[] subID = null;
                
  
        
        public PodeDialogID getDialogID () {
            return this.dialogID;
        }

        

        public void setDialogID (PodeDialogID value) {
            this.dialogID = value;
        }
        
  
        
        public SemiSequenceID getSeqID () {
            return this.seqID;
        }

        

        public void setSeqID (SemiSequenceID value) {
            this.seqID = value;
        }
        
  
        
        public GroupID getGroupID () {
            return this.groupID;
        }

        

        public void setGroupID (GroupID value) {
            this.groupID = value;
        }
        
  
        
        public byte[] getRequestID () {
            return this.requestID;
        }

        

        public void setRequestID (byte[] value) {
            this.requestID = value;
        }
        
  
        
        public byte[] getSubID () {
            return this.subID;
        }

        

        public void setSubID (byte[] value) {
            this.subID = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(DataSubscriptionCancel.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            