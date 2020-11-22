package typingsSlinky.soap

import typingsSlinky.soap.typesMod.IHeaders
import typingsSlinky.soap.typesMod.ISecurity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("soap/lib/security/BasicAuthSecurity", JSImport.Namespace)
@js.native
object basicAuthSecurityMod extends js.Object {
  
  @js.native
  class BasicAuthSecurity protected () extends ISecurity {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, defaults: js.Any) = this()
    
    var _password: js.Any = js.native
    
    var _username: js.Any = js.native
    
    @JSName("addHeaders")
    def addHeaders_MBasicAuthSecurity(headers: IHeaders): Unit = js.native
    
    @JSName("addOptions")
    def addOptions_MBasicAuthSecurity(options: js.Any): Unit = js.native
    
    var defaults: js.Any = js.native
    
    @JSName("toXML")
    def toXML_MBasicAuthSecurity(): String = js.native
  }
}
