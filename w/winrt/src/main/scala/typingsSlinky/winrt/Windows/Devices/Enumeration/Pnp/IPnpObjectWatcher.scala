package typingsSlinky.winrt.Windows.Devices.Enumeration.Pnp

import typingsSlinky.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPnpObjectWatcher extends js.Object {
  var onadded: js.Any = js.native
  var onenumerationcompleted: js.Any = js.native
  var onremoved: js.Any = js.native
  var onstopped: js.Any = js.native
  var onupdated: js.Any = js.native
  var status: DeviceWatcherStatus = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native
}

object IPnpObjectWatcher {
  @scala.inline
  def apply(
    onadded: js.Any,
    onenumerationcompleted: js.Any,
    onremoved: js.Any,
    onstopped: js.Any,
    onupdated: js.Any,
    start: () => Unit,
    status: DeviceWatcherStatus,
    stop: () => Unit
  ): IPnpObjectWatcher = {
    val __obj = js.Dynamic.literal(onadded = onadded.asInstanceOf[js.Any], onenumerationcompleted = onenumerationcompleted.asInstanceOf[js.Any], onremoved = onremoved.asInstanceOf[js.Any], onstopped = onstopped.asInstanceOf[js.Any], onupdated = onupdated.asInstanceOf[js.Any], start = js.Any.fromFunction0(start), status = status.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[IPnpObjectWatcher]
  }
  @scala.inline
  implicit class IPnpObjectWatcherOps[Self <: IPnpObjectWatcher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnadded(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onadded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnenumerationcompleted(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onenumerationcompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnremoved(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onremoved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnstopped(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onstopped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnupdated(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onupdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStatus(value: DeviceWatcherStatus): Self = {
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

