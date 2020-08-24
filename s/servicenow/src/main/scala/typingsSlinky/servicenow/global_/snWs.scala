package typingsSlinky.servicenow.global_

import typingsSlinky.servicenow.servicenow.RestHTTPMethods
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
  }
  
}

