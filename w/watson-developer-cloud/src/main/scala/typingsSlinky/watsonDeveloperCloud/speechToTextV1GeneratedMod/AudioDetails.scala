package typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** AudioDetails. */
@js.native
trait AudioDetails extends js.Object {
  /** **For an audio-type resource,** the codec in which the audio is encoded. Omitted for an archive-type resource. */
  var codec: js.UndefOr[String] = js.native
  /** **For an archive-type resource,** the format of the compressed archive: * `zip` for a **.zip** file * `gzip` for a **.tar.gz** file Omitted for an audio-type resource. */
  var compression: js.UndefOr[String] = js.native
  /** **For an audio-type resource,** the sampling rate of the audio in Hertz (samples per second). Omitted for an archive-type resource. */
  var frequency: js.UndefOr[Double] = js.native
  /** The type of the audio resource: * `audio` for an individual audio file * `archive` for an archive (**.zip** or **.tar.gz**) file that contains audio files * `undetermined` for a resource that the service cannot validate (for example, if the user mistakenly passes a file that does not contain audio, such as a JPEG file). */
  var `type`: js.UndefOr[String] = js.native
}

object AudioDetails {
  @scala.inline
  def apply(): AudioDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioDetails]
  }
  @scala.inline
  implicit class AudioDetailsOps[Self <: AudioDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec")(js.undefined)
        ret
    }
    @scala.inline
    def withCompression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(js.undefined)
        ret
    }
    @scala.inline
    def withFrequency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

