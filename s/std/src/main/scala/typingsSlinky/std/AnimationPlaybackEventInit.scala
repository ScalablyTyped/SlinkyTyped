package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationPlaybackEventInit extends EventInit {
  var currentTime: js.UndefOr[Double | Null] = js.native
  var timelineTime: js.UndefOr[Double | Null] = js.native
}

object AnimationPlaybackEventInit {
  @scala.inline
  def apply(): AnimationPlaybackEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationPlaybackEventInit]
  }
  @scala.inline
  implicit class AnimationPlaybackEventInitOps[Self <: AnimationPlaybackEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentTimeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(null)
        ret
    }
    @scala.inline
    def withTimelineTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timelineTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimelineTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timelineTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTimelineTimeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timelineTime")(null)
        ret
    }
  }
  
}

