package typingsSlinky.smartFoxServer.SFS2X

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICONNECTION_LOST extends StObject {
  
  var reason: String = js.native
}
object ICONNECTION_LOST {
  
  @scala.inline
  def apply(reason: String): ICONNECTION_LOST = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICONNECTION_LOST]
  }
  
  @scala.inline
  implicit class ICONNECTION_LOSTMutableBuilder[Self <: ICONNECTION_LOST] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
