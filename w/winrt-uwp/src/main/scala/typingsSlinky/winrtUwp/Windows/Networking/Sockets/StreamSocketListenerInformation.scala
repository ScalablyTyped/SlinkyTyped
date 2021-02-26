package typingsSlinky.winrtUwp.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides socket information on a StreamSocketListener object. */
@js.native
trait StreamSocketListenerInformation extends StObject {
  
  /** Get the local TCP port number associated with a StreamSocketListener object. */
  var localPort: String = js.native
}
object StreamSocketListenerInformation {
  
  @scala.inline
  def apply(localPort: String): StreamSocketListenerInformation = {
    val __obj = js.Dynamic.literal(localPort = localPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSocketListenerInformation]
  }
  
  @scala.inline
  implicit class StreamSocketListenerInformationMutableBuilder[Self <: StreamSocketListenerInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalPort(value: String): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
  }
}
