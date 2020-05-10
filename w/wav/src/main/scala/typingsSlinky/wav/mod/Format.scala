package typingsSlinky.wav.mod

import typingsSlinky.wav.wavStrings.BE
import typingsSlinky.wav.wavStrings.LE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Format extends js.Object {
  var audioFormat: Double = js.native
  var bitDepth: Double = js.native
  var blockAlign: Double = js.native
  var byteRate: Double = js.native
  var channels: Double = js.native
  var endianness: LE | BE = js.native
  var sampleRate: Double = js.native
  var signed: Boolean = js.native
}

object Format {
  @scala.inline
  def apply(
    audioFormat: Double,
    bitDepth: Double,
    blockAlign: Double,
    byteRate: Double,
    channels: Double,
    endianness: LE | BE,
    sampleRate: Double,
    signed: Boolean
  ): Format = {
    val __obj = js.Dynamic.literal(audioFormat = audioFormat.asInstanceOf[js.Any], bitDepth = bitDepth.asInstanceOf[js.Any], blockAlign = blockAlign.asInstanceOf[js.Any], byteRate = byteRate.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], endianness = endianness.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any], signed = signed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
  @scala.inline
  implicit class FormatOps[Self <: Format] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioFormat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBitDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockAlign(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withByteRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndianness(value: LE | BE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endianness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSampleRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

