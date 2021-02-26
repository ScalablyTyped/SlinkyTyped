package typingsSlinky.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TcpipForwardGlobalRequest extends _GlobalRequest {
  
  /**
    * The IP address to start/stop binding to.
    */
  var bindAddr: String = js.native
  
  /**
    * The port to start/stop binding to.
    */
  var bindPort: Double = js.native
}
object TcpipForwardGlobalRequest {
  
  @scala.inline
  def apply(bindAddr: String, bindPort: Double): TcpipForwardGlobalRequest = {
    val __obj = js.Dynamic.literal(bindAddr = bindAddr.asInstanceOf[js.Any], bindPort = bindPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpipForwardGlobalRequest]
  }
  
  @scala.inline
  implicit class TcpipForwardGlobalRequestMutableBuilder[Self <: TcpipForwardGlobalRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindAddr(value: String): Self = StObject.set(x, "bindAddr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindPort(value: Double): Self = StObject.set(x, "bindPort", value.asInstanceOf[js.Any])
  }
}
