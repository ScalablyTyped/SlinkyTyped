package typingsSlinky.titanium.Titanium.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when audio playback is resumed after an interruption.
		 */
@js.native
trait SoundResumeEvent extends SoundBaseEvent {
  /**
  			 * Indicates if the resume was from an interruption.
  			 */
  var interruption: Boolean = js.native
}

object SoundResumeEvent {
  @scala.inline
  def apply(interruption: Boolean, source: Sound): SoundResumeEvent = {
    val __obj = js.Dynamic.literal(interruption = interruption.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundResumeEvent]
  }
  @scala.inline
  implicit class SoundResumeEventOps[Self <: SoundResumeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterruption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interruption")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

