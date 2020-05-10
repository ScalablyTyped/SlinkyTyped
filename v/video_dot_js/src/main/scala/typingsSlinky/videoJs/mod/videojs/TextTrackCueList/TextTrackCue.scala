package typingsSlinky.videoJs.mod.videojs.TextTrackCueList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see [Spec]{@link https://html.spec.whatwg.org/multipage/embedded-content.html#texttrackcue}
  */
@js.native
trait TextTrackCue extends js.Object {
  /**
    * The end time for this text track cue
    */
  var endTime: Double = js.native
  /**
    * The unique id for this text track cue
    */
  var id: String = js.native
  /**
    * Pause when the end time is reached if true.
    */
  var pauseOnExit: Boolean = js.native
  /**
    * The start time for this text track cue
    */
  var startTime: Double = js.native
  /**
    * The text this cue is holding
    */
  var text: String = js.native
}

object TextTrackCue {
  @scala.inline
  def apply(endTime: Double, id: String, pauseOnExit: Boolean, startTime: Double, text: String): TextTrackCue = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pauseOnExit = pauseOnExit.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTrackCue]
  }
  @scala.inline
  implicit class TextTrackCueOps[Self <: TextTrackCue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPauseOnExit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnExit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

