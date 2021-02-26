package typingsSlinky.socketclusterClient.clientsocketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscribeFailData extends StObject {
  
  var channel: String = js.native
  
  var error: js.Error = js.native
  
  var subscriptionOptions: SubscribeOptions = js.native
}
object SubscribeFailData {
  
  @scala.inline
  def apply(channel: String, error: js.Error, subscriptionOptions: SubscribeOptions): SubscribeFailData = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], subscriptionOptions = subscriptionOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeFailData]
  }
  
  @scala.inline
  implicit class SubscribeFailDataMutableBuilder[Self <: SubscribeFailData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionOptions(value: SubscribeOptions): Self = StObject.set(x, "subscriptionOptions", value.asInstanceOf[js.Any])
  }
}
