package typingsSlinky.titanium.Titanium.UI.iOS

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimatorEventMap extends ProxyEventMap {
  var pause: AnimatorPauseEvent = js.native
  var resume: AnimatorResumeEvent = js.native
}

object AnimatorEventMap {
  @scala.inline
  def apply(pause: AnimatorPauseEvent, resume: AnimatorResumeEvent): AnimatorEventMap = {
    val __obj = js.Dynamic.literal(pause = pause.asInstanceOf[js.Any], resume = resume.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatorEventMap]
  }
  @scala.inline
  implicit class AnimatorEventMapOps[Self <: AnimatorEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPause(value: AnimatorPauseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResume(value: AnimatorResumeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

