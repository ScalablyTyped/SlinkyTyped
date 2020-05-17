package typingsSlinky.winrtUwp.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the format of an audio stream. */
@js.native
trait AudioEncodingProperties extends js.Object {
  /** Gets or sets the audio bit rate. */
  var bitrate: Double = js.native
  /** Gets or sets the number of bits per audio sample. */
  var bitsPerSample: Double = js.native
  /** Gets or sets the number of audio channels. */
  var channelCount: Double = js.native
  /** Gets additional format properties for the audio stream. */
  var properties: MediaPropertySet = js.native
  /** Gets or sets audio sampling rate. */
  var sampleRate: Double = js.native
  /** Gets or sets the subtype of the format. */
  var subtype: String = js.native
  /** Gets the format type. */
  var `type`: String = js.native
  /**
    * Gets the media format user data.
    * @return Receives the media format data.
    */
  def getFormatUserData(): js.Array[Double] = js.native
  /**
    * Sets the media format user data.
    * @param value The media data to set.
    */
  def setFormatUserData(value: js.Array[Double]): Unit = js.native
}

object AudioEncodingProperties {
  @scala.inline
  def apply(
    bitrate: Double,
    bitsPerSample: Double,
    channelCount: Double,
    getFormatUserData: () => js.Array[Double],
    properties: MediaPropertySet,
    sampleRate: Double,
    setFormatUserData: js.Array[Double] => Unit,
    subtype: String,
    `type`: String
  ): AudioEncodingProperties = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], bitsPerSample = bitsPerSample.asInstanceOf[js.Any], channelCount = channelCount.asInstanceOf[js.Any], getFormatUserData = js.Any.fromFunction0(getFormatUserData), properties = properties.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any], setFormatUserData = js.Any.fromFunction1(setFormatUserData), subtype = subtype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioEncodingProperties]
  }
  @scala.inline
  implicit class AudioEncodingPropertiesOps[Self <: AudioEncodingProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBitrate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBitsPerSample(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitsPerSample")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannelCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetFormatUserData(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormatUserData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withProperties(value: MediaPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSampleRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetFormatUserData(value: js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFormatUserData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubtype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

