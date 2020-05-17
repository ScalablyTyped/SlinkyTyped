package typingsSlinky.winrtUwp.Windows.Media.Editing

import typingsSlinky.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an audio track embedded in the media clip. */
@js.native
trait EmbeddedAudioTrack extends js.Object {
  /**
    * Gets the AudioEncodingProperties for the embedded audio track.
    * @return The AudioEncodingProperties for the embedded audio track.
    */
  def getAudioEncodingProperties(): AudioEncodingProperties = js.native
}

object EmbeddedAudioTrack {
  @scala.inline
  def apply(getAudioEncodingProperties: () => AudioEncodingProperties): EmbeddedAudioTrack = {
    val __obj = js.Dynamic.literal(getAudioEncodingProperties = js.Any.fromFunction0(getAudioEncodingProperties))
    __obj.asInstanceOf[EmbeddedAudioTrack]
  }
  @scala.inline
  implicit class EmbeddedAudioTrackOps[Self <: EmbeddedAudioTrack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAudioEncodingProperties(value: () => AudioEncodingProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAudioEncodingProperties")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

