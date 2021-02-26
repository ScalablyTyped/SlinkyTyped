package typingsSlinky.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForwardedX11 extends StObject {
  
  var originAddr: String = js.native
  
  var originPort: Double = js.native
}
object ForwardedX11 {
  
  @scala.inline
  def apply(originAddr: String, originPort: Double): ForwardedX11 = {
    val __obj = js.Dynamic.literal(originAddr = originAddr.asInstanceOf[js.Any], originPort = originPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardedX11]
  }
  
  @scala.inline
  implicit class ForwardedX11MutableBuilder[Self <: ForwardedX11] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginAddr(value: String): Self = StObject.set(x, "originAddr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginPort(value: Double): Self = StObject.set(x, "originPort", value.asInstanceOf[js.Any])
  }
}
