package typingsSlinky.webcl.WEBCL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.10
@js.native
trait WebCLEvent extends js.Object {
  def getInfo(name: EventInfo): js.Any = js.native
  def getProfilingInfo(name: ProfilingInfo): Double = js.native
  def release(): Unit = js.native
  def setCallback(commandExecCallbackType: CommandExecutionStatus, notify: WebCLCallback): Unit = js.native
}

object WebCLEvent {
  @scala.inline
  def apply(
    getInfo: EventInfo => js.Any,
    getProfilingInfo: ProfilingInfo => Double,
    release: () => Unit,
    setCallback: (CommandExecutionStatus, WebCLCallback) => Unit
  ): WebCLEvent = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction1(getInfo), getProfilingInfo = js.Any.fromFunction1(getProfilingInfo), release = js.Any.fromFunction0(release), setCallback = js.Any.fromFunction2(setCallback))
    __obj.asInstanceOf[WebCLEvent]
  }
  @scala.inline
  implicit class WebCLEventOps[Self <: WebCLEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetInfo(value: EventInfo => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetProfilingInfo(value: ProfilingInfo => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProfilingInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRelease(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetCallback(value: (CommandExecutionStatus, WebCLCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCallback")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

