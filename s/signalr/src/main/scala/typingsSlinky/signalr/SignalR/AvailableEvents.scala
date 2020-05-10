package typingsSlinky.signalr.SignalR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailableEvents extends js.Object {
  var onConnectionSlow: String = js.native
  var onDisconnect: String = js.native
  var onError: String = js.native
  var onReceived: String = js.native
  var onReconnect: String = js.native
  var onStart: String = js.native
  var onStarting: String = js.native
  var onStateChanged: String = js.native
}

object AvailableEvents {
  @scala.inline
  def apply(
    onConnectionSlow: String,
    onDisconnect: String,
    onError: String,
    onReceived: String,
    onReconnect: String,
    onStart: String,
    onStarting: String,
    onStateChanged: String
  ): AvailableEvents = {
    val __obj = js.Dynamic.literal(onConnectionSlow = onConnectionSlow.asInstanceOf[js.Any], onDisconnect = onDisconnect.asInstanceOf[js.Any], onError = onError.asInstanceOf[js.Any], onReceived = onReceived.asInstanceOf[js.Any], onReconnect = onReconnect.asInstanceOf[js.Any], onStart = onStart.asInstanceOf[js.Any], onStarting = onStarting.asInstanceOf[js.Any], onStateChanged = onStateChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailableEvents]
  }
  @scala.inline
  implicit class AvailableEventsOps[Self <: AvailableEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnConnectionSlow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnectionSlow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDisconnect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisconnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnReceived(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReceived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnReconnect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReconnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnStarting(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStarting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnStateChanged(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStateChanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

