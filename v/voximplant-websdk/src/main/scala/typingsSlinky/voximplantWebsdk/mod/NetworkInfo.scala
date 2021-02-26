package typingsSlinky.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Network information
  */
@js.native
trait NetworkInfo extends StObject {
  
  /**
    *    Packet loss percentage
    */
  var packetLoss: Double = js.native
}
object NetworkInfo {
  
  @scala.inline
  def apply(packetLoss: Double): NetworkInfo = {
    val __obj = js.Dynamic.literal(packetLoss = packetLoss.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInfo]
  }
  
  @scala.inline
  implicit class NetworkInfoMutableBuilder[Self <: NetworkInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPacketLoss(value: Double): Self = StObject.set(x, "packetLoss", value.asInstanceOf[js.Any])
  }
}
