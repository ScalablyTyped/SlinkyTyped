package typingsSlinky.titanium.Titanium.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when there's an error.
		 */
@js.native
trait AudioPlayerErrorEvent extends AudioPlayerBaseEvent {
  /**
  			 * Error code. Different between android and iOS.
  			 */
  var code: Double = js.native
  /**
  			 * Error message.
  			 */
  var error: String = js.native
}

object AudioPlayerErrorEvent {
  @scala.inline
  def apply(code: Double, error: String, source: AudioPlayer): AudioPlayerErrorEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioPlayerErrorEvent]
  }
  @scala.inline
  implicit class AudioPlayerErrorEventOps[Self <: AudioPlayerErrorEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

