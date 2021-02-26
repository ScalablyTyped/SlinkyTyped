package typingsSlinky.winrt.Windows.Networking.Sockets

import typingsSlinky.winrt.Windows.ApplicationModel.Background.IBackgroundTrigger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControlChannelTrigger extends IControlChannelTrigger {
  
  def dispose(): Unit = js.native
}
object ControlChannelTrigger {
  
  @scala.inline
  def apply(
    close: () => Unit,
    controlChannelTriggerId: String,
    currentKeepAliveIntervalInMinutes: Double,
    decreaseNetworkKeepAliveInterval: () => Unit,
    dispose: () => Unit,
    flushTransport: () => Unit,
    keepAliveTrigger: IBackgroundTrigger,
    pushNotificationTrigger: IBackgroundTrigger,
    serverKeepAliveIntervalInMinutes: Double,
    transportObject: js.Any,
    usingTransport: js.Any => Unit,
    waitForPushEnabled: () => ControlChannelTriggerStatus
  ): ControlChannelTrigger = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), controlChannelTriggerId = controlChannelTriggerId.asInstanceOf[js.Any], currentKeepAliveIntervalInMinutes = currentKeepAliveIntervalInMinutes.asInstanceOf[js.Any], decreaseNetworkKeepAliveInterval = js.Any.fromFunction0(decreaseNetworkKeepAliveInterval), dispose = js.Any.fromFunction0(dispose), flushTransport = js.Any.fromFunction0(flushTransport), keepAliveTrigger = keepAliveTrigger.asInstanceOf[js.Any], pushNotificationTrigger = pushNotificationTrigger.asInstanceOf[js.Any], serverKeepAliveIntervalInMinutes = serverKeepAliveIntervalInMinutes.asInstanceOf[js.Any], transportObject = transportObject.asInstanceOf[js.Any], usingTransport = js.Any.fromFunction1(usingTransport), waitForPushEnabled = js.Any.fromFunction0(waitForPushEnabled))
    __obj.asInstanceOf[ControlChannelTrigger]
  }
  
  @scala.inline
  implicit class ControlChannelTriggerMutableBuilder[Self <: ControlChannelTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
  }
}
