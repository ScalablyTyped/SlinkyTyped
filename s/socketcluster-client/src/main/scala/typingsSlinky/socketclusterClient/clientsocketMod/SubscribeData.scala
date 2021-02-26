package typingsSlinky.socketclusterClient.clientsocketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscribeData extends StObject {
  
  var channel: String = js.native
  
  var subscriptionOptions: SubscribeOptions = js.native
}
object SubscribeData {
  
  @scala.inline
  def apply(channel: String, subscriptionOptions: SubscribeOptions): SubscribeData = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], subscriptionOptions = subscriptionOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeData]
  }
  
  @scala.inline
  implicit class SubscribeDataMutableBuilder[Self <: SubscribeData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionOptions(value: SubscribeOptions): Self = StObject.set(x, "subscriptionOptions", value.asInstanceOf[js.Any])
  }
}
