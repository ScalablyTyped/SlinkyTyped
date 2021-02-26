package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Incoming extends StObject {
  
  var inProgress: scala.Double = js.native
  
  var incoming: scala.Double = js.native
  
  var outgoing: scala.Double = js.native
}
object Incoming {
  
  @scala.inline
  def apply(inProgress: scala.Double, incoming: scala.Double, outgoing: scala.Double): Incoming = {
    val __obj = js.Dynamic.literal(inProgress = inProgress.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Incoming]
  }
  
  @scala.inline
  implicit class IncomingMutableBuilder[Self <: Incoming] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInProgress(value: scala.Double): Self = StObject.set(x, "inProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncoming(value: scala.Double): Self = StObject.set(x, "incoming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutgoing(value: scala.Double): Self = StObject.set(x, "outgoing", value.asInstanceOf[js.Any])
  }
}
