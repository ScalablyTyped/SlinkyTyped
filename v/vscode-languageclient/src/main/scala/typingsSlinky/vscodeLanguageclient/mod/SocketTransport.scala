package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.vscodeLanguageclient.mod.TransportKind.socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocketTransport extends Transport {
  
  var kind: socket = js.native
  
  var port: Double = js.native
}
object SocketTransport {
  
  @scala.inline
  def apply(kind: socket, port: Double): SocketTransport = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketTransport]
  }
  
  @scala.inline
  implicit class SocketTransportMutableBuilder[Self <: SocketTransport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: socket): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
