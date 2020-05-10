package typingsSlinky.smoothScrollbar.trackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackController extends js.Object {
  val xAxis: ScrollbarTrack = js.native
  val yAxis: ScrollbarTrack = js.native
  def autoHideOnIdle(): Unit = js.native
  def update(): Unit = js.native
}

object TrackController {
  @scala.inline
  def apply(autoHideOnIdle: () => Unit, update: () => Unit, xAxis: ScrollbarTrack, yAxis: ScrollbarTrack): TrackController = {
    val __obj = js.Dynamic.literal(autoHideOnIdle = js.Any.fromFunction0(autoHideOnIdle), update = js.Any.fromFunction0(update), xAxis = xAxis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackController]
  }
  @scala.inline
  implicit class TrackControllerOps[Self <: TrackController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoHideOnIdle(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHideOnIdle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withXAxis(value: ScrollbarTrack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYAxis(value: ScrollbarTrack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxis")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

