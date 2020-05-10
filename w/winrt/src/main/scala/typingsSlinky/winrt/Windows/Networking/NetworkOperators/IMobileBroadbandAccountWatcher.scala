package typingsSlinky.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMobileBroadbandAccountWatcher extends js.Object {
  var onaccountadded: js.Any = js.native
  var onaccountremoved: js.Any = js.native
  var onaccountupdated: js.Any = js.native
  var onenumerationcompleted: js.Any = js.native
  var onstopped: js.Any = js.native
  var status: MobileBroadbandAccountWatcherStatus = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native
}

object IMobileBroadbandAccountWatcher {
  @scala.inline
  def apply(
    onaccountadded: js.Any,
    onaccountremoved: js.Any,
    onaccountupdated: js.Any,
    onenumerationcompleted: js.Any,
    onstopped: js.Any,
    start: () => Unit,
    status: MobileBroadbandAccountWatcherStatus,
    stop: () => Unit
  ): IMobileBroadbandAccountWatcher = {
    val __obj = js.Dynamic.literal(onaccountadded = onaccountadded.asInstanceOf[js.Any], onaccountremoved = onaccountremoved.asInstanceOf[js.Any], onaccountupdated = onaccountupdated.asInstanceOf[js.Any], onenumerationcompleted = onenumerationcompleted.asInstanceOf[js.Any], onstopped = onstopped.asInstanceOf[js.Any], start = js.Any.fromFunction0(start), status = status.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[IMobileBroadbandAccountWatcher]
  }
  @scala.inline
  implicit class IMobileBroadbandAccountWatcherOps[Self <: IMobileBroadbandAccountWatcher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnaccountadded(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onaccountadded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnaccountremoved(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onaccountremoved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnaccountupdated(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onaccountupdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnenumerationcompleted(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onenumerationcompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnstopped(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onstopped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStatus(value: MobileBroadbandAccountWatcherStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

