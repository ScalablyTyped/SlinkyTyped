package typingsSlinky.ssh2.mod

import typingsSlinky.ssh2Streams.mod.Header
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientInfo extends StObject {
  
  /** Information about the client. */
  var header: Header = js.native
  
  /** The remote address of the connection. */
  var ip: String = js.native
}
object ClientInfo {
  
  @scala.inline
  def apply(header: Header, ip: String): ClientInfo = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientInfo]
  }
  
  @scala.inline
  implicit class ClientInfoMutableBuilder[Self <: ClientInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeader(value: Header): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
  }
}
