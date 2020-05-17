package typingsSlinky.winrtUwp.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the format of a video stream. */
@js.native
trait VideoEncodingProperties extends js.Object {
  /** Gets or sets the video bit rate. */
  var bitrate: Double = js.native
  /** Gets or sets the video frame rate. */
  var frameRate: MediaRatio = js.native
  /** Gets or sets the video image height. */
  var height: Double = js.native
  /** Gets or sets the pixel aspect ratio. */
  var pixelAspectRatio: MediaRatio = js.native
  /** Gets or sets the media format profile. */
  var profileId: Double = js.native
  /** Gets additional format properties for the video stream. */
  var properties: MediaPropertySet = js.native
  /** Gets or sets the subtype of the format. */
  var subtype: String = js.native
  /** Gets the format type. */
  var `type`: String = js.native
  /** Gets or sets the video image width. */
  var width: Double = js.native
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

object VideoEncodingProperties {
  @scala.inline
  def apply(
    bitrate: Double,
    frameRate: MediaRatio,
    getFormatUserData: () => js.Array[Double],
    height: Double,
    pixelAspectRatio: MediaRatio,
    profileId: Double,
    properties: MediaPropertySet,
    setFormatUserData: js.Array[Double] => Unit,
    subtype: String,
    `type`: String,
    width: Double
  ): VideoEncodingProperties = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], frameRate = frameRate.asInstanceOf[js.Any], getFormatUserData = js.Any.fromFunction0(getFormatUserData), height = height.asInstanceOf[js.Any], pixelAspectRatio = pixelAspectRatio.asInstanceOf[js.Any], profileId = profileId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], setFormatUserData = js.Any.fromFunction1(setFormatUserData), subtype = subtype.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoEncodingProperties]
  }
  @scala.inline
  implicit class VideoEncodingPropertiesOps[Self <: VideoEncodingProperties] (val x: Self) extends AnyVal {
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
    def withFrameRate(value: MediaRatio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetFormatUserData(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormatUserData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixelAspectRatio(value: MediaRatio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfileId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: MediaPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

