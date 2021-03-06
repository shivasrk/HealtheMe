/**
 * Copyright (C) 2012 KRM Associates, Inc. healtheme@krminc.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.krminc.phr.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CCRServiceHttpPost", targetNamespace = "http://tempuri.org/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CCRServiceHttpPost {


    /**
     * 
     * @param verify
     * @param access
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "CCRServiceLogin")
    @WebResult(name = "boolean", targetNamespace = "http://tempuri.org/", partName = "Body")
    public boolean ccrServiceLogin(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "access")
        String access,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "verify")
        String verify);

    /**
     * 
     * @param verify
     * @param access
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Ping")
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public String ping(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "access")
        String access,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "verify")
        String verify);

    /**
     * 
     * @param verify
     * @param ien
     * @param access
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetCCRForPatientDFN")
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public String getCCRForPatientDFN(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "access")
        String access,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "verify")
        String verify,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "IEN")
        String ien);

    /**
     * 
     * @param verify
     * @param ien
     * @param access
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetCCDForPatientDFN")
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public String getCCDForPatientDFN(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "access")
        String access,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "verify")
        String verify,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "IEN")
        String ien);

    /**
     * 
     * @param verify
     * @param ien
     * @param access
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetXSLFormattedCCRForPatientDFN")
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public String getXSLFormattedCCRForPatientDFN(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "access")
        String access,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "verify")
        String verify,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "IEN")
        String ien);

    /**
     * 
     * @param verify
     * @param ien
     * @param access
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetXSLFormattedCCDForPatientDFN")
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public String getXSLFormattedCCDForPatientDFN(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "access")
        String access,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "verify")
        String verify,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "IEN")
        String ien);

    /**
     * 
     * @return
     *     returns com.krminc.phr.ws.ArrayOfFMPatient
     */
    @WebMethod(operationName = "GetAllPatients")
    @WebResult(name = "ArrayOfFMPatient", targetNamespace = "http://tempuri.org/", partName = "Body")
    public ArrayOfFMPatient getAllPatients();

    /**
     * 
     * @param id
     * @param verify
     * @param access
     * @return
     *     returns com.krminc.phr.ws.ArrayOfFMPatient
     */
    @WebMethod(operationName = "LookupPatientsByID")
    @WebResult(name = "ArrayOfFMPatient", targetNamespace = "http://tempuri.org/", partName = "Body")
    public ArrayOfFMPatient lookupPatientsByID(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "access")
        String access,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "verify")
        String verify,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "ID")
        String id);

    /**
     * 
     * @param verify
     * @param name
     * @param access
     * @return
     *     returns com.krminc.phr.ws.ArrayOfFMPatient
     */
    @WebMethod(operationName = "LookupPatientsByName")
    @WebResult(name = "ArrayOfFMPatient", targetNamespace = "http://tempuri.org/", partName = "Body")
    public ArrayOfFMPatient lookupPatientsByName(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "access")
        String access,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "verify")
        String verify,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "name")
        String name);

}
