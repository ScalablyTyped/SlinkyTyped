package typingsSlinky.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an audio track. */
@js.native
trait AudioTrack extends js.Object {
  /** Gets or sets the identifier for the audio track. */
  var id: String = js.native
  /** Gets or sets the label for the audio track. */
  var label: String = js.native
  /** Gets or sets a string indicating the language of the audio track. */
  var language: String = js.native
  /** Gets a value indicating the type of data the track contains. For AudioTrack objects, this value is always MediaTrackKind::Audio . */
  var trackKind: MediaTrackKind = js.native
}

object AudioTrack {
  @scala.inline
  def apply(id: String, label: String, language: String, trackKind: MediaTrackKind): AudioTrack = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], trackKind = trackKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioTrack]
  }
  @scala.inline
  implicit class AudioTrackOps[Self <: AudioTrack] (val x: Self) extends AnyVal {
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

