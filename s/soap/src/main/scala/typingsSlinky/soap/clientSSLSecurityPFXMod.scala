package typingsSlinky.soap

import typingsSlinky.node.Buffer
import typingsSlinky.soap.typesMod.ISecurity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientSSLSecurityPFXMod {
  
  @JSImport("soap/lib/security/ClientSSLSecurityPFX", "ClientSSLSecurityPFX")
  @js.native
  class ClientSSLSecurityPFX protected () extends ISecurity {
    def this(pfx: String) = this()
    def this(pfx: Buffer) = this()
    def this(pfx: String, defaults: js.Any) = this()
    def this(pfx: Buffer, defaults: js.Any) = this()
    
    @JSName("addOptions")
    def addOptions_MClientSSLSecurityPFX(options: js.Any): Unit = js.native
    
    var defaults: js.Any = js.native
    
    var passphrase: js.Any = js.native
    
    var pfx: js.Any = js.native
    
    @JSName("toXML")
    def toXML_MClientSSLSecurityPFX(): String = js.native
  }
}
