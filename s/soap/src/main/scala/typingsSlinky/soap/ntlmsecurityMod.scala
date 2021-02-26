package typingsSlinky.soap

import typingsSlinky.soap.typesMod.IHeaders
import typingsSlinky.soap.typesMod.ISecurity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ntlmsecurityMod {
  
  @JSImport("soap/lib/security/NTLMSecurity", "NTLMSecurity")
  @js.native
  class NTLMSecurity protected () extends ISecurity {
    def this(defaults: js.Any) = this()
    
    @JSName("addHeaders")
    def addHeaders_MNTLMSecurity(headers: IHeaders): Unit = js.native
    
    @JSName("addOptions")
    def addOptions_MNTLMSecurity(options: js.Any): Unit = js.native
    
    var defaults: js.Any = js.native
    
    @JSName("toXML")
    def toXML_MNTLMSecurity(): String = js.native
  }
}
