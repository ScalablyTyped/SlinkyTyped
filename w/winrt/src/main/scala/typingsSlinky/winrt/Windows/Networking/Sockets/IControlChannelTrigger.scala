package typingsSlinky.winrt.Windows.Networking.Sockets

import typingsSlinky.winrt.Windows.ApplicationModel.Background.IBackgroundTrigger
import typingsSlinky.winrt.Windows.Foundation.IClosable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IControlChannelTrigger extends IClosable {
  var controlChannelTriggerId: String = js.native
  var currentKeepAliveIntervalInMinutes: Double = js.native
  var keepAliveTrigger: IBackgroundTrigger = js.native
  var pushNotificationTrigger: IBackgroundTrigger = js.native
  var serverKeepAliveIntervalInMinutes: Double = js.native
  var transportObject: js.Any = js.native
  def decreaseNetworkKeepAliveInterval(): Unit = js.native
  def flushTransport(): Unit = js.native
  def usingTransport(transport: js.Any): Unit = js.native
  def waitForPushEnabled(): ControlChannelTriggerStatus = js.native
}

object IControlChannelTrigger {
  @scala.inline
  def apply(
    close: () => Unit,
    controlChannelTriggerId: String,
    currentKeepAliveIntervalInMinutes: Double,
    decreaseNetworkKeepAliveInterval: () => Unit,
    flushTransport: () => Unit,
    keepAliveTrigger: IBackgroundTrigger,
    pushNotificationTrigger: IBackgroundTrigger,
    serverKeepAliveIntervalInMinutes: Double,
    transportObject: js.Any,
    usingTransport: js.Any => Unit,
    waitForPushEnabled: () => ControlChannelTriggerStatus
  ): IControlChannelTrigger = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), controlChannelTriggerId = controlChannelTriggerId.asInstanceOf[js.Any], currentKeepAliveIntervalInMinutes = currentKeepAliveIntervalInMinutes.asInstanceOf[js.Any], decreaseNetworkKeepAliveInterval = js.Any.fromFunction0(decreaseNetworkKeepAliveInterval), flushTransport = js.Any.fromFunction0(flushTransport), keepAliveTrigger = keepAliveTrigger.asInstanceOf[js.Any], pushNotificationTrigger = pushNotificationTrigger.asInstanceOf[js.Any], serverKeepAliveIntervalInMinutes = serverKeepAliveIntervalInMinutes.asInstanceOf[js.Any], transportObject = transportObject.asInstanceOf[js.Any], usingTransport = js.Any.fromFunction1(usingTransport), waitForPushEnabled = js.Any.fromFunction0(waitForPushEnabled))
    __obj.asInstanceOf[IControlChannelTrigger]
  }
  @scala.inline
  implicit class IControlChannelTriggerOps[Self <: IControlChannelTrigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControlChannelTriggerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlChannelTriggerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentKeepAliveIntervalInMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentKeepAliveIntervalInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecreaseNetworkKeepAliveInterval(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decreaseNetworkKeepAliveInterval")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFlushTransport(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flushTransport")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKeepAliveTrigger(value: IBackgroundTrigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAliveTrigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPushNotificationTrigger(value: IBackgroundTrigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushNotificationTrigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerKeepAliveIntervalInMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverKeepAliveIntervalInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransportObject(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsingTransport(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usingTransport")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWaitForPushEnabled(value: () => ControlChannelTriggerStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForPushEnabled")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

