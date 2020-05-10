package typingsSlinky.titanium.Titanium.Media

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoundEventMap extends ProxyEventMap {
  var change: SoundChangeEvent = js.native
  var complete: SoundCompleteEvent = js.native
  var error: SoundErrorEvent = js.native
  var interrupted: SoundInterruptedEvent = js.native
  var resume: SoundResumeEvent = js.native
}

object SoundEventMap {
  @scala.inline
  def apply(
    change: SoundChangeEvent,
    complete: SoundCompleteEvent,
    error: SoundErrorEvent,
    interrupted: SoundInterruptedEvent,
    resume: SoundResumeEvent
  ): SoundEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], interrupted = interrupted.asInstanceOf[js.Any], resume = resume.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundEventMap]
  }
  @scala.inline
  implicit class SoundEventMapOps[Self <: SoundEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChange(value: SoundChangeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComplete(value: SoundCompleteEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: SoundErrorEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterrupted(value: SoundInterruptedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interrupted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResume(value: SoundResumeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

