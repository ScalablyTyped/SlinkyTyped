package typingsSlinky.winrtUwp.Windows.Media.Playback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a marker at specific location in a media stream time-line. */
@js.native
trait PlaybackMediaMarker extends js.Object {
  /** Gets the type of the media marker. */
  var mediaMarkerType: String = js.native
  /** Gets the text associated with the marker. */
  var text: String = js.native
  /** Gets the offset in the media timeline where the marker occurs. */
  var time: Double = js.native
}

object PlaybackMediaMarker {
  @scala.inline
  def apply(mediaMarkerType: String, text: String, time: Double): PlaybackMediaMarker = {
    val __obj = js.Dynamic.literal(mediaMarkerType = mediaMarkerType.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackMediaMarker]
  }
  @scala.inline
  implicit class PlaybackMediaMarkerOps[Self <: PlaybackMediaMarker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMediaMarkerType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaMarkerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

