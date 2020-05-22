package typingsSlinky.servicenow.global_

import typingsSlinky.servicenow.servicenow.RestHTTPMethods
import typingsSlinky.servicenow.servicenow.SOAPResponseV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sn_ws")
@js.native
object snWs extends js.Object {
  @js.native
  class RESTMessageV2 ()
    extends typingsSlinky.servicenow.snWs.RESTMessageV2 {
    def this(name: String, methodName: RestHTTPMethods) = this()
  }
  
  @js.native
  class SOAPMessageV2 ()
    extends typingsSlinky.servicenow.snWs.SOAPMessageV2 {
    def this(soapMessage: String, soapFunction: String) = this()
    /* CompleteClass */
    override def execute(): SOAPResponseV2 = js.native
    /* CompleteClass */
    override def executeAsync(): SOAPResponseV2 = js.native
    /* CompleteClass */
    override def getEndpoint(): String = js.native
    /* CompleteClass */
    override def getRequestBody(): String = js.native
    /* CompleteClass */
    override def getRequestHeader(headerName: String): String = js.native
    /* CompleteClass */
    override def getRequestHeaders(): js.Object = js.native
    /* CompleteClass */
    override def setBasicAuth(userName: String, userPass: String): Unit = js.native
    /* CompleteClass */
    override def setEccCorrelator(correlator: String): Unit = js.native
    /* CompleteClass */
    override def setEccParameter(name: String, value: String): Unit = js.native
    /* CompleteClass */
    override def setEndpoint(endpoint: String): Unit = js.native
    /* CompleteClass */
    override def setHttpMethod(method: String): Unit = js.native
    /* CompleteClass */
    override def setHttpTimeout(timeoutMs: Double): Unit = js.native
    /* CompleteClass */
    override def setMIDServer(midServer: String): Unit = js.native
    /* CompleteClass */
    override def setMutualAuth(profileName: String): Unit = js.native
    /* CompleteClass */
    override def setRequestBody(body: String): Unit = js.native
    /* CompleteClass */
    override def setRequestHeader(name: String, value: String): Unit = js.native
    /* CompleteClass */
    override def setStringParameter(name: String, value: String): Unit = js.native
    /* CompleteClass */
    override def setStringParameterNoEscape(name: String, value: String): Unit = js.native
    /* CompleteClass */
    override def setWSSecurity(keystoreId: String, keystoreAlias: String, keystorePassword: String, certificateId: String): Unit = js.native
  }
  
}

