package typingsSlinky.zetapushJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionStatusListener extends js.Object {
  def onConnectionBroken(): Unit = js.native
  def onConnectionClosed(): Unit = js.native
  def onConnectionEstablished(): Unit = js.native
  def onConnectionToServerFail(failure: js.Any): Unit = js.native
  def onConnectionWillClose(): Unit = js.native
  def onFailedHandshake(failure: js.Any): Unit = js.native
  def onMessageLost(): Unit = js.native
  def onNegotiationFailed(failure: js.Any): Unit = js.native
  def onNoServerUrlAvailable(): Unit = js.native
  def onSuccessfulHandshake(authentication: js.Any): Unit = js.native
}

object ConnectionStatusListener {
  @scala.inline
  def apply(
    onConnectionBroken: () => Unit,
    onConnectionClosed: () => Unit,
    onConnectionEstablished: () => Unit,
    onConnectionToServerFail: js.Any => Unit,
    onConnectionWillClose: () => Unit,
    onFailedHandshake: js.Any => Unit,
    onMessageLost: () => Unit,
    onNegotiationFailed: js.Any => Unit,
    onNoServerUrlAvailable: () => Unit,
    onSuccessfulHandshake: js.Any => Unit
  ): ConnectionStatusListener = {
    val __obj = js.Dynamic.literal(onConnectionBroken = js.Any.fromFunction0(onConnectionBroken), onConnectionClosed = js.Any.fromFunction0(onConnectionClosed), onConnectionEstablished = js.Any.fromFunction0(onConnectionEstablished), onConnectionToServerFail = js.Any.fromFunction1(onConnectionToServerFail), onConnectionWillClose = js.Any.fromFunction0(onConnectionWillClose), onFailedHandshake = js.Any.fromFunction1(onFailedHandshake), onMessageLost = js.Any.fromFunction0(onMessageLost), onNegotiationFailed = js.Any.fromFunction1(onNegotiationFailed), onNoServerUrlAvailable = js.Any.fromFunction0(onNoServerUrlAvailable), onSuccessfulHandshake = js.Any.fromFunction1(onSuccessfulHandshake))
    __obj.asInstanceOf[ConnectionStatusListener]
  }
  @scala.inline
  implicit class ConnectionStatusListenerOps[Self <: ConnectionStatusListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnConnectionBroken(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnectionBroken")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnConnectionClosed(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnectionClosed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnConnectionEstablished(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnectionEstablished")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnConnectionToServerFail(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnectionToServerFail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnConnectionWillClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnectionWillClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnFailedHandshake(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFailedHandshake")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnMessageLost(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMessageLost")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnNegotiationFailed(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNegotiationFailed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnNoServerUrlAvailable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNoServerUrlAvailable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnSuccessfulHandshake(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccessfulHandshake")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

