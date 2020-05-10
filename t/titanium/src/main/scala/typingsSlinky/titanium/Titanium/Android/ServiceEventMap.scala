package typingsSlinky.titanium.Titanium.Android

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceEventMap extends ProxyEventMap {
  var pause: ServicePauseEvent = js.native
  var resume: ServiceResumeEvent = js.native
  var start: ServiceStartEvent = js.native
  var stop: ServiceStopEvent = js.native
  var taskremoved: ServiceTaskremovedEvent = js.native
}

object ServiceEventMap {
  @scala.inline
  def apply(
    pause: ServicePauseEvent,
    resume: ServiceResumeEvent,
    start: ServiceStartEvent,
    stop: ServiceStopEvent,
    taskremoved: ServiceTaskremovedEvent
  ): ServiceEventMap = {
    val __obj = js.Dynamic.literal(pause = pause.asInstanceOf[js.Any], resume = resume.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any], taskremoved = taskremoved.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceEventMap]
  }
  @scala.inline
  implicit class ServiceEventMapOps[Self <: ServiceEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPause(value: ServicePauseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResume(value: ServiceResumeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: ServiceStartEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStop(value: ServiceStopEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskremoved(value: ServiceTaskremovedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskremoved")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

