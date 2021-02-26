package typingsSlinky.servicenow

import typingsSlinky.servicenow.servicenow.RESTResponseV2
import typingsSlinky.servicenow.servicenow.RestHTTPMethods
import typingsSlinky.servicenow.servicenow.SOAPResponseV2
import typingsSlinky.servicenow.servicenowStrings.all
import typingsSlinky.servicenow.servicenowStrings.basic
import typingsSlinky.servicenow.servicenowStrings.elevated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snWs {
  
  @js.native
  trait RESTMessageV2 extends StObject {
    
    def execute(): RESTResponseV2 = js.native
    
    def executeAsync(): RESTResponseV2 = js.native
    
    def getEndpoint(): String = js.native
    
    def getRequestBody(): String = js.native
    
    def getRequestHeader(headerName: String): String = js.native
    
    def getRequestHeaders(): js.Object = js.native
    
    def saveResponseBodyAsAttachment(tableName: String, recordSysId: String, fileName: String): Unit = js.native
    def saveResponseBodyAsAttachment(tableName: String, recordSysId: String, fileName: String, encryptContext: String): Unit = js.native
    
    def setAuthenticationProfile(`type`: String, profileId: String): Unit = js.native
    
    def setBasicAuth(userName: String, userPass: String): Unit = js.native
    
    def setEccCorrelator(correlator: String): Unit = js.native
    
    def setEccParameter(name: String, value: String): Unit = js.native
    
    def setEndpoint(endpoint: String): Unit = js.native
    
    def setHttpMethod(method: RestHTTPMethods): Unit = js.native
    
    def setHttpTimeout(timeoutMs: Double): Unit = js.native
    
    @JSName("setLogLevel")
    def setLogLevel_all(level: all): Unit = js.native
    @JSName("setLogLevel")
    def setLogLevel_basic(level: basic): Unit = js.native
    @JSName("setLogLevel")
    def setLogLevel_elevated(level: elevated): Unit = js.native
    
    def setMIDServer(midServer: String): Unit = js.native
    
    def setMutualAuth(profileName: String): Unit = js.native
    
    def setQueryParameter(name: String, value: String): Unit = js.native
    
    def setRequestBody(body: String): Unit = js.native
    
    def setRequestBodyFromAttachment(sys_id: String): Unit = js.native
    
    def setRequestBodyFromStream(stream: js.Object): Unit = js.native
    
    def setRequestHeader(name: String, value: String): Unit = js.native
    
    def setRequestorProfile(requestorContext: String, requestorId: String): Unit = js.native
    
    def setStringParameter(name: String, value: String): Unit = js.native
    
    def setStringParameterNoEscape(name: String, value: String): Unit = js.native
  }
  
  @js.native
  trait SOAPMessageV2 extends StObject {
    
    def execute(): SOAPResponseV2 = js.native
    
    def executeAsync(): SOAPResponseV2 = js.native
    
    def getEndpoint(): String = js.native
    
    def getRequestBody(): String = js.native
    
    def getRequestHeader(headerName: String): String = js.native
    
    def getRequestHeaders(): js.Object = js.native
    
    def setBasicAuth(userName: String, userPass: String): Unit = js.native
    
    def setEccCorrelator(correlator: String): Unit = js.native
    
    def setEccParameter(name: String, value: String): Unit = js.native
    
    def setEndpoint(endpoint: String): Unit = js.native
    
    def setHttpMethod(method: String): Unit = js.native
    
    def setHttpTimeout(timeoutMs: Double): Unit = js.native
    
    def setMIDServer(midServer: String): Unit = js.native
    
    def setMutualAuth(profileName: String): Unit = js.native
    
    def setRequestBody(body: String): Unit = js.native
    
    def setRequestHeader(name: String, value: String): Unit = js.native
    
    def setStringParameter(name: String, value: String): Unit = js.native
    
    def setStringParameterNoEscape(name: String, value: String): Unit = js.native
    
    def setWSSecurity(keystoreId: String, keystoreAlias: String, keystorePassword: String, certificateId: String): Unit = js.native
  }
  object SOAPMessageV2 {
    
    @scala.inline
    def apply(
      execute: () => SOAPResponseV2,
      executeAsync: () => SOAPResponseV2,
      getEndpoint: () => String,
      getRequestBody: () => String,
      getRequestHeader: String => String,
      getRequestHeaders: () => js.Object,
      setBasicAuth: (String, String) => Unit,
      setEccCorrelator: String => Unit,
      setEccParameter: (String, String) => Unit,
      setEndpoint: String => Unit,
      setHttpMethod: String => Unit,
      setHttpTimeout: Double => Unit,
      setMIDServer: String => Unit,
      setMutualAuth: String => Unit,
      setRequestBody: String => Unit,
      setRequestHeader: (String, String) => Unit,
      setStringParameter: (String, String) => Unit,
      setStringParameterNoEscape: (String, String) => Unit,
      setWSSecurity: (String, String, String, String) => Unit
    ): SOAPMessageV2 = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), executeAsync = js.Any.fromFunction0(executeAsync), getEndpoint = js.Any.fromFunction0(getEndpoint), getRequestBody = js.Any.fromFunction0(getRequestBody), getRequestHeader = js.Any.fromFunction1(getRequestHeader), getRequestHeaders = js.Any.fromFunction0(getRequestHeaders), setBasicAuth = js.Any.fromFunction2(setBasicAuth), setEccCorrelator = js.Any.fromFunction1(setEccCorrelator), setEccParameter = js.Any.fromFunction2(setEccParameter), setEndpoint = js.Any.fromFunction1(setEndpoint), setHttpMethod = js.Any.fromFunction1(setHttpMethod), setHttpTimeout = js.Any.fromFunction1(setHttpTimeout), setMIDServer = js.Any.fromFunction1(setMIDServer), setMutualAuth = js.Any.fromFunction1(setMutualAuth), setRequestBody = js.Any.fromFunction1(setRequestBody), setRequestHeader = js.Any.fromFunction2(setRequestHeader), setStringParameter = js.Any.fromFunction2(setStringParameter), setStringParameterNoEscape = js.Any.fromFunction2(setStringParameterNoEscape), setWSSecurity = js.Any.fromFunction4(setWSSecurity))
      __obj.asInstanceOf[SOAPMessageV2]
    }
    
    @scala.inline
    implicit class SOAPMessageV2MutableBuilder[Self <: SOAPMessageV2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecute(value: () => SOAPResponseV2): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExecuteAsync(value: () => SOAPResponseV2): Self = StObject.set(x, "executeAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEndpoint(value: () => String): Self = StObject.set(x, "getEndpoint", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRequestBody(value: () => String): Self = StObject.set(x, "getRequestBody", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRequestHeader(value: String => String): Self = StObject.set(x, "getRequestHeader", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetRequestHeaders(value: () => js.Object): Self = StObject.set(x, "getRequestHeaders", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetBasicAuth(value: (String, String) => Unit): Self = StObject.set(x, "setBasicAuth", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetEccCorrelator(value: String => Unit): Self = StObject.set(x, "setEccCorrelator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetEccParameter(value: (String, String) => Unit): Self = StObject.set(x, "setEccParameter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetEndpoint(value: String => Unit): Self = StObject.set(x, "setEndpoint", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHttpMethod(value: String => Unit): Self = StObject.set(x, "setHttpMethod", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHttpTimeout(value: Double => Unit): Self = StObject.set(x, "setHttpTimeout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMIDServer(value: String => Unit): Self = StObject.set(x, "setMIDServer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMutualAuth(value: String => Unit): Self = StObject.set(x, "setMutualAuth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetRequestBody(value: String => Unit): Self = StObject.set(x, "setRequestBody", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetRequestHeader(value: (String, String) => Unit): Self = StObject.set(x, "setRequestHeader", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetStringParameter(value: (String, String) => Unit): Self = StObject.set(x, "setStringParameter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetStringParameterNoEscape(value: (String, String) => Unit): Self = StObject.set(x, "setStringParameterNoEscape", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetWSSecurity(value: (String, String, String, String) => Unit): Self = StObject.set(x, "setWSSecurity", js.Any.fromFunction4(value))
    }
  }
}
