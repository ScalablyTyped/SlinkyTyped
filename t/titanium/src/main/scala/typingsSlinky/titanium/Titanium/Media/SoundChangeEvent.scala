package typingsSlinky.titanium.Titanium.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the state of the playback changes.
		 */
@js.native
trait SoundChangeEvent extends SoundBaseEvent {
  /**
  			 * Text description of the state of playback.
  			 */
  var description: String = js.native
  /**
  			 * Current state of playback.
  			 */
  var state: Double = js.native
}

object SoundChangeEvent {
  @scala.inline
  def apply(description: String, source: Sound, state: Double): SoundChangeEvent = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundChangeEvent]
  }
  @scala.inline
  implicit class SoundChangeEventOps[Self <: SoundChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

