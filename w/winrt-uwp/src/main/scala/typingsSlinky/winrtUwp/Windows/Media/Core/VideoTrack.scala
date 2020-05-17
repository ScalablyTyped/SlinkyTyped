package typingsSlinky.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a video track. */
@js.native
trait VideoTrack extends js.Object {
  /** Gets or sets the identifier for the video track. */
  var id: String = js.native
  /** Gets or sets the label for the video track. */
  var label: String = js.native
  /** Gets or sets a string indicating the language of the video track. */
  var language: String = js.native
  /** Gets a value indicating the type of data the track contains. For VideoTrack objects, this value is always MediaTrackKind::Video . */
  var trackKind: MediaTrackKind = js.native
}

object VideoTrack {
  @scala.inline
  def apply(id: String, label: String, language: String, trackKind: MediaTrackKind): VideoTrack = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], trackKind = trackKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoTrack]
  }
  @scala.inline
  implicit class VideoTrackOps[Self <: VideoTrack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackKind(value: MediaTrackKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackKind")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

